package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoConstants;
import com.crowdar.examples.constants.EntradaTiempoFechaConstants;

public class EntradaTiempoFechasServices {
    public static void inicio(String hora, String minutos) {
        MobileActionManager.click(EntradaTiempoFechaConstants.INICIO);
        ComunEntradaService.ingresarDatos(hora, minutos);
    }
    public static void fin(String hora, String minutos) {
        MobileActionManager.click(EntradaTiempoFechaConstants.FIN);
        ComunEntradaService.ingresarDatos(hora, minutos);
    }
    public static void ingresarFechas(String fecha) {
        MobileActionManager.click(EntradaTiempoFechaConstants.DIA, fecha);
    }
    public static void guardarFechayHora() {
        MobileActionManager.click(EntradaTiempoConstants.GUARDAR);
    }
}
