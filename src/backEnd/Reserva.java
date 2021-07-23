package backEnd;

import java.util.Date;

public class Reserva {

//---------------------------
//atributos de la reserva
//---------------------------
    String nombreCliente;

    String numCedula;

    Date fechaReserva;

    Date fechaRealizoReserva;

    String plazo;
    //---------------------------
//métodos
//---------------------------

    /**
     * Constructor por parámetros
     *
     * @param nombreCliente
     * @param numCedula
     * @param fechaReserva
     */
    public Reserva(String nombreCliente, String numCedula, Date fechaReserva) {
        this.nombreCliente = nombreCliente;
        this.numCedula = numCedula;
        this.fechaReserva = fechaReserva;
        reservar();
        plazo = calcularPlazo();
    }

    /**
     * Método get
     *
     * @return nombre del cliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * Metodo set
     *
     * @param nombreCliente
     */
    /**
     * Metodo set
     *
     * @param nombreCliente
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * Metodo get
     *
     * @return
     */
    public String getNumCedula() {
        return numCedula;
    }

    /**
     * Metodo set
     *
     * @param numCedula
     */
    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    /**
     * Metodo get
     *
     * @return
     */
    public String getPlazo() {
        return plazo;
    }

    /**
     * Metodo set
     *
     * @param plazo
     */
    public void setPlazo(String plazo) {
        this.plazo = plazo;
    }

    /**
     * Metodo get
     *
     * @return
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Metodo set
     *
     * @param fechaReserva
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Método funcional que retorna el numero de dias entre dos fechas
     *
     * @param fecha1
     * @param fecha2
     * @return
     */
    private int numeroDiasEntreDosFechas(Date fecha1, Date fecha2) {
        long startTime = fecha1.getTime();
        long endTime = fecha2.getTime();
        long diffTime = endTime - startTime;
        long diffDays = diffTime / (1000 * 60 * 60 * 24);
        return (int) diffDays;
    }

    /**
     * Método funcional que calcula el plazo de la reserva según las fechas
     * respectivas
     */
    public String calcularPlazo() {
        Date fechaActual = new Date();
        int dias = numeroDiasEntreDosFechas(fechaActual, fechaReserva);
        System.out.println(dias);
        if (dias == 30 || dias > 30) {
            return "Largo plazo";
        } else if (dias == 10) {
            return "Mediano plazo";
        } else if (dias == 5) {
            return "Corto plazo";
        }
        return "Plazo no encontrado";
    }

    /**
     * Método funcional que realiza la reserva según los calculos necesarios
     */
    private void reservar() {
        Date fechaActual = new Date();
        calcularPlazo();
        fechaRealizoReserva = fechaActual;
    }
    /**
     * Método funcional que cancela una Reserva, considerando el plazo de esta y estableciendo
     * una penalización 
     * @return penalización
     */
    public String cancelarReserva() {
        Date fechaActual = new Date();
        if (plazo.compareTo("Largo plazo") == 0) {
            if (numeroDiasEntreDosFechas(fechaRealizoReserva, fechaActual) <= 10) {
                return "ATENCIÓN: No se devolverá la garantía";
            } else {
                return "Se devolverá la garantía";
            }
        } else if (plazo.compareTo("Mediano plazo") == 0) {
            if (numeroDiasEntreDosFechas(fechaRealizoReserva, fechaActual) <= 3) {
                return "ATENCIÓN: No se devolverá la garantía";
            } else {
                return "Se devolverá la garantía";
            }
        } else if (plazo.compareTo("Corto plazo") == 0) {
            if (numeroDiasEntreDosFechas(fechaRealizoReserva, fechaActual) <= 1) {
                return "ATENCIÓN: No se devolverá la garantía";
            } else {
                return "Se devolverá la garantía";
            }
        }
        return "ERROR";
    }

    /*public void imprimirReservas() {
        for (int i = 0; i < clientes.size(); i++) {
            clientes.get(i).getReserva().toString();
        }
    }*/
    @Override
    public String toString() {
        return "Reservación :" + " \nCliente: " + getNombreCliente() + "\n Numero de cédula: " + getNumCedula()
                + "\nPlazo: " + getPlazo();
    }

}
