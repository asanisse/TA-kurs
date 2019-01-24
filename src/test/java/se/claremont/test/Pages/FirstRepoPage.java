package se.claremont.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstRepoPage {
    WebDriver browser;
    By firstRepoIdentifier = By.cssSelector("#user-repositories-list > ul > li:nth-child(1) > div.col-9.d-inline-block > div.d-inline-block.mb-1 > h3 > a");

    //Click on First Repo

    public void showFirstRepoPage() {
        browser.findElement(firstRepoIdentifier).click();
       // return new RepoListPage(browser);
    }
}
