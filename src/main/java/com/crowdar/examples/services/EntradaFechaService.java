package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.EntradaTiempoFechaConstants;
import java.util.HashMap;
import java.util.Map;

public class EntradaFechaService {
    public static void elegirFecha(String dia, int mes, int ano) {
        int calculoAnos = ano - 2023;
        int calculoMeses = mes - 12;
        dirigirseFecha(calculoAnos, calculoMeses);
        String mess = mesIngresado(String.valueOf(mes));
        String anoo = String.valueOf(ano);
        Fecha(dia, mess, anoo);
    }

    private static void dirigirseFecha(int calculoAnos, int calculoMeses) {
        int meses = (calculoAnos * 12) + calculoMeses;

        if (meses > 0) {
            avanzarMeses(meses);
        } else if (meses < 0) {
            retrocederMeses(-meses);
        }
    }

    private static void avanzarMeses(int cantidadMeses) {
        for (int i = 0; i < cantidadMeses; i++) {
            MobileActionManager.click(EntradaTiempoFechaConstants.SIGUIENTE);
        }
    }

    private static void retrocederMeses(int cantidadMeses) {
        for (int i = 0; i < cantidadMeses; i++) {
            MobileActionManager.click(EntradaTiempoFechaConstants.ANTERIOR);
        }
    }

    public static String mesIngresado(String mes) {
        Map<String, String> listaMeses = new HashMap<String, String>();
        listaMeses.put("01", "January");
        listaMeses.put("02", "February");
        listaMeses.put("03", "March");
        listaMeses.put("04", "April");
        listaMeses.put("05", "May");
        listaMeses.put("06", "June");
        listaMeses.put("07", "July");
        listaMeses.put("08", "August");
        listaMeses.put("09", "September");
        listaMeses.put("10", "October");
        listaMeses.put("11", "November");
        listaMeses.put("12", "December");
        return listaMeses.get(mes);
    }

    private static void Fecha(String dia, String mess, String anoo) {
        AyudasServices.tiempo(2000);
        MobileActionManager.click(EntradaTiempoFechaConstants.FECHA, dia, mess, anoo);
        AyudasServices.tiempo(2000);
    }
}
