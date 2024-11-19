package com.orangehrmlive.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DashBoardPageUI extends PageObject {
    public static final Target LNK_RECRUITMENT = Target.the("Link Recruitment").locatedBy("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']");

}
