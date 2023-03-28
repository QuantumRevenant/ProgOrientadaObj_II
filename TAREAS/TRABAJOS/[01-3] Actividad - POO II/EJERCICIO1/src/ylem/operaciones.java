/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ylem;

import java.util.*;

/**
 *
 * @author YLEM DIOSES
 */
public class operaciones {
    float suma = 0;
    float sumaP = 0;
    float sumaI = 0;
    float promedio;
    
    public operaciones(){
    }
    
    float suma(ArrayList<Float> arrNum){
        for(float num : arrNum)
        {
            suma += num;
        }
        return suma;
    }
    
    float promedio(ArrayList<Float> arrNum){
        promedio = suma/arrNum.size();
        return promedio;
    }
    
    float sumPar(ArrayList<Float> arrNum){
        for(int i = 0; i < arrNum.size(); i++)
        {
            if(arrNum.get(i)%2 == 0){
                sumaP += arrNum.get(i);                
            }
        }
        return sumaP;
    }
    
    float sumImpar(ArrayList<Float> arrNum){
        for(int i = 0; i < arrNum.size(); i++)
        {
            if(arrNum.get(i)%2 == 0){
            }
            else{
                sumaI += arrNum.get(i);
            }
        }
        return sumaI;
    }
    
}
