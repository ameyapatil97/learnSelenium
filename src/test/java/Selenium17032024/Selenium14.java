package Selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test(groups = "QA")
    @Description("Verify current URL login of vwo ")
    public void testVWOLogin(){
        WebDriver driver= new EdgeDriver();
        driver.get("https://app.vwo.com");
        System.out.println("URL"+ driver.getTitle());
        Assert.assertEquals("https://app.vwo.com","https://app.vwo.com");

    }
}
