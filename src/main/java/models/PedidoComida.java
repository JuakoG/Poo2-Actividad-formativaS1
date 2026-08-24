package models;



public class PedidoComida extends Pedido {

    private String restaurante;
    private int tiempoPreparacion;
    private boolean mochilaTermica;

    public PedidoComida(int idPedido, String direccionEntrega, double distanciaKm, String restaurante, int tiempoPreparacion, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, distanciaKm);
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

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public boolean isMochilaTermica() {
        return mochilaTermica;
    }

    public void setMochilaTermica(boolean mochilaTermica) {
        this.mochilaTermica = mochilaTermica;
    }


    @Override
    public void asignarRepartidor() {
        System.out.println(" Tipo pedido : [Pedido Comida]");
        System.out.println("Asignando y verificando repartidor....");
        if (mochilaTermica == true) {
            System.out.println("Verificando mochila termica..... Correcto");
        } else {
            System.out.println("Verificando mochila termica.... No posee");
            System.out.println("Asignar otro repartidor.");
        }
    }

    public void asignarRepartidor(String nombreRepartidor) {
        if (mochilaTermica) {
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ Pedido no asignado a " + nombreRepartidor   + " el repartidor no cumple con las condiciones ");
        }
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 15;
        tiempo = tiempo + (int) (2 * getDistanciaKm());

        return tiempo;
    }
}







