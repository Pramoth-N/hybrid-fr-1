package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import utils.Base;
import utils.WebDriverHelper;

public class LoginTest extends Base{

    private LoginPage loginPage;
    @BeforeMethod
    public void setUp(){
        openBrowser();
        loginPage = new LoginPage(driver, new WebDriverHelper(driver));
    }


    @Test
    public void loginTest(){
        loginPage.login();
        
    }
    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
