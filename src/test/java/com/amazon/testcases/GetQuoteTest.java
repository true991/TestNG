package com.amazon.testcases;

import com.amazon.pages.QuotePage;
import com.amazon.pages.VihicleInformationPage;
import com.amazon.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetQuoteTest extends CommonMethods {

    @Test
    public void calculateQuote() {
        sendText(quotePage.zipCode, "20877");
        click(quotePage.productName);
        click(quotePage.autoOption);
        click(quotePage.autoPlusHomeOption);
        click(quotePage.getQuoteButton);

        Assert.assertTrue(personalInformation.persuasionHeader.isDisplayed());

        sendText(personalInformation.firstNameInput, "Igor");
        sendText(personalInformation.lastNameInput, "Trushkov");
        sendText(personalInformation.dateOfBirthInput, "03071991");
        sendText(personalInformation.streetNameInput, "Tulip Dr 216");
        sendText(personalInformation.cityNameInput, "Gaithersburg");
        sendText(personalInformation.zipcodeInput, "20877");
        click(personalInformation.startMyQuoteBtn);

        Assert.assertTrue(vihicleInformationPage.headerText.isDisplayed());

        chooseFromList(vihicleInformationPage.vihicleYearPick, "2012");
        chooseFromList(vihicleInformationPage.vihicleMakeLabel, "Chevrolet");
        chooseFromList(vihicleInformationPage.vihicleModelName, "Malibu");
        selectDropDownByIndex(vihicleInformationPage.BodyTypeSelection, 1);
        selectDropDownByIndex(vihicleInformationPage.primaryUseSelection, 1);
        selectDropDownByText(vihicleInformationPage.ownOrLeaseSelection, "Own");
        selectDropDownByIndex(vihicleInformationPage.lengthOfOwnership, 3);
        click(vihicleInformationPage.doneButton);
        click(vihicleInformationPage.continueButton);
    }
}
