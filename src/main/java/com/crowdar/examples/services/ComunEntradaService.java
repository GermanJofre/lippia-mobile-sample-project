package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoConstants;

public class ComunEntradaService {
    public static void ingresarDatos(String hora, String minutos) {
        MobileActionManager.click(EntradaTiempoConstants.HORAS);
        for(int i = 0; i < 2; i++) {
            MobileActionManager.setInput(EntradaTiempoConstants.HORAS, hora);
            MobileActionManager.setInput(EntradaTiempoConstants.MINUTOS, minutos);
        }
    }
}
