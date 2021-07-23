package backEnd;

import java.util.ArrayList;

public class Pedido {
//---------------------------
//atributos del pedido
//---------------------------

    private ArrayList<Plato> platos;
//---------------------------
//métodos
//---------------------------

    /**
     * Constructor por defecto de la clase Pedido
     */
    public Pedido() {
        platos = new ArrayList();
    }

    /**
     * Metodo get
     *
     * @return lista platos
     */
    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    /**
     * Metodo set
     *
     * @param platos
     */
    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }

    /**
     * Método funcional que agrega un plato al pedido
     *
     * @param plato
     */
    public void agregarPlatoPedido(Plato plato) {
        this.platos.add(plato);
    }

    /**
     * Método funcional que elimina un plato del pedido total
     *
     * @param plato1
     */
    public void eliminarplatoPedidoTotal(Plato plato1) {
        boolean aux = false;
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().compareTo(plato1.getNombre()) == 0 && platos.get(i).getDescripcion().compareTo(plato1.getDescripcion()) == 0 && platos.get(i).getValor() == plato1.getValor()) {
                for (int j = 0; j < platos.get(i).getListaIngredientes().size(); j++) {
                    if (platos.get(i).getListaIngredientes().get(j).getNombre().compareTo(plato1.getListaIngredientes().get(j).getNombre()) == 0) {
                        aux = true;
                    } else {
                        aux = false;
                        break;
                    }
                }
                if (aux) {
                    platos.remove(i);
                    break;
                }
            }
        }
    }

    /**
     * Método funcional que resta el plato a eliminar de la cantidad agregada
     * anteriormente
     *
     * @param plato1
     */
    public void eliminarplatoPedidoCant(Plato plato1) {
        boolean aux = false;
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().compareTo(plato1.getNombre()) == 0 && platos.get(i).getDescripcion().compareTo(plato1.getDescripcion()) == 0 && platos.get(i).getValor() == plato1.getValor()) {
                for (int j = 0; j < platos.get(i).getListaIngredientes().size(); j++) {
                    if (platos.get(i).getListaIngredientes().get(j).getNombre().compareTo(plato1.getListaIngredientes().get(j).getNombre()) == 0) {
                        aux = true;
                    } else {
                        aux = false;
                        break;
                    }
                }
                if (aux) {
                    if (platos.get(i).getCantidad() > 1) {
                        platos.get(i).setCantidad(platos.get(i).getCantidad() - 1);
                        break;
                    } else {
                        platos.remove(i);
                        break;
                    }
                }
            }
        }
    }

    /**
     * Método funcional que retorna el subtotal del pedido según el valor de los
     * platos
     *
     * @return subtotal
     */
    public double valorSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < platos.size(); i++) {
            subtotal = subtotal + platos.get(i).calcularValorSubtotal();

        }
        return subtotal;
    }

    /**
     * Método funcional que imprime el pedido
     */
    public void imprimirPedido() {
        for (int i = 0; i < platos.size(); i++) {
            System.out.println(platos.get(i).toString());
        }

    }

    /**
     * Método funcional que busca un plato en el pedido
     *
     * @param plato1
     * @return platoEncontrado
     */
    public Plato buscarPlato(Plato plato1) {
        Plato aux = null;
        boolean auxBol = false;
        for (int i = 0; i < platos.size(); i++) {
            if (platos.get(i).getNombre().compareTo(plato1.getNombre()) == 0 && platos.get(i).getDescripcion().compareTo(plato1.getDescripcion()) == 0 && platos.get(i).getValor() == plato1.getValor()) {
                for (int j = 0; j < platos.get(i).getListaIngredientes().size(); j++) {
                    if (platos.get(i).getListaIngredientes().get(j).getNombre().compareTo(plato1.getListaIngredientes().get(j).getNombre()) == 0) {
                        auxBol = true;
                    } else {
                        auxBol = false;
                        break;
                    }
                }
                if (auxBol) {
                    aux = platos.get(i);
                    break;
                }
            }
        }
        return aux;
    }
    /**
     * Metodo to string
     * @return 
     */
    @Override
    public String toString() {
        return "Platos: " + platos.toString();
    }

}
