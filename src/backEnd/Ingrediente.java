/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

/**
 *
 * @author Caleb
 */
public class Ingrediente {

    //
    //--------atributos-----------
    //
    private String nombre;
    private double valor;

    //
    //--------métodos-----------
    //
    /**
     * Constructor por parámetros de clase Ingrediente
     *
     * @param nombre
     * @param valor
     */
    public Ingrediente(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    /**
     * Metodo get
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo set
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo get
     *
     * @return valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Metodo set
     *
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * Metodo toString que imprime la información del ingrediente
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ingredientes: " + "\nnombre: " + nombre + "\nvalor unitario=" + valor;
    }

}
