package com.progressive.pages;

import com.progressive.testbase.BaseClass;
import com.progressive.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInformationPage extends BaseClass {

    @FindBy(css = "span.persuasion-header")
    public WebElement persuasionHeader;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_FirstName")
    public WebElement firstNameInput;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_LastName")
    public WebElement lastNameInput;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_DateOfBirth")
    public WebElement dateOfBirthInput;

    @FindBy(css = "[placeholder*='number &'] input")
    public WebElement streetNameInput;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_ApartmentUnit")
    public WebElement aptNumberInput;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_City")
    public WebElement cityNameInput;

    @FindBy(css = "input#NameAndAddressEdit_embedded_questions_list_ZipCode")
    public WebElement zipcodeInput;

    @FindBy(css = "loading-button[data-automation-id]")
    public WebElement startMyQuoteBtn;

    public PersonalInformationPage() {
        PageFactory.initElements(driver, this);
    }




}
