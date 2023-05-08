/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author sebap
 */
public class Operaciones {

    public Operaciones() {
    }

    public int sumarStock(ArrayList<Mascotas> x) {
        int suma = 0;
        for (Mascotas y : x) {
            suma += y.getStock();
        }
        return suma;
    }

    public Mascotas precioMayor(ArrayList<Mascotas> x) {
        if (x.size() <= 0) {
            return null;
        }

        Mascotas mayor = x.get(0);

        for (Mascotas y : x) {
            if (mayor.getCosto() < y.getCosto()) {
                mayor = y;
            }
        }
        return mayor;
    }
    public Mascotas precioMenor(ArrayList<Mascotas> x) {
        if (x.size() <= 0) {
            return null;
        }

        Mascotas menor = x.get(0);

        for (Mascotas y : x) {
            if (menor.getCosto() > y.getCosto()) {
                menor = y;
            }
        }
        return menor;
    }
    public double promedio(ArrayList<Mascotas> x) {
        if (x.size() <= 0) {
            return 0;
        }
        double suma=0;
        for(Mascotas y:x)
        {
            suma+=y.getCosto();
        }
        suma/=x.size();
        return suma;
    }
    
    public ArrayList<ArrayList<Object>> getCoincidenciasDeTipo(ArrayList<Mascotas> bd) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<ArrayList<Object>> salida = new ArrayList<>();
        boolean encontrado = false;
        for (Mascotas x : bd) {
            encontrado = false;
            for (String a : nombres) {
                if (a.equalsIgnoreCase(x.getTipoDeMascota())) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                nombres.add(x.getTipoDeMascota());
            }
        }
        int temporalInt;

        for (String a : nombres) {
            ArrayList<Object> temporal = new ArrayList<>();
            temporal.clear();
            temporalInt = 0;
            temporal.add(a);
            for (Mascotas x : bd) {
                if (a.equalsIgnoreCase(x.getTipoDeMascota())) {
                    temporalInt++;
                }
            }
            temporal.add(temporalInt);
            salida.add(temporal);
        }

        return salida;
    }
}
