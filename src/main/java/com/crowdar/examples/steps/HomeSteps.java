package com.crowdar.examples.steps;

import com.crowdar.examples.services.HomeServices;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.And;

public class HomeSteps {
    @And("Selecciona el menu opcion")
    public void menuOpcion() {
        HomeServices.menuOpcion();
    }
    @And("Selecciona para crear un escenario")
    public void escenario() {
        HomeServices.escenario();
    }
    @Then("El cliente puede ver el escenario creado")
    public void validacionEscenario() {
        HomeServices.validarEscenario();
        HomeServices.eliminar();
        HomeServices.validarSinEscenario();
    }
    @Then("Puede observar que no hay escenarios creados")
    public void escenarioCancelado() {
        HomeServices.validarSinEscenario();
    }
}
