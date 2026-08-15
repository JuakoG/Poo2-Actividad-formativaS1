package models;

public class PedidoExpress extends Pedido{

    private String tienda;
    private double distancia;
    private boolean repartidorDisponible;


    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, String tienda, double distancia, boolean repartidorDisponible) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.tienda = tienda;
        this.distancia = distancia;
        this.repartidorDisponible = repartidorDisponible;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean isRepartidorDisponible() {
        return repartidorDisponible;
    }

    public void setRepartidorDisponible(boolean repartidorDisponible) {
        this.repartidorDisponible = repartidorDisponible;
    }

    @Override
    public void asignarRepartidor() {
        if (repartidorDisponible && distancia <= 5) {
            System.out.println("El repartidor está disponible y se encuentra a " + distancia + " km.");
        } else {
            System.out.println("No hay un repartidor disponible.");
        }
    }


    public void asignarRepartidor(String nombreRepartidor) {
        if (repartidorDisponible && distancia <= 5) {
            System.out.println("Su repartidor es: " + nombreRepartidor);
        } else {
            System.out.println("El repartidor " + nombreRepartidor + " no cumple con las condiciones.");
        }
    }
    }

