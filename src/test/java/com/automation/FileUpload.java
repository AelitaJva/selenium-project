package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));


        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement inputBox = driver.findElement(By.id("file-upload"));
        WebElement uploadBtn = driver.findElement(By.id("file-submit"));

        String currentDir = System.getProperty("user.dir");

        inputBox.sendKeys( currentDir + "/pictue.jpg");
        uploadBtn.click();

        driver.get("https://the-internet.herokuapp.com/download");
        WebElement fileDownload = driver.findElement(By.xpath("//a[text()='pictue.jpg']"));
        System.out.println(fileDownload.isDisplayed());
        fileDownload.click();


    }
}
