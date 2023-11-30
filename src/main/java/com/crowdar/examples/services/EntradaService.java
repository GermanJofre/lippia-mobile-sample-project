package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoConstants;

public class EntradaService {
    public static String proyecto;
    public static void nombre(String nombre) {
        proyecto = nombre + AyudasServices.numero();
        MobileActionManager.click(EntradaTiempoConstants.DESCRIPCION);
        MobileActionManager.setInput(EntradaTiempoConstants.DESCRIPCION,proyecto);
    }
    public static void horasTrabajo(String hora, String minutos) {
        ComunEntradaService.ingresarDatos(hora, minutos);
    }
    public static void fechasyhoras() {
        MobileActionManager.click(EntradaTiempoConstants.FECHAS_Y_HORAS);
    }
    public static void guardar() {
        MobileActionManager.click(EntradaTiempoConstants.GUARDAR);
    }
    public static void cancelacion() {
        MobileActionManager.click(EntradaTiempoConstants.CANCELACION_TOOLBAR);
        MobileActionManager.click(EntradaTiempoConstants.CANCELACION);
        MobileActionManager.click(EntradaTiempoConstants.VOLVER);
    }
}
