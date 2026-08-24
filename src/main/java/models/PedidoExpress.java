package models;

public class PedidoExpress extends Pedido{

    private String tienda;
    private boolean repartidorDisponible;

    public PedidoExpress(int idPedido, String direccionEntrega, double distanciaKm, String tienda,  boolean repartidorDisponible) {
        super(idPedido, direccionEntrega, distanciaKm);
        this.tienda = tienda;
        this.repartidorDisponible = repartidorDisponible;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }


    public boolean isRepartidorDisponible() {
        return repartidorDisponible;
    }

    public void setRepartidorDisponible(boolean repartidorDisponible) {
        this.repartidorDisponible = repartidorDisponible;
    }

    @Override
    public void asignarRepartidor() {
        System.out.println("Tipo pedido : [Pedido Express]");
        System.out.println("Asignando repartidor....");
        if (repartidorDisponible && getDistanciaKm() <= 5) {
            System.out.println("El repartidor está disponible y se encuentra a " + getDistanciaKm() + " km.");
        } else {
            System.out.println("No hay un repartidor disponible.");
        }
    }


    public void asignarRepartidor(String nombreRepartidor) {
        if (repartidorDisponible && getDistanciaKm() <= 5) {
            System.out.println("Su repartidor es: " + nombreRepartidor);
        } else {
            System.out.println("El repartidor " + nombreRepartidor + " no cumple con las condiciones.");
        }

    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo = tiempo + 5;
        }
        return tiempo;
    }
}

