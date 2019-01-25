package se.claremont.test.Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoToCashout {
    WebDriver browser;
    By goToCheckoutIdentifier = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    By goToCheckoutIdentifierSummaryPage = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium > span");
    By goToCheckoutIdentifierAddressPage = By.cssSelector("#center_column > form > p > button > span");
    By goToCheckoutIdentifierShippingPage = By.cssSelector("#form > p > button > span");
    By checkTermsAndConditonsIdentifier = By.cssSelector("#cgv");
    By selectBankWireIdentifier = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    By confirmOrderIdentifier = By.cssSelector("#cart_navigation > button > span");
    By ConfirmOrderTextIdentifier = By.cssSelector("#center_column > h1");

    public GoToCashout(WebDriver browser){
        this.browser = browser;
    }

    public void proceedToCheckout (){
        browser.findElement(goToCheckoutIdentifier).click();
        browser.findElement(goToCheckoutIdentifierSummaryPage).click();
        browser.findElement(goToCheckoutIdentifierAddressPage).click();
        browser.findElement(checkTermsAndConditonsIdentifier).click();
        browser.findElement(goToCheckoutIdentifierShippingPage).click();
        browser.findElement(selectBankWireIdentifier).click();
        browser.findElement(confirmOrderIdentifier).click();
    }

    public String getConfirmationOrderText(){
        return browser.findElement(ConfirmOrderTextIdentifier).getText();
    }
}



