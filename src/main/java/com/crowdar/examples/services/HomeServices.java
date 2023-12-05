package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoConstants;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;
import static com.crowdar.examples.services.EntradaService.proyecto;

public class HomeServices {
    public static void escenario() {
        MobileActionManager.click(HomeConstants.AGREGAR_ESCENARIO);
    }
    public static void validarEscenario() {
        AyudasServices.tiempo(5000);
        String validacion = EntradaTiempoConstants.NOMBRE.replace("JutsuDeReemplazo",proyecto);
        Assert.assertTrue(MobileActionManager.isPresent(validacion));
    }
    public static void validarSinEscenario(){
        AyudasServices.tiempo(5000);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.SIN_ENTRADAS));
    }
    public static void menuOpcion() {
        MobileActionManager.click(HomeConstants.MENU_DEPLEGABLE);
    }
    public static void accionSalida() {
        MobileActionManager.click(HomeConstants.LOGOUT);
        MobileActionManager.click(HomeConstants.CONFIRMACION_LOGOUT);
    }
}
