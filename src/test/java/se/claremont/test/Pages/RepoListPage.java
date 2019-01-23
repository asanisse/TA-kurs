package se.claremont.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoListPage {
    WebDriver browser;
    By firstRepoIdentifier = By.cssSelector("#user-repositories-list > ul > li:nth-child(1) > div.col-9.d-inline-block > div.d-inline-block.mb-1 > h3 > a");

    public RepoListPage(WebDriver browser){
        this.browser = browser;
    }

    public String getNameOfFirstRepo(){
       return browser.findElement(firstRepoIdentifier).getText();
    }
}
