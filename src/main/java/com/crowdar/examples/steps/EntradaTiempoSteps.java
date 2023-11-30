package com.crowdar.examples.steps;

import com.crowdar.examples.services.EntradaService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class EntradaTiempoSteps {
    @When("Agrega un nombre al proyecto '(.*)'$")
    public void nombre(String nombre) {
        EntradaService.nombre(nombre);
    }
    @And("Ingresa horas trabajadas '(.*)' : '(.*)'$")
    public void horasTrabajo(String hora, String minutos) {
        EntradaService.horasTrabajo(hora,minutos);
    }
    @And("Clickea la seccion fechas con horas")
    public void fechasyhoras() {
        EntradaService.fechasyhoras();
    }
    @And("Guarda el escenario")
    public void guardar() {
        EntradaService.guardar();
    }
    @And("Cancela sus acciones para volver al inicio")
    public void cancelacion() {
        EntradaService.cancelacion();
    }
}
