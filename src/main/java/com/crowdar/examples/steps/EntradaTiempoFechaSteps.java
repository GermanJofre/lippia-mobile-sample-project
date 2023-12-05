package com.crowdar.examples.steps;

import com.crowdar.examples.services.EntradaTiempoServices;
import com.crowdar.examples.services.EntradaFechaService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class EntradaTiempoFechaSteps {
    @And("Ingresa una hora de inicio '(.*)' : '(.*)'$")
    public void horaInicio(String hora, String minutos) {
        EntradaTiempoServices.inicio(hora,minutos);
    }
    @And("Ingresa una hora de finalizacion '(.*)' : '(.*)'$")
    public void horaFin(String hora, String minutos) {
        EntradaTiempoServices.fin(hora,minutos);
    }
    @When("Ingresa fecha '(.*)' '(.*)' y '(.*)'$")
    public void fecha(String dia,int mes,int ano) {
        EntradaFechaService.elegirFecha(dia, mes, ano);
    }
    @And("Clicke en guarda la fecha y hora")
    public void guardarFechayHora() {
        EntradaTiempoServices.guardarFechayHora();
    }
}
