package com.selenium.homework2309;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchCallBack {
    WebDriver wd;

    @BeforeMethod
    public void setUp() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://5motkov.ru/");

    }

    @Test
    public void searchFromMenuTest(){


        wd.findElement(By.cssSelector("div #block-block-1 [data-target=\"#request-modal\"]")).click();


    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        wd.quit();

    }
}
