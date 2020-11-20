package com.progressive.testcases;

import com.progressive.utils.CommonMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetQuoteTest extends CommonMethods {

    @Test
    public void calculateQuote() throws InterruptedException {
        sendText(quotePage.zipCode, "20877");
        click(quotePage.productName);
        click(quotePage.autoOption);
        click(quotePage.moduleHome);
        click(quotePage.getQuoteButton);

        Assert.assertTrue(personalInformation.persuasionHeader.isDisplayed());

        sendText(personalInformation.firstNameInput, "Igor");
        sendText(personalInformation.lastNameInput, "Trushkov");
        sendText(personalInformation.dateOfBirthInput, "03071991");
        click(personalInformation.persuasionHeader);

        Thread.sleep(2000);

        sendText(personalInformation.streetNameInput, "216 Tulip Dr");
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
