package backEnd;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

//---------------------------
//atributos de la factura
//---------------------------
    private String metodoPago;

    private Cliente cliente;

//---------------------------
//métodos
//---------------------------
    /**
     * Constructor de Factura
     *
     * @param metodoPago
     * @param cliente
     */
    public Factura(String metodoPago, Cliente cliente) {
        this.metodoPago = metodoPago;
        this.cliente = cliente;
    }
/**
 * Constructor por defecto de Factura
 */
    public Factura() {

    }
/**
 * Método get
 * @return metodoPago
 */
    public String getMetodoPago() {
        return metodoPago;
    }
/**
 * Metodo set
 * @param metodoPago 
 */
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
/**
 * Metodo get
 * @return cliente
 */
    public Cliente getCliente() {
        return cliente;
    }
/**
 * Metodo set
 * @param cliente 
 */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  /**
    * Metodo funcional que retorna el total de la factura
    * @return totalFactura
    */ 
    public String calcularTotalFactura() {
        DecimalFormat formato = new DecimalFormat("#.00");
        double n = (cliente.getPedido().valorSubtotal() * 1.12);
        return formato.format(n);
    }
/**
     * Metodo funcional que retorna la fecha actual con un formato definido
     * dd/MM/YYYY
     * @return  fechaActual
     */
    public String fechaActual() {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");

        return formatoFecha.format(fecha);

    }
/**
     * Metodo toString para facilitar la impresion
     * 
     * @return  informacion Factura
     */
    @Override
    public String toString() {
        return "Factura" + "\nFecha=" + fechaActual() + "\nMetodo de Pago: " + metodoPago + "\nCliente: " + cliente.getNombre() + "\nTotal Iva:  12% " + "\nSubtotal: " + cliente.getPedido().valorSubtotal() + "\nValor Total a pagar: " + calcularTotalFactura();
    }

}
