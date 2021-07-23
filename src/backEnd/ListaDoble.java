/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

public class ListaDoble {

    private NodoListaDoble inicio;
    private NodoListaDoble fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean esVacia() {
        return inicio == null && fin == inicio;
    }
/**
 * 
 * @param dato 
 */
    public void insertarInicio(Cliente dato) {
        NodoListaDoble nuevo = new NodoListaDoble(dato, null, inicio);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }
/**
 * 
 * @param dato 
 */
    public void insertarFin(Cliente dato) {
        NodoListaDoble nuevo = new NodoListaDoble(dato, fin, null);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.setAnterior(nuevo);
            fin = nuevo;
        }
    }
/**
 * 
 */
    public void eliminarFinal() {
        if (inicio == fin && fin != null) {
            inicio = fin = null;
            System.out.println("Se elimino el ulotimo nodo");
        } else if (inicio == fin) {
            System.out.println("Lista es vacia");

        } else {
            fin = fin.getAnterior();
            fin.setSiguiente(null);
        }
    }
/**
 * 
 * @param dato
 * @param numero
 * @return 
 */
    public boolean insertarAntes(Cliente dato, int numero) {

        if (Integer.parseInt(inicio.getDato().getNumCedula()) == numero) {
            insertarInicio(dato);
            return true;
        } else {
            NodoListaDoble aux = inicio.getSiguiente();
            while (aux != null) {
                if (Integer.parseInt(inicio.getDato().getNumCedula()) == numero) {
                    NodoListaDoble nuevo = new NodoListaDoble(dato, aux.getAnterior(), aux);
                    aux.getAnterior().setSiguiente(nuevo);
                    aux.setAnterior(nuevo);
                    return true;
                }
                aux = aux.getSiguiente();
            }
        }
        return false;

    }
/**
 * 
 */
    public void imprimir() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            NodoListaDoble aux = inicio;
            while (aux != null) {
                System.out.println(aux.getDato().toString());
                aux = aux.getSiguiente();
            }
        }
    }
/**
 * 
 */
    public void imprimirInverso() {
        if (esVacia()) {
            System.out.println("No hay elementos");
        } else {
            NodoListaDoble aux = fin;
            while (aux != null) {
                System.out.println(aux.getDato().toString());
                aux = aux.getAnterior();
            }
        }
    }
/**
 * 
 * @param numero
 * @return 
 */
    public boolean eliminar(int numero) {
        if (esVacia()) {
            System.out.println("No hay elementos");
            return false;
        } else {
            if (inicio == fin && Integer.parseInt(inicio.getDato().getNumCedula()) == numero) {
                inicio = fin = null;
                System.out.println("Se eliminó " + numero);
                return true;
            } else if (Integer.parseInt(inicio.getDato().getNumCedula()) == numero) {
                NodoListaDoble aux = inicio;
                inicio = inicio.getSiguiente();
                aux.setSiguiente(null);
                inicio.setAnterior(null);
                System.out.println("Se eliminó " + numero);
                return true;
            } else if (Integer.parseInt(fin.getDato().getNumCedula()) == numero) {
                NodoListaDoble aux = fin;
                fin = fin.getAnterior();
                aux.setAnterior(null);
                fin.setSiguiente(null);
                System.out.println("Se eliminó " + numero);
                return true;
            } else {
                NodoListaDoble aux = inicio;
                while (aux != null && Integer.parseInt(aux.getDato().getNumCedula()) != numero) {
                    aux = aux.getSiguiente();
                }
                if (aux == null) {
                    System.out.println("No existe el número " + numero);
                    return false;
                } else {
                    aux.getAnterior().setSiguiente(aux.getSiguiente());
                    aux.getSiguiente().setAnterior(aux.getAnterior());
                    aux.setAnterior(null);
                    aux.setSiguiente(null);
                    System.out.println("Se elimino el numero " + numero);
                    return true;
                }

            }
        }
    }
/**
 * 
 * @return 
 */
    public int contar() {
        if (esVacia()) {
            return 0;
        } else {
            NodoListaDoble aux = inicio;
            int cont = 0;
            while (aux != null) {
                cont++;
                aux = aux.getSiguiente();
            }
            return cont;
        }
    }
/**
 * 
 * @param indice
 * @return
 * @throws Exception 
 */
    public Cliente valorIndice(int indice) throws Exception {
        if (esVacia()) {
            throw new Exception(" Lista vacia");
        }
        NodoListaDoble aux = inicio;
        for (int i = 0; i < indice; i++) {
            aux = aux.getSiguiente();
        }
        return aux.getDato();
    }
/**
 * 
 * @throws Exception 
 */
    public void eliminarInicio() throws Exception {
        if (esVacia()) {
            throw new Exception("Esta vacia");
        }
        NodoListaDoble aux = inicio;
        inicio = inicio.getSiguiente();
        if (inicio == null) {
            fin = null;
        }
        aux.setSiguiente(null);
        aux.setAnterior(null);
    }
/**
 * 
 */
    public void ordenarPorBurbuja() {
        int num = contar();
        NodoListaDoble aux = inicio;
        for (int i = 0; i < num - 1; i++) {
            NodoListaDoble aux2 = aux.getSiguiente();
            for (int j = i + 1; j < num; j++) {
                if (Integer.parseInt(aux.getDato().getNumCedula()) > Integer.parseInt(aux2.getDato().getNumCedula())) {
                    Cliente auxFactura = aux.getDato();
                    aux.setDato(aux2.getDato());
                    aux2.setDato(auxFactura);
                }
                aux2 = aux2.getSiguiente(); //cambia al siguiente
            }
            aux = aux.getSiguiente(); //cambia al segundo                              
        }
    }
/**
 * 
 * @param numCedul
 * @return 
 */
    public Cliente buscarNodo(String numCedul) {
        NodoListaDoble actual;
        actual = inicio;
        while (actual != null) {
            if (actual.getDato().getNumCedula().compareTo(numCedul) == 0) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
/**
 * 
 * @param nombre
 * @param numCedul
 * @return 
 */
    public Cliente buscarNodo(String nombre, int numCedul) {
        NodoListaDoble actual;
        actual = inicio;
        while (actual != null) {
            if (Integer.parseInt(actual.getDato().getNumCedula()) == numCedul && actual.getDato().getNombre().compareTo(nombre) == 0) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return actual.getDato();
    }
/**
 * 
 * @param valor
 * @return
 * @throws Exception 
 */
    public int busquedaBinaria(int valor) throws Exception {
        ordenarPorBurbuja();
        if (esVacia()) {
            return -1;
        }
        if (valor < Integer.parseInt(inicio.getDato().getNumCedula()) || valor > Integer.parseInt(fin.getDato().getNumCedula())) {
            return -1;
        }
        int inf = 0;
        int sup = contar() - 1;
        int centro;
        while (inf <= sup) {
            centro = (inf + sup) / 2;
            int num = Integer.parseInt(valorIndice(centro).getNumCedula());
            if (num == valor) {
                return centro;
            } else if (valor > num) {
                inf = centro + 1;
            } else {
                sup = centro - 1;
            }

        }
        return -1;
    }
}
