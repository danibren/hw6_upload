package com.example;
// if driver can't function use import driver selenium driver here
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Actionwords {

    public void typingCorrectURLToTheBrowser(String uRL) {
        //Type to Browser var URL
        //Check logged in by URL Login Page , var url here
        WebDriver driver = new ChromeDriver();
        //inventory page url
        String urlPage = "https://www.saucedemo.com"; 
        //assert / compare here
        String urlBrowser = driver.getCurrentUrl();
        Assert.assertEquals(urlPage, urlBrowser);
    }

    public void userLoggedIn() {
        //Check logged in by URL homepage , var url here
        WebDriver driver = new ChromeDriver();
        //inventory page url
        String urlPage = "https://www.saucedemo.com/inventory.html"; 
        //assert / compare here
        String urlBrowser = driver.getCurrentUrl();
        Assert.assertEquals(urlPage, urlBrowser);
    }

    public void showTheSauceDemoHomePage() {
        //Check logged in by URL homepage , var url here
        WebDriver driver = new ChromeDriver();
        //inventory page url
        String urlPage = "https://www.saucedemo.com/inventory.html"; 
        //assert / compare here
        String urlBrowser = driver.getCurrentUrl();
        Assert.assertEquals(urlPage, urlBrowser);
    }

    public void userClickLoginButton() {
        // Click Element Button Login
        WebElement button = driver.findElement(By.xpath("//button[@data-test=login-button]"));
        button.click();
    }

    public void userInputValidPassword(String freeText, DataTable datatable) {
        // Type Element Input Password
        WebElement password = driver.findElement(By.xpath("//input[@data-test=password]")) ; 
        password.sendKeys(datatable);
    }

    public void userInputValidUsername(DataTable datatable, String freeText) {
        // Type Element input Username
        WebElement username = driver.findElement(By.xpath("//input[@data-test=username]")) ; 
        username.sendKeys(datatable);
    }

    public void userInputNOTValidPassword(String freeText, DataTable datatable) {
        // Type Element Input Password
        WebElement password = driver.findElement(By.xpath("//input[@data-test=password]")) ; 
        password.sendKeys(datatable);
    }

    public void userCANTLogin() {
        // Check Login Error Messages
        WebElement messages = driver.findElement(By.xpath("//button[@data-test=error]"));
        Assert.assertEquals(true, messages);
    }

    public void userClickAProductItem() {
        // Click Element Product here
        WebElement button = driver.findElement(By.xpath("//button[@data-test=add-to-cart-sauce-labs-bike-light]"));
        button.click();
    }

    public void numberInCartsIconIncrease() {
        // Check Number Cart Icon Here
        // shopping_cart_badge
        WebElement badge = driver.findElement(By.className("shopping_cart_badge"));
        Assert.assertEquals(true, badge);
    }

    public void userAddAProductToTheCart() {
        // Click Element Product here
        WebElement button = driver.findElement(By.xpath("//button[@data-test=add-to-cart-sauce-labs-bike-light]")); 
        button.click();
    }

    public void userClickCartsIcon() {
        // Click Element Cart Icon Here
        WebElement button = driver.findElement(By.className("shopping_cart_link"));
        button.click();
    }

    public void userClickCheckoutButton() {
        // Click Element Checkout Button here
        WebElement button = driver.findElement(By.xpath("//button[@data-test=checkout]"));
        button.click();
    }

    public void showCheckoutRespondMessages() {
        // Check Element Respond Message
         WebElement messages = driver.findElement(By.className("complete-text"));
         Assert.assertEquals(true, messages);
    }

    public void showPageYourInformationPage() {
        // Check Page by Url here
        //Check logged in by URL homepage , var url here
        WebDriver driver = new ChromeDriver();
        //checkout:your-information page url
        String urlPage = "https://www.saucedemo.com/checkout-step-one.html"; 
        //assert / compare here
        String urlBrowser = driver.getCurrentUrl();
        Assert.assertEquals(urlPage, urlBrowser);
    }

    public void inputFirstNameText(String freeText, DataTable datatable) {
        // Input type element first_name here
        WebElement firstName = driver.findElement(By.xpath("//input[@data-test=firstName]")) ;
        firstName.sendKeys(datatable);
    }

    public void inputLastNameText(String freeText, DataTable datatable) {
        // Input type lement last_name here
        WebElement lastName = driver.findElement(By.xpath("//input[@data-test=lastName]")) ;
        lastName.sendKeys(datatable);
    }

    public void inputZippostalCode(String freeText, DataTable datatable) {
        // Input type lement zip_code here
        WebElement lastName = driver.findElement(By.xpath("//input[@data-test=postalCode]")) ;
        lastName.sendKeys(datatable);
    }

    public void clickContinueButton() {
        // Click element Continue button here
        WebElement button = driver.findElement(By.xpath("//button[@data-test=continue]"));
        button.click();
    }

    public void showPageCheckoutOverview() {
        // Check Page by Url here
        //Check logged in by URL homepage , var url here
        WebDriver driver = new ChromeDriver();
        //checkout:overview page url
        String urlPage = "https://www.saucedemo.com/checkout-step-two.html"; 
        //assert / compare here
        String urlBrowser = driver.getCurrentUrl();
        Assert.assertEquals(urlPage, urlBrowser);
    }

    public void clickFinishButton() {
        // Click element Finish button here 
        WebElement button = driver.findElement(By.xpath("//button[@data-test=finish]"));
        button.click();
    }
}