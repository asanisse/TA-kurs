package se.claremont.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import se.claremont.test.Pages.UserRepoMenu;
import se.claremont.test.Shop.DressesMenu;
import se.claremont.test.Shop.GoToCashout;
import se.claremont.test.Shop.LoginToShop;

import java.util.concurrent.TimeUnit;

public class ShopTesting {
    WebDriver browser;

    @Before  //Körs före varje test
    public void setUp(){
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get("http://automationpractice.com/index.php"); //Ladda sida
    }

    @After //Körs efter varje test
    public void tearDown(){
        browser.quit();
    }

    @Test
    public void buyDressTest() throws InterruptedException {
        LoginToShop login = new LoginToShop(browser);
        login.LoginToTheShop(browser);
        Assert.assertEquals("Validate that the there is a text My Account on the page ",
                "MY ACCOUNT", login.getNameOfMyAccountText());
        DressesMenu dress = new DressesMenu(browser);
        dress.showDressListPage();
        dress.addDressToCart();

        GoToCashout goToCashout = new GoToCashout(browser);
        goToCashout.proceedToCheckout();

        Assert.assertEquals("ORDER CONFIRMATION", goToCashout.getConfirmationOrderText());

    }

}
