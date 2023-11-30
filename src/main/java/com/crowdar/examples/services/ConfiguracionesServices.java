package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ConfiguracionesConstants;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ConfiguracionesServices {
    public static void configuraciones() {
        MobileActionManager.click(ConfiguracionesConstants.CONFIGURACION);
    }

    public static void modoOscuro() {
        MobileActionManager.click(ConfiguracionesConstants.MODO);
    }

    public static void verificacionColor() {
        WebElement element = MobileActionManager.getElement(ConfiguracionesConstants.MODO);
        Assert.assertTrue(element.getAttribute("checked").equals("true"));
    }

    public static void notificaciones() {
        MobileActionManager.click(ConfiguracionesConstants.NOTIFICACIONES);
    }

    public static void verificacionNoty() {
        AyudasServices.tiempo(3000);
        WebElement element = MobileActionManager.getElement(ConfiguracionesConstants.NOTIFICACIONES);
        Assert.assertFalse(element.getAttribute("checked").equals("true"));
    }
}
