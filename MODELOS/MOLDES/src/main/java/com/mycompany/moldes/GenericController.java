/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moldes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebap
 */
public class GenericController<T> {
    private List<T> list = new ArrayList<>();

    public GenericController() {
    }    
    
    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
    
    public void add(T objeto)
    {
        list.add(objeto);
    }
    
    public T get (int i)
    {
        return list.get(i);
    }

    public void set(int pos, T objeto)
    {
        list.set(pos, objeto);
    }
    
    public void remove(int pos)
    {
        list.remove(pos);
    }
    
    public void remove(T objeto)
    {
        list.remove(objeto);
    }
    
    public int size()
    {
        return list.size();
    }
        
    public void clear()
    {
        list.clear();
    }
}
