package com.amazon.utils;

import com.amazon.testbase.BaseClass;
import com.amazon.testbase.PageInitializer;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CommonMethods extends PageInitializer {

    /**
     * Methods clears element's field and provides text to any given element
     * @param element
     * @param text
     */
    public static void sendText(WebElement element, String text) {
        element.clear();
        element.sendKeys();
    }

    /**
     * Method returns an Object of JavaScriptExecutor
     * @return
     */
    public static JavascriptExecutor getJSExecutor() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js;
    }

    /**
     * The method performs click using JavaScriptExecutor
     * @param element
     */
    public static void jsClick(WebElement element) {
        getJSExecutor().executeScript("argument[0].click;",element);
    }

    /**
     * The method returns WebDriverWait object
     * @return
     */
    public static WebDriverWait getWaitObject() {
        return new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);
    }

    /**
     * The method is waiting for clickabilty of WebElement
     * @param element
     */
    public static void waitForClickability(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Click method with waiting for clickability
     * @param element
     */
    public static void click(WebElement element) {
        waitForClickability(element);
        element.click();
    }

    /**
     * Method clicks on the element from List of WebElements
     * @param listName
     * @param value
     */
    public static void chooseFromList(List<WebElement> listName, String value) {

        for(WebElement element : listName) {
            if(element.getText().equals(value)) {
                click(element);
                break;
            }
        }

    }

    /**
     * Select by index from drop down
     * @param element
     * @param index
     */
    public static void selectDropDownByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    /**
     * Select by visible text from drop down
     * @param element
     * @param text
     */
    public static void selectDropDownByText(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }






}
