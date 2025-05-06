# SauceDemo Testing Project

This project includes test cases for the website [SauceDemo](https://www.saucedemo.com) using **Java**, **Selenium WebDriver**, and **TestNG**.

## 🔧 Tools Used
- Java
- Selenium WebDriver
- TestNG
- Microsoft Edge (EdgeDriver)

---

## 🔍 Test Cases

### 1. `LoginTest()`
Logs in to the application using:
- Username: `standard_user`
- Password: `secret_sauce`

---

### 2. `OneItem()`
- Adds one item (Backpack) to the cart.
- Then removes it from the cart.

---

### 3. `ProductSort()`
- Sorts the products from Z to A using the dropdown menu.

---

### 4. `AddAllItemToTheCart()`
- Adds all available products on the page to the shopping cart by clicking all "Add to cart" buttons.

---

### 5. `PrintAllItemsInfo()`
- Prints for each product:
  - Name
  - Price
  - Description

---

### 6. `AddRandomItemToCartTest()`
- Chooses a random product and adds it to the cart.

---

### 7. `CheckoutFlowTest()`
- Opens the cart and clicks checkout.
- Fills in:
  - First Name: `Noor`
  - Last Name: `Awdat`
  - Postal Code: `12345`
- Continues and completes the order.
- Returns to the product page.

---

### 8. `LogoutTest()`
- Opens the side menu and logs out from the application.

---

## 🚀 How to Run

Make sure you have:
- Selenium and TestNG set up in your Java project
- EdgeDriver installed and added to system path

Run the test class `MyTest.java` using TestNG.

---


