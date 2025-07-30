package com.baldeon.software.UI;


import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://demo.serenity.is/Account/Login")
public class LoginPage extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("username field")
            .located(By.id("LoginPanel0_Username"));
    public static final Target PASSWORD_INPUT = Target.the("password field")
            .located(By.id("LoginPanel0_Password"));
    public static final Target SIGN_IN_BUTTON = Target.the("sign-in button")
            .located(By.id("LoginPanel0_LoginButton"));
}
