
package backEnd;

import java.util.Date;

public class Cliente {

    private String nombre;

    private String numCedula;

    private int acompaniantes;

    private String telefono;

    private Pedido pedidos;

    private boolean verificacionReserva;

    private String penalizacion;
    
    private Reserva reserva; 
    
    
/**
 * Constructor del Cliente por defecto
 */
    public Cliente() {
    }
/**
 * Constructor del cliente por parámetros
 * @param nombre
 * @param numCedula
 * @param acompaniantes
 * @param telefono 
 */
    public Cliente(String nombre, String numCedula, int acompaniantes, String telefono) {
    this.nombre= nombre;
    this.numCedula= numCedula;
    this.acompaniantes= acompaniantes;
    this.telefono=telefono;  
    }
  /**
   * Metodo get
   * @return nombre
   */
    public String getNombre() {
        return nombre;
    }
/**
 * Metodo set
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Metodo get
 * @return numero de cedula
 */
    public String getNumCedula() {
        return numCedula;
    }
/**
 * Metodo set
 * @param numCedula 
 */
    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }
/**
 * Metodo get
 * @return numero de acompañantes
 */
    public int getAcompaniantes() {
        return acompaniantes;
    }
/**
 * Metodo set
 * @param acompaniantes 
 */
    public void setAcompaniantes(int acompaniantes) {
        this.acompaniantes = acompaniantes;
    }
/**
 * Metodo get
 * @return numero telefono
 */
    public String getTelefono() {
        return telefono;
    }
/**
 * Metodo set
 * @param telefono 
 */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
/**
 * Metodo get
 * @return 
 */
    public Pedido getPedido() {
        return pedidos;
    }
/**
 * Metodo set
 * @param pedidos 
 */
    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }
/**
 * Metodo get
     * @return penalizacion
 */
    public String getPenalizacion() {
        return penalizacion;
    }
/**
 * Metodo set
 * @param penalizacion 
 */
    public void setPenalizacion(String penalizacion) {
        this.penalizacion = penalizacion;
    }
      /**
 * Metodo get 
     * @return reserva
 */
    public Reserva getReserva(){
        return reserva;
    }
    /**
 * Metodo get, verifica si el cliente ha agendado una reserva
     * @return verificacion de la reserva
 */
    public boolean getVerificacionReserva(){
        return verificacionReserva;
    }

//    public void visualizarMenu() {
//        Restaurante.getMenu().imprimirListaPlatos();
//    }

    //public void revisarPregutas() {
    //}

//    public void pedir(/*Plato plato*/) {
//        Plato p1= new Plato("ceviche", "hola", 100);
//        pedidos.agregarPlatoPedido(p1);
//        
//    }
/**
 * Metodo funcional para obtener el valor del subtotal del pedido
 */
    public void visualizarValorPedido() {
        System.out.println("El valor subtotal se su pedido es: "+getPedido().valorSubtotal());
    }
/**
 * Metodo funcional para generar una reserva
     * @param fechareserva
 */
    public void reservar(Date fechareserva) {
     reserva=new Reserva(getNombre(),getNumCedula(),fechareserva);
     verificacionReserva= true;
    }
        
/**
 * Metodo funcional para visualizar la información del cliente
     * @return String
 */
    public String visualizarInformacion() {
        return "Nombre: "+getNombre()+"\nNumero de cedula: "+getNumCedula()+"\nTelefono: "+getTelefono()+"\nAcompañantes: "+getAcompaniantes()/*+"Reserva: "+verificacionReserva*/;
    }
/**
 * Metodo funcional para cancelar la reserva del cliente
 */
    public void cancelarReserva() {
      penalizacion= reserva.cancelarReserva();
      verificacionReserva=false;
    }
/**
 * Metodo toString para facilitar la impresión de datos
 */
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", numCedula=" + numCedula + ", acompaniantes=" + acompaniantes + ", telefono=" + telefono + '}';
    }
    
    
}
