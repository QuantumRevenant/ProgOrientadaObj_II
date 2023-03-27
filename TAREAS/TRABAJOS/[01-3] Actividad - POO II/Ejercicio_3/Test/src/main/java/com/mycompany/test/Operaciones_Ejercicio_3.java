/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;
import java.util.ArrayList;
/**
 *
 * @author bravo
 */
public class Operaciones_Ejercicio_3 {
    
    private int n;
    private ArrayList divisores = new ArrayList();
    
    public Operaciones_Ejercicio_3(){}
    public Operaciones_Ejercicio_3(int _n){
        n = _n;
    }
    public ArrayList getDivisores(){
        for(int i=1; i<=n/2; i++){
            if(n%i == 0){
                divisores.add(i);
            }
        }
        divisores.add(n);
        return divisores;
    }
}
