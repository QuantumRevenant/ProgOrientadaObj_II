/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sebap
 */
public class Marca {
    private int codigoMarca;
    private String descripcionMarca;

    public Marca() {
    }

    public Marca(int codigoMarca, String descripcionMarca) {
        this.codigoMarca = codigoMarca;
        this.descripcionMarca = descripcionMarca;
    }

    public int getCodigoMarca() {
        return codigoMarca;
    }

    public void setCodigoMarca(int codigoMarca) {
        this.codigoMarca = codigoMarca;
    }

    public String getDescripcionMarca() {
        return descripcionMarca;
    }

    public void setDescripcionMarca(String descripcionMarca) {
        this.descripcionMarca = descripcionMarca;
    }    
}
