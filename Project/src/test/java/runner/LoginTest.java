package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Base;

public class LoginTest extends Base{

    @BeforeMethod
    public void setUp(){
        openBrowser();
    }


    @Test
    public void loginTest(){
        
    }
    @AfterMethod
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }
}
