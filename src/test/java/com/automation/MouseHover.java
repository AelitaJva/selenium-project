package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.ebay.com/");

        WebElement electronics = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a"));
        WebElement apple = driver.findElement(By.xpath("//ul/li/a[text()='Apple']"));

        Actions action = new Actions(driver);
        action.moveToElement(electronics).pause(1000).click(apple).build().perform();



    }
}
