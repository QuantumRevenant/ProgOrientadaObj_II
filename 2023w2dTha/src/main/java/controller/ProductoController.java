/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Producto;

/**
 *
 * @author sebap
 */
public class ProductoController {

    private ArrayList<Producto> lstProducto;

    public ProductoController() {
        lstProducto = new ArrayList<>();
    }

    public void add(Producto obj) {
        lstProducto.add(obj);
    }

    public Producto get(int pos) {
        return lstProducto.get(pos);
    }
    public void set(int pos,Producto obj)
    {
        lstProducto.set(pos, obj);
    }
    public int size() {
        return lstProducto.size();
    }

    public void remove(Producto obj) {
        lstProducto.remove(obj);
    }

    public Producto buscar(int codigo) {
        for (Producto x : lstProducto) {
            if (x.getCodigo() == codigo) {
                return x;
            }
        }
        return null;
    }

    public Producto buscar(String nombre) {
        for (Producto x : lstProducto) {
            if (x.getNombre().equalsIgnoreCase(nombre)) {
                return x;
            }
        }
        return null;
    }
    
    public int buscarIndex(int codigo)
    {
        for (int i=0;i<size();i++) {
            System.out.println(lstProducto.get(i).getCodigo());
            if (lstProducto.get(i).getCodigo() == codigo) {
                return i;
            }
        }
        return -1;
    }
    public int getCorrelativo() {
        if (lstProducto.isEmpty()) {
            return 1;
        } else {
            return lstProducto.get(size() - 1).getCodigo() + 1;
        }
    }

    public void clear() {
        lstProducto.clear();
    }

    public double getPreciosListados() {
        double salida = 0;
        for (Producto x : lstProducto) {
            salida += x.getPrecio();
        }
        return salida;
    }

    public double getPreciosXCantidades() {
        double salida = 0;
        for (Producto x : lstProducto) {
            salida += x.getPrecio() * x.getStock();
        }
        return salida;
    }

    public int getCantidadesListadas() {
        int salida = 0;
        for (Producto x : lstProducto) {
            salida += x.getStock();
        }
        return salida;
    }

}
