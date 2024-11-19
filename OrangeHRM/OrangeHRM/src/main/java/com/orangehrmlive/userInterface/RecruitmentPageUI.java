package com.orangehrmlive.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RecruitmentPageUI extends PageObject {

    public static final Target BTN_ADD = Target.the("Boton Add").locatedBy("//a[@class='btn btn-success btn-lg']");
    public static final Target INPUT_FULLNAME = Target.the("Input Fullname").locatedBy("//input[@name='firstName']");
    public static final Target INPUT_MIDDLENAME = Target.the("Input Middlename").locatedBy("//input[@name='middleName']");
    public static final Target INPUT_LASTNAME = Target.the("Input Lastname").locatedBy("//input[@name='lastName']");
    public static final Target SLT_VACANCY = Target.the("Button Select Vacancy").locatedBy("//*[@class='oxd-select-text oxd-select-text--active']");
    public static Target OPT_VACANCY (String vacancy) {
        return Target.the("Opt Vancancy "+vacancy).locatedBy("//*[(contains(text(),'"+vacancy+"'))]");
    }
    public static final Target INPUT_ADDRESS = Target.the("Input Address").locatedBy("//input[@id='customer.address.street']");
    public static final Target INPUT_CITY = Target.the("Input City").locatedBy("//input[@id='customer.address.city']");
    public static final Target INPUT_STATE = Target.the("Input State").locatedBy("//input[@id='customer.address.state']");
    public static final Target INPUT_ZIPCODE = Target.the("Input Zip Code").locatedBy("//input[@id='customer.address.zipCode']");
    public static final Target INPUT_TELEPHONE = Target.the("Input Telephone").locatedBy("//input[@id='customer.phoneNumber']");
    public static final Target INPUT_SSN = Target.the("Input SSN").locatedBy("//input[@id='customer.ssn']");
    public static final Target INPUT_USERNAME = Target.the("Input Username").locatedBy("//input[@id='customer.username']");

}
