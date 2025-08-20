package pages;

import org.openqa.selenium.WebDriver;

import uistore.LoginPageUI;
import utils.WebDriverHelper;

public class LoginPage {
    private WebDriverHelper helper;
    private WebDriver driver;
    public LoginPage(WebDriver driver , WebDriverHelper helper){
        this.driver = driver;
        this.helper = helper;
    }

    public void login(){
        helper.clickOnElement(LoginPageUI.signInBtn);
    }

    public void clickImg(){
        helper.waitForElementToBeVisible(LoginPageUI.image , 15);
        helper.clickOnElement(LoginPageUI.image);
    }

    public void clickOnVerify(){
        helper.clickOnElement(LoginPageUI.verifyAnchor);
    }
    
    public void clickOnContactSeller(){
        helper.waitForElementToBeVisible(LoginPageUI.contactSeller, 15);
        helper.clickOnElement(LoginPageUI.contactSeller);
    }


    public void clickOnBlog(){
        helper.clickOnElement(LoginPageUI.blog);
    }

    public void clickOnBlodAbout(){
        helper.hoverOverElement(LoginPageUI.dropDown);
        helper.clickOnElement(LoginPageUI.constructionBlog);
    }

    public void searchBusiness(){
        helper.clickOnElement(LoginPageUI.searchIcon);
        helper.waitForElementToBeVisible(LoginPageUI.searchBox, 5);
        
    }
}
