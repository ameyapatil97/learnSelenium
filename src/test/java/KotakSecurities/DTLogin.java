package KotakSecurities;

import io.qameta.allure.Description;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DTLogin {

    @Test(groups = "QA")
    @Description("Verify dtwebsite login")
    public void login() throws NoAlertPresentException,InterruptedException{

        WebDriver driver= new EdgeDriver();
        driver.get("https://www.kotaksecurities.com/trade/login");

        WebElement uName = driver.findElement(By.id("uname"));
        uName.sendKeys("Am6955");

        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert(); // switch to alert

        String alertMessage= driver.switchTo().alert().getText(); // capture alert message

        System.out.println(alertMessage); // Print Alert Message
        Thread.sleep(5000);
        alert.accept();

       // WebElement e = driver.findElement(By.xpath("//*[text()='Continue Here']"));
        // located element with contains()
        WebElement m = driver.findElement(By.cssSelector("text-uppercase ts-med fw-med tc-sc-4 text-center mar-t-xxs pointer-all"));
        m.click();

        WebElement uPass= driver.findElement(By.id("upass"));
        uPass.sendKeys("AP481254");

        m.click();

        WebElement btn= driver.findElement(By.xpath("//Button[@class=loginBtn-long]"));
        btn.click();
    }
}
