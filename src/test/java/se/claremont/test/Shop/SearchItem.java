package se.claremont.test.Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchItem {
    WebDriver browser;
    By searchFieldIdentifier = By.cssSelector("#search_query_top");
    By searchPageTextIdentifier = By.cssSelector("#center_column > h1");
    By startSearchButtonIdentifier = By.cssSelector("#searchbox > button");

    public SearchItem(WebDriver browser) {
        this.browser = browser;
    }

    public void searchItem(WebDriver browser){
        browser.findElement(searchFieldIdentifier).click();
        browser.findElement(searchFieldIdentifier).sendKeys("Chiffon");
        browser.findElement(startSearchButtonIdentifier).click();
    }

    public String getSearchText(){
       // System.out.println("ajfgafhagf");
        return browser.findElement(searchPageTextIdentifier).getText();
    }

}