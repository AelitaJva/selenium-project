package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWay {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // Open Website
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // Get button element from the website
        WebElement btn = driver.findElement(By.xpath("//div[@id='start']/button"));

        // Click on the start button
        btn.click();

        // Get "Hello World!" text element
        WebElement text = driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        // Print the text into the console from the site
        System.out.println(text.getText());

    }
}
