/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Caleb
 */
public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public boolean esVacia() {
        return raiz == null;
    }

    /**
     *
     * @param nuevo
     * @param actual
     */
    private void agregarNodo(NodoArbol nuevo, NodoArbol actual) {
        if (nuevo.getDato().getReferencia() < actual.getDato().getReferencia()) {
            if (actual.getIzquierda() == null) {
                actual.setIzquierda(nuevo);
            } else {
                agregarNodo(nuevo, actual.getIzquierda());
            }
        } else { //mayores o iguales
            if (actual.getDerecha() != null) {
                agregarNodo(nuevo, actual.getDerecha());
            } else {
                actual.setDerecha(nuevo);
            }
        }
    }

    /**
     *
     * @param dato
     */
    public void agregarNodo(Plato dato) {
        if (esVacia()) {
            raiz = new NodoArbol(dato);
        } else {
            NodoArbol nuevo = new NodoArbol(dato, null, null);
            agregarNodo(nuevo, raiz);
        }
    }

    /**
     *
     * @param nodo
     * @return
     */
    public int contar(NodoArbol nodo) {
        int cont = 1;
        if (!esVacia()) {
            if (nodo.getIzquierda() != null) {
                cont += contar(nodo.getIzquierda());
            }
            if (nodo.getDerecha() != null) {
                cont += contar(nodo.getDerecha());
            }
            return cont;
        } else {
            return 0;
        }
    }

    /**
     *
     * @param nodo
     * @return
     */
    public boolean esHoja(NodoArbol nodo) {
        // José Manuel Fortún
        boolean resultado = true;
        if ((nodo.getIzquierda() == null) && (nodo.getDerecha() == null)) {
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }

    /**
     *
     * @param ref
     * @return
     */
    public Plato buscarPorReferencia(int ref) {
        if (raiz == null) {
            return null;
        } else {
            return buscar(raiz, ref);
        }
    }

    /**
     *
     * @param raiz
     * @param ref
     * @return
     */
    private Plato buscar(NodoArbol raiz, int ref) {
        if (ref == raiz.getDato().getReferencia()) {
            return raiz.getDato();
        } else {
            if (ref < raiz.getDato().getReferencia()) {
                if (raiz.getIzquierda() == null) {
                    return null;
                } else {
                    return buscar(raiz.getIzquierda(), ref);
                }
            } else {
                if (raiz.getDerecha() == null) {
                    return null;
                } else {
                    return buscar(raiz.getDerecha(), ref);
                }
            }
        }
    }

    /**
     *
     * @param referencia
     * @param nombre
     * @param descripcion
     * @param valor
     * @param descuento
     * @param listaIngredientes
     * @param imagen
     */
    public void modificar(int referencia, String nombre, String descripcion, double valor, double descuento, ArrayList<Ingrediente> listaIngredientes, ImageIcon imagen) {
        if (buscarPorReferencia(referencia) != null) {
            buscarPorReferencia(referencia).setNombre(nombre);
            buscarPorReferencia(referencia).setDescripcion(descripcion);
            buscarPorReferencia(referencia).setValor(valor);
            buscarPorReferencia(referencia).setDescuento(descuento);
            buscarPorReferencia(referencia).setListaIngredientes(listaIngredientes);
            buscarPorReferencia(referencia).setImagen(imagen);
        }
    }

    /**
     *
     * @param d
     * @return
     */
    public boolean eliminar(int d) {
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        boolean esHijoIzq = true;
        while (auxiliar.getDato().getReferencia() != d) {
            padre = auxiliar;
            if (d < auxiliar.getDato().getReferencia()) {
                esHijoIzq = true;
                auxiliar = auxiliar.getIzquierda();
            } else {
                esHijoIzq = false;
                auxiliar = auxiliar.getDerecha();
            }
            if (auxiliar == null) {
                return false;
            }
        }
        if (auxiliar.getIzquierda() == null && auxiliar.getDerecha() == null) { //es hoja
            if (auxiliar == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.setIzquierda(null);
            } else {
                padre.setDerecha(null);
            }
        } else if (auxiliar.getDerecha() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getIzquierda();
            } else if (esHijoIzq) {
                padre.setIzquierda(auxiliar.getIzquierda());
            } else {
                padre.setDerecha(auxiliar.getIzquierda());
            }
        } else if (auxiliar.getIzquierda() == null) {
            if (auxiliar == raiz) {
                raiz = auxiliar.getDerecha();
            } else if (esHijoIzq) {
                padre.setDerecha(auxiliar.getDerecha());
            } else {
                padre.setDerecha(auxiliar.getIzquierda());
            }
        } else {
            NodoArbol reemplazo = obtenerNodoReemplazo(auxiliar); //retorna el nodo que queremos reemplazar
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzq) {
                padre.setIzquierda(reemplazo);
            } else {
                padre.setDerecha(reemplazo);
            }
            reemplazo.setIzquierda(auxiliar.getIzquierda());
        }
        return true;
    }

    /**
     *
     * @param nodoReemp
     * @return
     */
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp) {
        NodoArbol reemplazarPadre = nodoReemp;
        NodoArbol reemplazo = nodoReemp;
        NodoArbol auxiliar = nodoReemp.getDerecha();
        while (auxiliar != null) {
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.getIzquierda();
        }
        if (reemplazo != nodoReemp.getDerecha()) {
            reemplazarPadre.setIzquierda(reemplazo.getDerecha()); //actualizar referencias
            reemplazo.setDerecha(nodoReemp.getDerecha());
        }
        return reemplazo;
    }

    /**
     *
     * @param r
     */
    private void mostrarTodo(NodoArbol r) { //PRE ORDEN
        if (r != null) {
            imprimir(r);
            mostrarTodo(r.getIzquierda());
            mostrarTodo(r.getDerecha());
        }
    }

    /**
     *
     * @param r
     */
    private void imprimir(NodoArbol r) {
        System.out.println("Nombre: \n" + r.getDato().getNombre() + "  \nReferencia: " + r.getDato().getReferencia()
                + "\nDescripcion:  " + r.getDato().getDescripcion() + "\nPrecio: " + r.getDato().getValor() + " \n " + r.getDato().imprimirListaIngredientes());
    }

    /**
     *
     * @param r
     * @return
     */
    public String mostrar(NodoArbol r) {
        mostrarTodo(r);
        return " ";
    }

    //------------------------------------------------------------------------//
    private void preOrden(NodoArbol actual) {
        if (actual != null) {
            System.out.println(actual.getDato());
            preOrden(actual.getIzquierda());
            preOrden(actual.getDerecha());

        }
    }

    public void preOrden() {
        if (esVacia()) {
            System.out.println("No hay elementos en el arbol");
        } else {
            preOrden(raiz);
        }
    }
    //--------------Orden central----------------------------------------------------------//

    private void inOrden(NodoArbol actual) {
        if (actual != null) {
            inOrden(actual.getIzquierda());
            System.out.println(actual.getDato());
            inOrden(actual.getDerecha());
        }

    }

    public void inOrden() {
        if (esVacia()) {
            System.out.println("No hay elementos en el arbol");
        } else {
            inOrden(raiz);
        }
    }

    //------------------------------------------------------------------------//
    private void postOrden(NodoArbol actual) {
        if (actual != null) {
            postOrden(actual.getIzquierda());
            postOrden(actual.getDerecha());
            System.out.println(actual.getDato());
        }
    }

    public void postOrden() {
        if (esVacia()) {
            System.out.println("No hay elementos en el arbol");
        } else {
            postOrden(raiz);
        }
    }

    //----------------------Por Niveles o Anchura-----------------------------//
    public Cola niveles() throws Exception {
        Cola cola1 = new Cola();
        Cola cola2 = new Cola();
        NodoArbol aux = null;
        cola1.encolar(raiz);

        while (!cola1.esVacia()) {
            aux = cola1.desencolar();

            if (aux.getIzquierda() != null) {
                cola1.encolar(aux.getIzquierda());
            }

            if (aux.getDerecha() != null) {
                cola1.encolar(aux.getDerecha());
            }

            cola2.encolar(aux);
        }
        return cola2;

    }

    private void preOrdenNiveles(NodoArbol actual, int nivel) {
        if (actual != null) {
            System.out.println(actual.getDato() + " Su nivel es:" + nivel);
            preOrdenNiveles(actual.getIzquierda(), nivel);
            preOrdenNiveles(actual.getDerecha(), nivel);

        }
    }

    public void preOrdenNiveles() {
        int nivel = 0;
        if (esVacia()) {
            System.out.println("No hay elementos en el arbol");
        } else {
            preOrdenNiveles(raiz, nivel++);
        }
    }

}
