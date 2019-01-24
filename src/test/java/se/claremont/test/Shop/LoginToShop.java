package se.claremont.test.Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginToShop {
    WebDriver browser;
    String email = "slask@apa.se";
    String password = "slask";
    By loginButton = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
    By emailField = By.cssSelector("#email");
    By passwordField = By.cssSelector("#passwd");
    By submitLoginButton = By.cssSelector("#SubmitLogin > span");
    By myAccountIdentifier = By.cssSelector("#center_column > h1");

    public LoginToShop(WebDriver browser){
        this.browser = browser;
    }

    public void LoginToTheShop(WebDriver browser) throws InterruptedException {
        browser.findElement(loginButton).click();
        browser.findElement(emailField).sendKeys(email);
        browser.findElement(passwordField).sendKeys(password);
        browser.findElement(submitLoginButton).click();
    }
    public String getNameOfMyAccountText(){
        return browser.findElement(myAccountIdentifier).getText();
    }
}
