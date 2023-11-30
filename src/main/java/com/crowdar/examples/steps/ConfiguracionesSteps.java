package com.crowdar.examples.steps;

import com.crowdar.examples.services.ConfiguracionesServices;
import io.cucumber.java.en.And;

public class ConfiguracionesSteps {
    @And("Clickea en configuraciones")
    public void configuraciones(){
        ConfiguracionesServices.configuraciones();
    }
    @And("Selecciona el modo oscuro")
    public void modoOscuro(){
        ConfiguracionesServices.modoOscuro();
    }
    @And("La app cambia de color")
    public void verificacionColor(){
        ConfiguracionesServices.verificacionColor();
    }
    @And("Clickea en notificaciones")
    public void notificaciones(){
        ConfiguracionesServices.notificaciones();
    }
    @And("Las notificaciones quedaron habilitadas")
    public void verificacionNoty(){
        ConfiguracionesServices.verificacionNoty();
    }
}
