package se.claremont.test.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRepoMenu {
    WebDriver browser;
    By repositoriesLinkIdentifier = By.cssSelector("#js-pjax-container > div > div.col-9.float-left.pl-2 > div.UnderlineNav.user-profile-nav.js-sticky.top-0 > nav > a:nth-child(2)");

    //konstruktor
    public UserRepoMenu(WebDriver browser){
        this.browser = browser;
    }

    public RepoListPage showRepositoryListPage(){
        browser.findElement(repositoriesLinkIdentifier).click();
        return new RepoListPage(browser);
    }
}
