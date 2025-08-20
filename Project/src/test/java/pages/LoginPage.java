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
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        helper.clickOnElement(LoginPageUI.image);
        // try {
        //     Thread.sleep(2000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
    
}
