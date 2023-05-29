package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DemoClass5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 1.Wait for each command to get success response till 60 sec maximum
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // 2.Open the website
        driver.get("https://ebay.com/");

        // 2. Create web element using select tag
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

        // 3. Wrap that web element using select class methods
        Select catDropdown = new Select(dropdown);

        // 4. Select the option by using text, value, index
        catDropdown.selectByVisibleText("Baby");
        catDropdown.selectByValue("267");
        catDropdown.selectByIndex(1);


        // To get all options
        List <WebElement> allOptions = catDropdown.getOptions();

        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }





    }
}
