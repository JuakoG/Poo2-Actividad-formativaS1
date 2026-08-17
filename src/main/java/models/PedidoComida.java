package models;



public class PedidoComida extends Pedido {

    private String restaurante;
    private int tiempoPreparacion;
    private boolean mochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, String restaurante, int tiempoPreparacion, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.restaurante = restaurante;
        this.tiempoPreparacion = tiempoPreparacion;
        this.mochilaTermica = mochilaTermica;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public boolean isMochilaTermica() {
        return mochilaTermica;
    }

    public void setMochilaTermica(boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("----- PEDIDO COMIDA -----");
        System.out.println("Asignando y verificando repartidor....");
        if (mochilaTermica == true) {
            System.out.println("Verificando mochila termica..... Correcto");
        } else {
            System.out.println("Verificando mochila termica.... No posee");
            System.out.println("Asignar otro repartidor.");
        }
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("----- PEDIDO COMIDA -----");
        if (mochilaTermica) {
            System.out.println("El repartidor " + nombreRepartidor + " tiene mochila térmica y fue asignado.");
        } else {
            System.out.println("El repartidor " + nombreRepartidor + " no tiene mochila térmica, se debe asignar otro repartidor.");
        }
    }
}
