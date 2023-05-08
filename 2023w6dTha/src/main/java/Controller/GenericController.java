/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Categoria;
import Model.Marca;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author sebap
 */
public class GenericController<T> {

    private List<T> list = new ArrayList<>();

    public GenericController() {
    }

    public List<T> getList() {
        return list.stream().collect(Collectors.toList());
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void add(T objeto) {
        list.add(objeto);
    }

    public T get(int i) {
        return list.get(i);
    }

    public void set(int pos, T objeto) {
        list.set(pos, objeto);
    }

    public void remove(int pos) {
        list.remove(pos);
    }

    public void remove(T objeto) {
        list.remove(objeto);
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public String listarCategoria(Categoria x) {
        String s = (x.getCodigoCategoria() + " " + x.getDescripcionCategoria() + "\n");
        return s;
    }
    
    public String listarMarca(Marca x) {
        String s = (x.getCodigoMarca()+ " " + x.getCodigoMarca()+ "\n");
        return s;
    }
}
