/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sebap
 */
public class Mascotas {
    private int codigo;
    private String descripcion;
    private double costo;
    private int stock;
    private String tipoDeMascota;
    
    public Mascotas(){}
    
    public Mascotas(int codigo, String descripcion, double costo, int stock, String tipoDeMascota) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.costo = costo;
        this.stock = stock;
        this.tipoDeMascota = tipoDeMascota;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoDeMascota() {
        return tipoDeMascota;
    }

    public void setTipoDeMascota(String tipoDeMascota) {
        this.tipoDeMascota = tipoDeMascota;
    }    
}
