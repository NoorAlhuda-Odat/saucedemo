import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest {
	WebDriver driver = new EdgeDriver();
	String URL ="https://www.saucedemo.com";
	String userName ="standard_user";
	String password = "secret_sauce";

		@BeforeTest
		public void MySetup(){
			driver.get(URL);
			driver.manage().window().maximize();
		}
		
		@Test(priority = 1)
		public void LoginTest() throws InterruptedException {
			WebElement UserNameInputField = driver.findElement(By.id("user-name"));
			WebElement PasswordInputField = driver.findElement(By.id("password"));
			WebElement LoginButton = driver.findElement(By.id("login-button"));
			
			UserNameInputField.sendKeys(userName);
			PasswordInputField.sendKeys(password);
			LoginButton.click();
			Thread.sleep(1000);
		}
		
		@Test(priority = 2)
		public void OneItem () throws InterruptedException {
			WebElement ItemToAdd =driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			ItemToAdd.click();
			Thread.sleep(1000);
			
			WebElement ItemToRemove =driver.findElement(By.id("remove-sauce-labs-backpack"));
			ItemToRemove.click();
			Thread.sleep(1000);
		}
		
		@Test(priority = 3)
		public void ProductSort() throws InterruptedException {
			WebElement SortDropdown = driver.findElement(By.className("product_sort_container"));
	        Select select = new Select(SortDropdown);
	        select.selectByValue("za");
		}
		
		@Test(priority = 4)
		public void AddAllItemToTheCart() {
	    List <WebElement> AddToCartButtons=	driver.findElements(By.className("btn"));
				for(int i = 0 ; i < AddToCartButtons.size();i++) {
				AddToCartButtons.get(i).click();
				}
		}
		
		@Test(priority = 5)
		public void PrintAllItemsInfo() {
			List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));
			List<WebElement> ItemsNames = driver.findElements(By.className("inventory_item_name"));
			List<WebElement> ItemsPrices = driver.findElements(By.className("inventory_item_price"));
			List<WebElement> ItemsDesc = driver.findElements(By.className("inventory_item_desc"));
	 
			for (int i = 0; i < AddToCartButtons.size(); i++) {
			     System.out.println(ItemsNames.get(i).getText() + " has been added to the cart with the amount of "
			+ ItemsPrices.get(i).getText() + " the desc for the item is " + ItemsDesc.get(i).getText());
			
			}
		}
		
		@Test(priority = 6)
		public void AddRandomItemToCartTest() {
		    List<WebElement> AddToCartButtons = driver.findElements(By.className("btn"));

		    Random rand = new Random();
		    int RandomIndex = rand.nextInt(AddToCartButtons.size());

		    AddToCartButtons.get(RandomIndex).click();
		}
		
	
		@Test(priority = 7)
		public void CheckoutFlowTest() throws InterruptedException {
		    WebElement cartIcon = driver.findElement(By.className("shopping_cart_link"));
		    cartIcon.click();
		    Thread.sleep(1000);
		    
		    WebElement checkoutButton = driver.findElement(By.id("checkout"));
		    checkoutButton.click();
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("first-name")).sendKeys("Noor");
		    driver.findElement(By.id("last-name")).sendKeys("Awdat");
		    driver.findElement(By.id("postal-code")).sendKeys("12345");
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("continue")).click();
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("finish")).click();
		    Thread.sleep(1000);
		    
		    driver.findElement(By.id("back-to-products")).click();
		   
		}
		
		@Test(priority = 8)
		public void LogoutTest() throws InterruptedException {
			WebElement BurgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
			BurgerMenu.click();
			Thread.sleep(1000);
			WebElement logoutLink = driver.findElement(By.id("logout_sidebar_link"));
			logoutLink.click();

		}
}
