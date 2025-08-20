package runner;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Base;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LoginTest extends Base{

    private LoginPage loginPage;
    private WebDriverHelper helper;
    @BeforeMethod
    public void setUp(){
        openBrowser();
        this.helper = new WebDriverHelper(driver);
        loginPage = new LoginPage(driver, helper);

    }


    @Test(priority = 1)
    public void loginTest(){
        loginPage.login();
        Set<String> parentHandles = driver.getWindowHandles();
        loginPage.clickImg();
        helper.waitForNewWindow(10 , parentHandles.size());
        helper.switchToNewWindow(parentHandles);
        System.out.println(driver.getCurrentUrl());
        loginPage.clickOnVerify();
        loginPage.clickOnContactSeller();
        Screenshot.captureScreenShot("agronetto_screenshot");
    }

    @Test(priority = 2)
    public void blogTest(){
        loginPage.clickOnBlog();
        Set<String> parentHandles = driver.getWindowHandles();
        loginPage.clickOnBlodAbout();
        helper.waitForNewWindow(10 , parentHandles.size());
        helper.switchToNewWindow(parentHandles);
        loginPage.searchBusiness();
        helper.waitTillPageReady();
        Screenshot.captureScreenShot("business_record");
    }

    @Test
    public void spareTest(){
        loginPage.clickOnSpares();
        loginPage.sortByPrice();
    }
    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
