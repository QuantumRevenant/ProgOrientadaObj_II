/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_1.Ejercicio4;

/**
 *
 * @author alumno
 */
public class OperacionesEjercicio4 {
    private double n1;
    private double n2;

    public OperacionesEjercicio4(){}
    public OperacionesEjercicio4(double _n1,double _n2)
    {
        n1 = _n1;
        n2 = _n2;
    }

    public double getSueldoBruto()
    {
        return n1 * n2;
    }
    public double getDescuento()
    {
        return getSueldoBruto() * 0.15;
    }
    public double getSueldoNeto()
    {
        return getSueldoBruto() - getDescuento();
    }
}
