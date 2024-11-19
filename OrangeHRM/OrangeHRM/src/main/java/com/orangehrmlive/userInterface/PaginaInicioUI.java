package com.orangehrmlive.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaInicioUI extends PageObject {

    public static final Target INPUT_USERNAME_LOGIN = Target.the("Input Usermame LogIn ").locatedBy("//input[@name='username']");
    public static final Target INPUT_PASSWORD_LOGIN = Target.the("Input Password LogIn ").locatedBy("//input[@name='password']");
    public static final Target BTN_LOGIN = Target.the("Boton LogIn").locatedBy("//button[@type='submit']");

}
