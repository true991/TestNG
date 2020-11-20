package com.progressive.testbase;

import com.progressive.pages.PersonalInformationPage;
import com.progressive.pages.QuotePage;
import com.progressive.pages.VihicleInformationPage;

public class PageInitializer extends BaseClass{

    protected static PersonalInformationPage personalInformation;
    protected static QuotePage quotePage;
    protected static VihicleInformationPage vihicleInformationPage;


    public static void initializePages() {
        personalInformation = new PersonalInformationPage();
        quotePage = new QuotePage();
        vihicleInformationPage = new VihicleInformationPage();

    }
}
