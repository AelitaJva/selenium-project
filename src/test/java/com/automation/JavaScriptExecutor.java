package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://www.ebay.com");

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
        WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border = 'thick solid red';", dropdown);
        js.executeScript("arguments[1].style.border = 'thick solid red';", search);
        js.executeScript("arguments[2].style.border = 'thick solid red';", searchBtn);

    }
}
