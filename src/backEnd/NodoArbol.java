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
public class NodoArbol {

    private Plato dato;
    private NodoArbol izquierda; //Estos dos nodos representan un arbol binario
    private NodoArbol derecha; //Para un arbol n-ario se tuviera una coleccion de nodos

    public NodoArbol(Plato dato) {
        this.dato = dato;
        izquierda = null;
        derecha = null;
    }

    public NodoArbol(Plato dato, NodoArbol izquierda, NodoArbol derecha) {
        this.dato = dato;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public Plato getDato() {
        return dato;
    }

    public void setDato(Plato dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

   
}
