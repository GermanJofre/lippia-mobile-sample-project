package com.crowdar.examples.services;

public class AyudasServices {
    public static int numero() {
        double random = Math.random();
        int num = (int) (Math.random() * (10));
        return num;
    }
    public static void tiempo(int espera) {
        try {
            Thread.sleep(espera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
