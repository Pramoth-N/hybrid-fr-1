package runner;

import java.util.Set;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Base;
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


    @Test
    public void loginTest(){
        loginPage.login();
        Set<String> parentHandles = driver.getWindowHandles();
        loginPage.clickImg();
        helper.switchToNewWindow(parentHandles);
    }
    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
