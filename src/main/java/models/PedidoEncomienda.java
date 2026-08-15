package models;

public class PedidoEncomienda extends Pedido {
    private double peso;
    private double volumen;

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, double peso, double volumen) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.peso = peso;
        this.volumen = volumen;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


    @Override
    public void asignarRepartidor() {
        if (peso <= 20 && volumen <= 0.5) {
            System.out.println("La encomienda cumple con las condiciones de envío.");
        } else {
            System.out.println("La encomienda supera la capacidad de envío.");
        }
    }

    public void asignarRepartidor(String nombreRepartidor) {
        if (peso <= 20 && volumen <= 0.5) {
            System.out.println("El repartidor asignado es: " + nombreRepartidor);
        } else {
            System.out.println("La encomienda no puede ser asignada al repartidor.");
        }
    }
}
