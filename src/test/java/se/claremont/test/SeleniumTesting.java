package se.claremont.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import se.claremont.test.Pages.RepoListPage;
import se.claremont.test.Pages.UserRepoMenu;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class SeleniumTesting {
    WebDriver browser;


    @Before  //Körs före varje test
    public void setUp(){
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        browser.get("https://github.com/johan-backstrom/"); //Ladda sida
    }

    @After //Körs efter varje test
    public void tearDown(){
        browser.quit();
    }

    @Test //Unit test JUnit, används för att driva Selenium
    public void simpleSeleniumTest() throws InterruptedException {

       // UserRepoMenu menu = new UserRepoMenu(browser);
      //  menu.showRepositoryListPage();
        UserRepoMenu menu = new UserRepoMenu(browser);
        RepoListPage listPage = menu.showRepositoryListPage();
        //RepoListPage listPage = new RepoListPage(browser);
        Assert.assertEquals("Validate that the first repo is called ",
                "iths-testautomation", listPage.getNameOfFirstRepo());


        }
}
