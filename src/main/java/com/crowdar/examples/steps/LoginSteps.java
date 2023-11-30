package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeServices;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

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
