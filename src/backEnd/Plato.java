package backEnd;

//@Chaval
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Plato {
//---------------------------
//atributos del plato
//---------------------------

    private String nombre;
    private String descripcion;
    private double valor;
    private ArrayList<Ingrediente> listaIngredientes;
    private int cantidad;
    private double valorExtra;
    private double descuento;
    private ImageIcon imagen;
    private int referencia;
//---------------------------
//métodos
//---------------------------

    /**
     * Constructor de Plato por defecto
     */
    public Plato() {
    }

    /**
     *
     * @param nombre
     * @param descripcion
     * @param valor
     * @param descuento
     */
    public Plato(String nombre, String descripcion, double valor, int referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.referencia = referencia;
    }

    /**
     *
     * @param nombre
     * @param descripcion
     * @param valor
     * @param listaIngredientes
     * @param imagen
     */
    public Plato(String nombre, String descripcion, double valor, ArrayList<Ingrediente> listaIngredientes, ImageIcon imagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.listaIngredientes = new ArrayList();
        setListaIngredientes(listaIngredientes);
        this.imagen = imagen;

    }

    /**
     *
     * @param nombre
     * @param descripcion
     * @param valor
     * @param listaIngredientes
     * @param descuento
     */
    public Plato(String nombre, String descripcion, double valor, ArrayList<Ingrediente> listaIngredientes, double descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.listaIngredientes = new ArrayList();
        setListaIngredientes(listaIngredientes);

    }

    /**
     *
     * @param nombre
     * @param descripcion
     * @param valor
     * @param listaIngredientes
     * @param cantidad
     * @param imagen
     */
    public Plato(String nombre, String descripcion, double valor, ArrayList<Ingrediente> listaIngredientes, int cantidad, ImageIcon imagen, int referencia) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.listaIngredientes = new ArrayList();
        setListaIngredientes(listaIngredientes);
        this.cantidad = cantidad;
        this.imagen = imagen;
        this.referencia = referencia;
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

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    /**
     * Metodo get
     *
     * @return descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Metodo set
     *
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Metodo get
     *
     * @return imagen
     */
    public ImageIcon getImagen() {
        return imagen;
    }

    /**
     * Metodo set
     *
     * @param imagen
     */
    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
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
     * Metodo get
     *
     * @return
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * Metodo set
     *
     * @param descuento
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * Metodo get
     *
     * @return listaIngredientes
     */
    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    
    /**
     * Metodo set
     *
     * @param listaIngredientes
     */
    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    /**
     * Metodo get
     *
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Metodo set
     *
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Metodo get
     *
     * @return valorExtra
     */
    public double getValorExtra() {
        return valorExtra;
    }

    /**
     * Metodo set
     *
     * @param valorExtra
     */
    public void setValorExtra(double valorExtra) {
        this.valorExtra = valorExtra;
    }

    /**
     * Metodo funcional que retorna la lista de ingredientes
     *
     * @return lista
     */
    public String imprimirListaIngredientes() {
        String lista = "Lista de ingredientes: \n";
        for (int i = 0; i < listaIngredientes.size(); i++) {
            lista = lista + (i + 1) + ". " + listaIngredientes.get(i).toString() + "\n";
        }
        return lista;
    }

    /**
     * Metodo funcional que elimina un ingrediente del plato
     *
     * @param nombre
     */
    public void eliminarIngrediente(String nombre) {
        for (int i = 0; i < listaIngredientes.size(); i++) {
            if (listaIngredientes.get(i).getNombre().compareToIgnoreCase(nombre) == 0) {
                listaIngredientes.remove(i);
                System.out.println("Se elimino correctamente el ingrediente");
                break;
            }
        }
    }

    /**
     * Metodo funcional que busca un ingrediente por su nombre dentro del plato
     *
     * @param nombre
     * @return
     */
    public Ingrediente buscarIngrediente(String nombre) {
        Ingrediente aux = null;
        for (int i = 0; i < listaIngredientes.size(); i++) {
            if (listaIngredientes.get(i).getNombre().compareToIgnoreCase(nombre) == 0) {
                aux = listaIngredientes.get(i);
                System.out.println("Se encontró el ingrediente");
                break;
            }
        }
        return aux;
    }

    /**
     * Método funcional que agrega un ingrediente al plato
     *
     * @param plato
     */
    public void agregarIngrediente(Ingrediente plato) {
        this.listaIngredientes.add(plato);
        System.out.println("Se agrego correctamente el ingrediente");
    }

    /**
     * Método que calcula el valor extra del plato
     *
     * @param valor
     */
    public void calcularExtra(double valor) {
        valorExtra = valorExtra + valor;
    }

    /**
     * Método que calcula el valorSubTotal del plato
     *
     * @return valorSubtotal
     */
    public double calcularValorSubtotal() {
        return (valorExtra + valor) * getCantidad();
    }

    /**
     * Metodo que calcula el valor del plato según el descuento ingresado
     *
     * @param descuento
     */
    public double calcularValorConDescuento(double descuento) {
        if (descuento != 0) {
            return this.valor = this.valor - descuento;
        }
        return 0;
    }

    /**
     * Método toString del Plato, facilita la impresión
     *
     * @return
     */
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nReferencia: "+ referencia +"\nValor: " + valor + "\n" + imprimirListaIngredientes() + "\nCantidad: " + getCantidad();
    }

}
