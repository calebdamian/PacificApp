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
public class Cola {
     private Nodo inicio;
    private Nodo fin;

    public Cola() {
        inicio = fin = null;
    }
    
    public void encolar(NodoArbol dato){
        Nodo nuevo = new Nodo(dato, null);
        if(esVacia()){
            inicio = fin = nuevo;
        }else{
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public boolean esVacia(){
        return inicio == null && fin == null;
    }
    
    public NodoArbol desencolar() throws Exception{
        if(esVacia())
            throw new Exception("No hay elementos");
        Nodo aux = inicio;
        inicio = inicio.getSiguiente();
        if(inicio == null){
            fin = null;
        }
        aux.setSiguiente(null);
        return aux.getDato();
    }
    
    public void imprimir(){
        if(esVacia())
            System.out.println("No hay elementos");
        else {
            Nodo aux = inicio;
            while(aux!=null){
                System.out.println(aux.getDato().getDato()); //imprime informacion del nodoArbol
                aux = aux.getSiguiente();
            }
        }
    }
    
    public int contar(){
         if (esVacia())
                return 0;
        Nodo aux = inicio;
        int cont = 0;
        while(aux != null){
             cont ++;
             aux = aux.getSiguiente();
        }
        return cont;
    }
}
