package backEnd;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Menu {
//---------------------------
//atributos del menú
//---------------------------

    private ArbolBinario platos;

//---------------------------
//métodos
//---------------------------
    /**
     * Constructor por defecto de la clase Menú
     */
    public Menu() {
        platos = new ArbolBinario();
    }

    /**
     * Método get
     *
     * @return lista de platos
     */
    public ArbolBinario getPlatos() {
        return platos;
    }

    /**
     * Método set
     *
     * @param platos
     */
    public void setPlatos(ArbolBinario platos) {
        this.platos = platos;
    }

    /**
     * Método funcional que agrega un plato a la lista
     *
     * @param plato
     */
    public void agregarPlato(Plato plato) {
        platos.agregarNodo(plato);
    }

    /**
     * Metodo funcional que busca un plato en la lista
     *
     * @param nombre
     * @return
     */
    public Plato buscarPlato(int referencia) {
        return platos.buscarPorReferencia(referencia);
    }

    /**
     * Metodo funcional que elimina un plato de la lista
     *
     * @param referencia
     * 
     */
    public void eliminarPlato(int referencia) throws Exception {
        platos.eliminar(referencia);
        System.out.println("Plato eliminado con éxito");
    }

    /**
     * Metodo funcional que modifica un plato de la lista
     *
     * @param nombre
     * @param descripcion
     * @param valor
     * @param descuento
     * @param listaIngredientes
     * @param imagen
     */
    public void modificarPlato(int referencia,String nombre, String descripcion, double valor, double descuento, ArrayList<Ingrediente> listaIngredientes, ImageIcon imagen) {
        platos.modificar(referencia, nombre, descripcion, valor, descuento, listaIngredientes, imagen);
    }

    /**
     * Metodo funcional que no retorna valor Imprime la lista de platos del
     * Restaurante Pacífico
     */
    public void imprimirListaPlatos() {
        platos.mostrar(platos.getRaiz());
    }

}
