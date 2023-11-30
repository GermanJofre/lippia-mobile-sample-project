package com.crowdar.examples.steps;

import com.crowdar.examples.services.ComunGeneralService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;

public class ComunGeneralSteps {
    @Given("EL cliente se encuentra en la aplicacion")
    public void verificacionApp() {
        ComunGeneralService.verificacionApp();
    }
    @When("Ingresa sus datos: (.*), (.*)$")
    public void datosLogin(String user, String constrasena) {
        ComunGeneralService.datosLogin(user, constrasena);
    }
}
