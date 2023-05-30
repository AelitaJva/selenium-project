package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleIframe {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://the-internet.herokuapp.com/iframe");

        // Get iframe
        WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

        // Switch to iframe
        driver.switchTo().frame(iframe);

        Thread.sleep(5000);
        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Aelita!");

        driver.switchTo().defaultContent();
        WebElement text1 = driver.findElement(By.xpath("//div[@class='example']/h3"));

        System.out.println(text1.getText());

    }
}
