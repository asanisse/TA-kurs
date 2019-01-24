package se.claremont.test.Shop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DressesMenu {
    WebDriver browser;
    By categoryIdentifier = By.cssSelector("#block_top_menu > div");
    By dressLinkIdentifier  = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    By addDressToCartIdentifier = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.first-item-of-tablet-line.last-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");

    public DressesMenu(WebDriver browser){
        this.browser = browser;
    }

    public void showDressListPage(){
      //  browser.findElement(categoryIdentifier).click();
        browser.findElement(dressLinkIdentifier).click();
       // return new RepoListPage(browser);
    }

    public void addDressToCart(){
        browser.findElement(addDressToCartIdentifier).click();
    }
}
