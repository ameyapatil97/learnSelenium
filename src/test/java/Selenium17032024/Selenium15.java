package Selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium15 {

    @Test(groups = "QA")
    @Description ("Verify current url, katalon ")
    public void testVWOLogin15() throws InterruptedException{

        WebDriver driver= new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement btnElementId = driver.findElement(By.id("btn-make-appointment"));

        btnElementId.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        driver.quit();

    }

    @Test(groups = "QA")
    @Description ("Verify current url, katalon id pwd ")
    public void testVWOLogin16() throws InterruptedException{

        WebDriver driver= new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement btnElementId = driver.findElement(By.id("btn-make-appointment"));

        btnElementId.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement uID= driver.findElement(By.id("txt-username"));
        uID.sendKeys("John Doe");

        WebElement pwdID= driver.findElement(By.id("txt-password"));
        pwdID.sendKeys("ThisIsNotAPassword");

//        WebElement loginBtn=driver.findElement(By.id("btn-login"));
//        loginBtn.click();
//
//        List<WebElement> username_element = driver.findElements(By.xpath("//input[@placeholder='Password']"));
//        username_element.get(1).sendKeys("John Doe");
//
//        WebElement password_element = driver.findElement(By.xpath("//input[@id='txt-password']"));
//        password_element.sendKeys("ThisIsNotAPassword");
//
//        driver.findElement(By.id("btn-login")).click();

    }
}
