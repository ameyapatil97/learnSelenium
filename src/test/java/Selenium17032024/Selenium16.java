package Selenium17032024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium16 {
    @Test(groups = "QA")
    @Description("Verify login to katlon using xpath")

    public void testKatlon() throws InterruptedException {

        WebDriver driver= new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        WebElement btn1 = driver.findElement(By.xpath("btn btn-dark btn-lg"));
        btn1.click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");


        WebElement username_element = driver.findElement(By.id("txt-username"));
        username_element.sendKeys("John Doe");

        WebElement password_element = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password_element.sendKeys("ThisIsNotAPassword");

        driver.findElement(By.id("btn-login")).click();


        driver.quit();

    }

    @Test(groups = "QA")
    @Description("Verify login to katlon using xpath :negative case")
    public void testKatlon1(){

        WebDriver driver= new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        System.out.println(driver.getCurrentUrl());
        driver.manage().window().maximize();

        WebElement btn1 = driver.findElement(By.className("btn btn-dark btn-lg"));
        btn1.click();

    }
}
