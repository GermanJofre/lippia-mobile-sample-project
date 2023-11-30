package com.crowdar.examples.steps;

import com.crowdar.examples.services.EntradaTiempoFechasServices;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class EntradaTiempoFechaSteps {
    @And("Ingresa hora de inicio '(.*)' : '(.*)'$")
    public void horaInicio(String hora, String minutos) {
        EntradaTiempoFechasServices.inicio(hora,minutos);
    }
    @And("Ingresa hora de finalizacion '(.*)' : '(.*)'$")
    public void horaFin(String hora, String minutos) {
        EntradaTiempoFechasServices.fin(hora,minutos);
    }
    @When("Ingresa una fecha '(.*)'$")
    public void fecha(String fecha) {
        EntradaTiempoFechasServices.ingresarFechas(fecha);
    }
    @And("Guarda la fecha y hora")
    public void guardarFechayHora() {
        EntradaTiempoFechasServices.guardarFechayHora();
    }
}
