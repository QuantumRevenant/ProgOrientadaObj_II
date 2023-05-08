/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moldes;

import java.util.ArrayList;

/**
 *
 * @author sebap
 */
public class OperacionesGenerales {

    public OperacionesGenerales() {
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public double promedio(ArrayList<Double> data) {
        if (data.size() <= 0) {
            return 0;
        }

        double suma = 0;

        for (double x : data) {
            suma += x;
        }
        suma /= data.size();
        return suma;
    }

    public double valorMayor(ArrayList<Double> data) {
        if (data.size() <= 0) {
            return 0;
        }

        double mayor = data.get(0);

        for (double x : data) {
            if (mayor < x) {
                mayor = x;
            }
        }
        return mayor;
    }
    
    public double valorMenor(ArrayList<Double> data) {
        if (data.size() <= 0) {
            return 0;
        }

        double menor = data.get(0);

        for (double x : data) {
            if (menor < x) {
                menor = x;
            }
        }
        return menor;
    }
}
