/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sebap
 */
public class Categoria {

    private int codigoCategoria;
    private String descripcionCategoria;

    public Categoria() {
    }

    public Categoria(int codigoCategoria, String codigoDescripcion) {
        this.codigoCategoria = codigoCategoria;
        this.descripcionCategoria = codigoDescripcion;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
    
    

}
