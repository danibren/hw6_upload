package com.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class StepDefinitions {
    public Actionwords actionwords = new Actionwords();

    @Given("typing correct URL to the browser {string}")
    public void typingCorrectURLToTheBrowser(String uRL) {
        actionwords.typingCorrectURLToTheBrowser(uRL);
    }

    @Then("user logged in")
    public void userLoggedIn() {
        actionwords.userLoggedIn();
    }

    @Then("show the sauce demo home page")
    public void showTheSauceDemoHomePage() {
        actionwords.showTheSauceDemoHomePage();
    }

    @When("user click Login button")
    public void userClickLoginButton() {
        actionwords.userClickLoginButton();
    }

    @When("user input valid password")
    public void userInputValidPassword(String freeText, DataTable datatable) {
        actionwords.userInputValidPassword(freeText, datatable);
    }

    @When("user input valid username")
    public void userInputValidUsername(String freeText, DataTable datatable) {
        actionwords.userInputValidUsername(datatable, freeText);
    }

    @When("user input NOT valid password")
    public void userInputNOTValidPassword(String freeText, DataTable datatable) {
        actionwords.userInputNOTValidPassword(freeText, datatable);
    }

    @Then("user CAN'T Login")
    public void userCANTLogin() {
        actionwords.userCANTLogin();
    }

    @When("user click a product item")
    public void userClickAProductItem() {
        actionwords.userClickAProductItem();
    }

    @Then("Number in Cart's icon Increase")
    public void numberInCartsIconIncrease() {
        actionwords.numberInCartsIconIncrease();
    }

    @Given("user add a product to the Cart")
    public void userAddAProductToTheCart() {
        actionwords.userAddAProductToTheCart();
    }

    @When("user click Cart's icon")
    public void userClickCartsIcon() {
        actionwords.userClickCartsIcon();
    }

    @When("user click Checkout button")
    public void userClickCheckoutButton() {
        actionwords.userClickCheckoutButton();
    }

    @Then("show checkout respond messages")
    public void showCheckoutRespondMessages() {
        actionwords.showCheckoutRespondMessages();
    }

    @When("show page Your Information page")
    public void showPageYourInformationPage() {
        actionwords.showPageYourInformationPage();
    }

    @When("input First Name text")
    public void inputFirstNameText(String freeText, DataTable datatable) {
        actionwords.inputFirstNameText(freeText, datatable);
    }

    @When("input Last Name text")
    public void inputLastNameText(String freeText, DataTable datatable) {
        actionwords.inputLastNameText(freeText, datatable);
    }

    @When("input zip/postal code")
    public void inputZippostalCode(String freeText, DataTable datatable) {
        actionwords.inputZippostalCode(freeText, datatable);
    }

    @When("click Continue button")
    public void clickContinueButton() {
        actionwords.clickContinueButton();
    }

    @When("show page Checkout: Overview")
    public void showPageCheckoutOverview() {
        actionwords.showPageCheckoutOverview();
    }

    @When("Click Finish Button")
    public void clickFinishButton() {
        actionwords.clickFinishButton();
    }
}