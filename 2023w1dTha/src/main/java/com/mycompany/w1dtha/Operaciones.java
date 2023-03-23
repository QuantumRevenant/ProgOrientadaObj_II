/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.w1dtha;

/**
 *
 * @author sebap
 */
public class Operaciones {
    private double n1;
    private double n2;
    private double n3;
    private double n4;

    public Operaciones()
    {

    }

    public void setN1(double x)
    {
        n1=x;
    }
    
    public void setN2(double x)
    {
        n2=x;
    }

    public void setN3(double x)
    {
        n3=x;
    }

    public void setN4(double x)
    {
        n4=x;
    }

    public double getSuma()
    {
        return n1+n2+n3+n4;
    }
}
