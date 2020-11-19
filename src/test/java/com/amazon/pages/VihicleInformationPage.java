package com.amazon.pages;

import com.amazon.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VihicleInformationPage extends CommonMethods {

    @FindBy(css = "h1.text")
    public WebElement headerText;

    @FindBy(xpath = "//list-input[@id='VehiclesNew_embedded_questions_list_Year']//li")
    public List<WebElement> vihicleYearPick;

    @FindBy(xpath = "//list-input[@id='VehiclesNew_embedded_questions_list_Make']//li")
    public List<WebElement> vihicleMakeLabel;

    @FindBy(xpath = "//list-input[@id='VehiclesNew_embedded_questions_list_Model']//li")
    public List<WebElement> vihicleModelName;

    @FindBy(css = "elect#VehiclesNew_embedded_questions_list_BodyStyle")
    public WebElement BodyTypeSelection;

    @FindBy(css = "select#VehiclesNew_embedded_questions_list_VehicleUse")
    public WebElement primaryUseSelection;

    @FindBy(css = "select#VehiclesNew_embedded_questions_list_OwnOrLease")
    public WebElement ownOrLeaseSelection;

    @FindBy(css = "select#VehiclesNew_embedded_questions_list_LengthOfOwnership")
    public WebElement lengthOfOwnership;

    @FindBy(xpath = "//button[contains(text(), 'Done')]")
    public WebElement doneButton;

    @FindBy(xpath = "//button[contains(text(), 'Continue')]")
    public WebElement continueButton;

    public VihicleInformationPage() {
        PageFactory.initElements(driver, this);
    }
}
