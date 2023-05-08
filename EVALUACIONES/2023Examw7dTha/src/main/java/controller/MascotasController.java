/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Mascotas;

/**
 *
 * @author sebap
 */
public class MascotasController {

    private ArrayList<Mascotas> mascotas = new ArrayList<>();
    private ArrayList<String> categorias = new ArrayList<>();
    
    private final String directoryRoute="./src/main/java/data/";
    private final String fileName="mascotas.csv";
    private final String categoriaFile="Categorias.csv";
    public MascotasController() {
        cargar();
        cargarCategorias();
    }
    
    public MascotasController(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
        cargar();
        cargarCategorias();
    }
    
    public ArrayList<String> getCategorias()
    {
        return categorias;
    }
    
    public int getCategoriasSize()
    {
        return categorias.size();
    }
    
    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    public void add(Mascotas obj) {
        mascotas.add(obj);
    }

    public Mascotas get(int i) {
        return mascotas.get(i);
    }

    public void set(Mascotas obj, int i) {
        mascotas.set(i, obj);
    }

    public void remove(Mascotas obj) {
        mascotas.remove(obj);
    }

    public void remove(int i) {
        mascotas.remove(i);
    }

    public int size() {
        return mascotas.size();
    }

    public int getCorrelativo() {
        if (size() <= 0) {
            return 1;
        }
        return get(size() - 1).getCodigo() + 1;
    }

    public Mascotas search(int codigo) {
        for (int i = 0; i < size(); i++) {
            if (mascotas.get(i).getCodigo() == codigo) {
                return mascotas.get(i);
            }
        }
        return null;
    }

    public void grabar() {
        try {
            PrintWriter pw;
            String linea;
            pw = new PrintWriter(new FileWriter(directoryRoute+fileName));
            for (int i = 0; i < size(); i++) {
                linea = (get(i).getCodigo() + ";"
                        + get(i).getDescripcion() + ";"
                        + get(i).getCosto() + ";"
                        + get(i).getStock() + ";"
                        + get(i).getTipoDeMascota());
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void cargar()
    {
        try{
            BufferedReader br;
            String linea = null;
            String[] array = null;
            br = new BufferedReader(new FileReader(directoryRoute+fileName));
            while((linea = br.readLine())!= null){
                array = linea.split(";");
                Mascotas a = new Mascotas();
                a.setCodigo(Integer.parseInt(array[0].trim()));
                a.setDescripcion(array[1].trim());
                a.setCosto(Double.parseDouble(array[2].trim()));
                a.setStock(Integer.parseInt(array[3].trim()));
                a.setTipoDeMascota(array[4].trim());
                add(a);
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void cargarCategorias()
    {
        try{
            BufferedReader br;
            String linea = null;
            String[] array = null;
            br = new BufferedReader(new FileReader(directoryRoute+categoriaFile));
            while((linea = br.readLine())!= null){
                array = linea.split(";");
                for(String x:array)
                {
                    categorias.add(x);
                }
            }
            br.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
