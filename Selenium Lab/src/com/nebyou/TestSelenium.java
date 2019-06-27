package com.nebyou;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Instant;
import java.util.List;


public class TestSelenium {
    private static Instant wait;

    public static void main(String[] args){
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.gmail.com/");
        WebElement element=driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("feverprince101@gmail.com");

        WebElement button=driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
        WebElement password;
       // wait.until(ExpectedConditions.elementToBeClickable(password));
        //password.sendKeys("xxxxxxxyour password");
        driver.findElement(By.id("passwordNext")).click();
        List<WebElement> unreademail = driver.findElements(By.className("zE"));
        System.out.println("Total No. of Unread Mails: " + unreademail.size());
    }
}