package com.amazon.pages;

import com.amazon.testbase.BaseClass;
import com.amazon.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuotePage extends CommonMethods {

    @FindBy(id = "zipCode")
    public WebElement zipCode;

    @FindBy(css = "div.arrow-background")
    public WebElement productName;

    @FindBy(xpath = "//a[@data-value='AU+HO']")
    public WebElement autoPlusHomeOption;

    @FindBy(css = "a[data-value='AU+RT']")
    public WebElement autoPlusRentersOption;

    @FindBy(css = "a[data-value='AU+CO']")
    public WebElement autoPlusCondoOption;

    @FindBy(css = "a[data-value='AU']")
    public WebElement autoOption;

    @FindBy(xpath = "//div[@class='bundle clearfix default inactive']//li[1]")
    public WebElement moduleHome;

    @FindBy(xpath = "//div[@class='bundle clearfix default inactive']//li[2]")
    public WebElement moduleRenters;

    @FindBy(xpath = "//div[@class='bundle clearfix default inactive']//li[3]")
    public WebElement moduleCondo;

    @FindBy(id = "qsButton")
    public WebElement getQuoteButton;

    public QuotePage() {
        PageFactory.initElements(driver,this);
    }
}
