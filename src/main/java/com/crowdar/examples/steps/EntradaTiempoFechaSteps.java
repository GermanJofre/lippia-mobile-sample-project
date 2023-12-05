package com.crowdar.examples.steps;

import com.crowdar.examples.services.EntradaTiempoFechasServices;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class EntradaTiempoFechaSteps {
    @And("Ingresa una hora de inicio '(.*)' : '(.*)'$")
    public void horaInicio(String hora, String minutos) {
        EntradaTiempoFechasServices.inicio(hora,minutos);
    }
    @And("Ingresa una hora de finalizacion '(.*)' : '(.*)'$")
    public void horaFin(String hora, String minutos) {
        EntradaTiempoFechasServices.fin(hora,minutos);
    }
    @When("Ingresa fecha '(.*)'$")
    public void fecha(String fecha) {
        EntradaTiempoFechasServices.ingresarFechas(fecha);
    }
    @And("Clicke en guarda la fecha y hora")
    public void guardarFechayHora() {
        EntradaTiempoFechasServices.guardarFechayHora();
    }
}
