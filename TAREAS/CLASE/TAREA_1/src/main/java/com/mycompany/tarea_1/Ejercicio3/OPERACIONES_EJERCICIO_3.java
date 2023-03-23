/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_1.Ejercicio3;

/**
 *
 * @author sebap
 */
public class OPERACIONES_EJERCICIO_3 {

    private double precioUnitario;
    private double descuento;
    private double cantidad;

    public void setPrecioUnitario(double x) {
        precioUnitario = x;
    }

    public void setDescuento(double x) {
        descuento = x;
    }

    public void setCantidad(double x) {
        cantidad = x;
    }

    public OPERACIONES_EJERCICIO_3() {
        precioUnitario = descuento = cantidad = 0;
    }

    public OPERACIONES_EJERCICIO_3(float prcUnit, int qnt) {
        precioUnitario = prcUnit;
        cantidad = qnt;
        descuento = 0;
    }

    public OPERACIONES_EJERCICIO_3(float prcUnit, int qnt, float dscnt) {
        precioUnitario = prcUnit;
        cantidad = qnt;
        descuento = dscnt;
    }

    public double getImporteCompra() {
        return precioUnitario * cantidad;
    }

    public double getDescuentoIterativos(double iteraciones)
    {   
        double salida;
        if (iteraciones <= 1) {
            salida = getImporteCompra();
        } else {
            salida = getDescuentoIterativos(iteraciones - 1) * (1 - descuento) + getImporteCompra();
        }
        return salida;
    }

    public double getDescuentoTotalConsecutivos(double iteraciones)
    {
        return descuento * getDescuentoIterativos(iteraciones);
    }

    public double getImporteTotal(double iteraciones)
    {
        return getImporteCompra() - getDescuentoTotalConsecutivos(iteraciones);
    }
}
