package com.scrumtrek.selenium.seleniumcamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;

import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: andrebrov
 * Date: 28.02.13
 * Time: 18:37
 * To change this template use File | Settings | File Templates.
 */
public class MyPage extends LoadableComponent<MyPage> {

    @FindBy(id="text")
    private WebElement text;
    @FindBy(id="select")
    private WebElement selectElement;
    private WebDriver driver;

    public MyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Override
    protected void load() {
    }

    @Override
    protected void isLoaded() throws Error {
//        assertTrue(text.isDisplayed());
    }

    public String getText(){
        return text.getText();
    }

    public String getSelectValue(){
        Select select = new Select(selectElement);
        return select.getFirstSelectedOption().getText();
    }
}
