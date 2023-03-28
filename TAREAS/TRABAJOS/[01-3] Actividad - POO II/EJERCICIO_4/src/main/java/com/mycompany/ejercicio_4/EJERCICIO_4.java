/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_4;

import java.util.ArrayList;

/**
 *
 * @author sebap
 *         Ingresar Datos en la matriz: Código, Nombre, Nota
 *         Obtener Nota Mínima
 *         Obtener Nota Máxima
 *         Obtener Promedio de Notas
 */
public class EJERCICIO_4 {

    private ArrayList<ArrayList<String>> db = new ArrayList<>();

    public EJERCICIO_4() {
    }

    public void add(ArrayList<String> x) {
        db.add(x);
    }
    
    public String get(int x, int y) {
        return db.get(x).get(y);
    }

    public int getSize() {
        return db.size();
    }
    public void printData()
    {
        for(int i=0;i<db.size();i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(db.get(i).get(j)+"- pos "+j+" "+i+"\n");
            }
        }
    }
    public String getCodigo(double x)
    {
        for (int i = 0; i < db.size(); i++){
            if(Double.parseDouble(db.get(i).get(2))==x)
            {
                return db.get(i).get(0);
            }
        }
        return "00-NULL";
    }
    public String getNombre(double x)
    {
        for (int i = 0; i < db.size(); i++){
            if(Double.parseDouble(db.get(i).get(2))==x)
            {
                return db.get(i).get(1);
            }
        }
        return "Empty, Not Found";
    }
    
    public double getNotaMinima() {
        double minimo = Double.parseDouble(db.get(0).get(2));
        for (int i = 0; i < db.size(); i++) {
            if (minimo > Double.parseDouble(db.get(i).get(2)))
                minimo = Double.parseDouble(db.get(i).get(2));
        }
        return minimo;
    }

    public double getNotaMaxima() {
        double maximo = Double.parseDouble(db.get(0).get(2));
        for (int i = 0; i < db.size(); i++) {
            if (maximo < Double.parseDouble(db.get(i).get(2)))
                maximo = Double.parseDouble(db.get(i).get(2));
        }
        return maximo;
    }

    public double getPromedio() {
        double promedio = 0;
        for (int i = 0; i < db.size(); i++) {
            promedio += Double.parseDouble(db.get(i).get(2));
        }
        return promedio / db.size();
    }

}
