package it.academy.andrey.ponomarev.garfield.project.steps;

import it.academy.andrey.ponomarev.garfield.project.pages.LoginPage;

public class LoginSteps extends LoginPage {
    public static void stepsUserLogIn(String email, String password) {
        new LoginPage()
                .openAndInputLoginForm(email, password)
                .clickBtnEnter();
    }

    public static void stepsUserLogInAndCheckOut(String email, String password) {
        new LoginPage()
                .openAndInputLoginForm(email, password)
                .clickBtnEnterLoginForm();
    }

}
