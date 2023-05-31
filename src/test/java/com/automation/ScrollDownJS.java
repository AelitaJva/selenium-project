package com.automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ScrollDownJS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i=1; i<=10; i++) {
            js.executeScript("window.scrollBy(0, 1000)", "");
            Thread.sleep(2000);
        }
    }
}
