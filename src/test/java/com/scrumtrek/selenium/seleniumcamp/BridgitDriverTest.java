package com.scrumtrek.selenium.seleniumcamp;

import com.mingames.bridgit.driver.BridgitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: andrebrov
 * Date: 28.02.13
 * Time: 18:19
 * To change this template use File | Settings | File Templates.
 */
public class BridgitDriverTest {

    @Test
    public void test(){
        WebDriver driver = new BridgitDriver();
        WebElement element = driver.findElement(By.id("text"));
        assertEquals("Wrong text!!!","Selenium Camp is so cool!",element.getText());
        driver.quit();
    }
}
