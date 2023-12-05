package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeServices;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;

public class LoginSteps {
    @Then("El cliente ingresa a la aplicacion exitosamente")
    public void ingresoApp() {
        LoginService.ingresoApp();
    }

    @Then("El cliente sale de la aplicacion exitosamente")
    public void salidaApp() {
        HomeServices.accionSalida();
        LoginService.salidaApp();
    }
}
