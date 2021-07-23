package backEnd;

import java.util.ArrayList;

public class Restaurante {

    //---------------------------
//atributos del restaurante
//---------------------------
    private int aforoMax;

    private ListaDoble clientes;

    private Menu menu;

    private int aforoAct;

    private String contrasenia;

    private String usuario;

    private String politicas;

    //Metodos del restaurante administrador
    //-------------------------------------
    /**
     * Constructor del administrador se le asigna una contraseña y un usuario
     * por motivos de seguridad
     *
     * @param contrasenia
     * @param usuario
     */
    public Restaurante(String contrasenia, String usuario) {
        clientes = new ListaDoble();
        menu = new Menu();
        aforoMax = 10;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public String getPoliticas() {
        return politicas;
    }

    /**
     *
     * @param politicas
     */
    public void setPoliticas(String politicas) {
        this.politicas = politicas;
    }

    /**
     *
     * @return
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     *
     * @param contrasenia
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     *
     * @return
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     */
    public int getAforoMax() {
        return aforoMax;
    }

    /**
     *
     * @param aforoMax
     */
    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }

    /**
     *
     * @return
     */
    public int getAforoAct() {
        return aforoAct;
    }

    /**
     *
     * @param aforoAct
     */
    public void setAforoAct(int aforoAct) {
        this.aforoAct = aforoAct;
    }

    /**
     *
     * @return
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     *
     * @param menu
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ListaDoble getClientes() {
        return clientes;
    }

    public void setClientes(ListaDoble clientes) {
        this.clientes = clientes;
    }

    

    /**
     * Método funcional que agrega un cliente al sistema
     *
     * @param cliente
     * @return
     */
    public String agregarCliente(Cliente cliente) {
        if (aforoMax > (aforoAct + cliente.getAcompaniantes() + 1)) {
            this.clientes.insertarInicio(cliente);
            aforoAct = cliente.getAcompaniantes() + 1;
            return "Bienvenido al restaurante pacifico";
        } else {
            return "Supera el aforo por: " + ((aforoAct + cliente.getAcompaniantes() + 1) - aforoMax) + " acompañantes";
        }
    }


    /**
     * Método funcional que busca un cliente en el sistema
     *
     * @param nombre
     * @param numCedul
     * @return clienteEncontrado
     */
    public Cliente buscarCliente(String numCedul) {
        Cliente encontrado = clientes.buscarNodo(numCedul);
        return encontrado;
    }

    /**
     *
     * @param numCedul
     * @return
     */
    public Cliente buscarCliente(String nombre, String numCedul) {
      Cliente encontrado = clientes.buscarNodo(nombre , Integer.parseInt(numCedul));
        return encontrado;
        
    }

    /**
     * Método funcional que verifica la reservación de un cliente según su
     * registro en el sistema
     *
     * @param nombre
     * @param numCedul
     * @return
     * @throws Exception
     */
    public boolean verfificarReservacion(String nombre, String numCedul) throws Exception {
        if (buscarCliente(nombre, numCedul) == null) {
            throw new Exception("No existe un cliente con esa informacion en el sistema");
        } else {
            return buscarCliente(nombre, numCedul).getVerificacionReserva();
        }
    }

    /**
     * Método funcional que verifica la penalización de un cliente según su
     * registro en el sistema
     *
     * @param nombre
     * @param numCedul
     * @return
     * @throws Exception
     */
    public String verificarPenalizacion(String nombre, String numCedul) throws Exception {
        if (verfificarReservacion(nombre, numCedul)) {
            return "No cuenta con una reservacion";
        } else {
            return buscarCliente(nombre, numCedul).getPenalizacion();
        }
    }

    /**
     * Metodo que modifica el aforo maximo permitido
     *
     * @param aforoMax
     */
    public void modificarAforoMax(int aforoMax) {
        setAforoMax(aforoMax);
    }

}
