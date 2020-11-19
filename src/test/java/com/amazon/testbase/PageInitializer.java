package com.amazon.testbase;

import com.amazon.pages.PersonalInformationPage;
import com.amazon.pages.QuotePage;
import com.amazon.pages.VihicleInformationPage;

public class PageInitializer extends BaseClass{

    protected static PersonalInformationPage personalInformation;
    protected static QuotePage quotePage;
    protected static VihicleInformationPage vihicleInformationPage;


    public void initializePages() {
        personalInformation = new PersonalInformationPage();
        quotePage = new QuotePage();
        vihicleInformationPage = new VihicleInformationPage();

    }
}
