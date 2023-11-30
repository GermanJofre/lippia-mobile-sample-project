package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoConstants;
import com.crowdar.examples.constants.LoginConstants;

public class ComunGeneralService {
    public static void verificacionApp() {
        MobileActionManager.waitVisibility(LoginConstants.APP_VISIBLE);
    }
    public static void datosLogin(String user, String contrasena) {
        MobileActionManager.setInput(LoginConstants.USER,user);
        MobileActionManager.setInput(LoginConstants.CONTRASENA,contrasena);
        MobileActionManager.click(LoginConstants.LOGIN);
        AyudasServices.tiempo(10000);
    }
}
