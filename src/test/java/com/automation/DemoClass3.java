package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DemoClass3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("http://www.ebay.com/");


      WebElement search = driver.findElement(By.xpath("//input[@id='gh-ac']"));
      WebElement searchBtn = driver.findElement(By.xpath("//input[@id='gh-btn']"));

      search.sendKeys("laptop");
      searchBtn.click();


      List<WebElement> listOfPrice = driver.findElements(By.xpath("//span[@class='s-item__price']"));

      for (WebElement price : listOfPrice) {
          System.out.println(price.getText());
      }


    }
}
