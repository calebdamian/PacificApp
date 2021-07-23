/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import java.util.ArrayList;

/**
 *
 * @author Caleb
 */
public class Main {
    
    public static void main(String[] args) throws Exception {
        Menu m = new Menu();
        ArrayList<Ingrediente> listaIngredientes = new ArrayList();
        Ingrediente i1 = new Ingrediente("pan", 1.50);
        Ingrediente i2 = new Ingrediente("queso", 0.50);
        listaIngredientes.add(i1);
        listaIngredientes.add(i2);
        Plato p1 = new Plato("PLATO 1", "DESCRIPCION", 30.00, 0, 700);
        Plato p2 = new Plato("PLATO 2", "DESCRIPCION", 30.00, 0, 100);
        Plato p3 = new Plato("PLATO 3", "DESCRIPCION", 30.00, 0, 1);
        p1.setListaIngredientes(listaIngredientes);
        p2.setListaIngredientes(listaIngredientes);
        p3.setListaIngredientes(listaIngredientes);
        m.agregarPlato(p1);
        m.agregarPlato(p2);
        m.agregarPlato(p3);
        System.out.println("PRIMERA IMPRESION---------");
        m.imprimirListaPlatos();
        System.out.println("BUSQUEDA");
        System.out.println(m.buscarPlato(100).toString());
        m.eliminarPlato(700);
        System.out.println("SEGUNDA IMPRESION---------");
        m.imprimirListaPlatos();
        m.getPlatos().modificar(1, "NOMBRE NUEVO", "NUEVA DESCR",100, 2, listaIngredientes, null);
        System.out.println("TERCERA IMPRESION---------");
        m.imprimirListaPlatos();
        System.out.println(m.getPlatos().contar(m.getPlatos().getRaiz()));
        Cola colita = m.getPlatos().niveles();
        colita.imprimir();
    }
    
}
