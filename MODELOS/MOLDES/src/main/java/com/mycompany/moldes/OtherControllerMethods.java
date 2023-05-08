/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moldes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author sebap
 */
public class OtherControllerMethods {
    
    /*
    Para usar estas funciones de Grabar y Cargar, Adaptarlas 
    a tu clase (Reemplazar "className") y a las variables de tu clase
    */
    
    private final String directoryRoute="./src/main/java/data/"; //Para usar este, debes agregar la carpeta data
    private final String fileName="file.csv";
    public void grabar() {
        try {
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter(directoryRoute+fileName));
            for (int i = 0; i < size(); i++) {
                linea = (get(i).getCodigo() + ";"
                        + get(i).getDescripcion() + ";"
                        + get(i).getCosto() + ";"
                        + get(i).getStock();
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    /*Aqui está "className"*/
    public void cargar()
    {
        try{
            BufferedReader br;
            String linea = null;
            String[] array = null;
            br = new BufferedReader(new FileReader(directoryRoute+fileName));
            while((linea = br.readLine())!= null){
                array = linea.split(";");
                className a = new className();
                a.setCodigo(Integer.parseInt(array[0].trim()));
                a.setDescripcion(array[1].trim());
                a.setCosto(Double.parseDouble(array[2].trim()));
                a.setStock(Integer.parseInt(array[3].trim()));
                add(a);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
