package runner;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.LoginPage;
import utils.Base;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class LoginTest extends Base{

    private LoginPage loginPage;
    private WebDriverHelper helper;
    private ExtentReports extent;
    private ExtentTest test;
    @BeforeMethod
    public void setUp(){
        openBrowser();
        this.helper = new WebDriverHelper(driver);
        loginPage = new LoginPage(driver, helper);
        extent = Reporter.generateExtentReport();
    }


    @Test(priority = 1)
    public void loginTest(){
        test = extent.createTest("Signin / registrartin on Agronetto");
        loginPage.login();
        Set<String> parentHandles = driver.getWindowHandles();
        loginPage.clickImg();
        helper.waitForNewWindow(10 , parentHandles.size());
        helper.switchToNewWindow(parentHandles);
        System.out.println(driver.getCurrentUrl());
        loginPage.clickOnVerify();
        loginPage.clickOnContactSeller();
        Screenshot.captureScreenShot("agronetto_screenshot");
        test.pass("Agronetto test passed");
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
