package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoClass4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 0.Wait for each command to get success response till 60 sec maximum
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // 1.Open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // 2.Get username and password from the website
        WebElement usernameValue = driver.findElement(By.xpath("//p[text()='Username : Admin']"));
        WebElement passwordValue = driver.findElement(By.xpath("//p[text()='Password : admin123']"));

        String username = usernameValue.getText().split(":")[1].trim();
        String password = passwordValue.getText().split(":")[1].trim();

        // 3. Login with same username and password
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement btn = driver.findElement(By.xpath("//button[contains(@class,'login-button')]"));

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        btn.click();

    }
}
