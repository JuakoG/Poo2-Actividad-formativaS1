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
        System.out.println("[Pedido Encomienda]");
        System.out.println("Asignando repartidor....");
        if (peso <= 20 && volumen <= 0.5) {
            System.out.println("Validando peso y embalaje.... Correcto, Cumple con los requisitos.");
        } else {
            System.out.println(" Validando peso y embalaje..... Incorrecto, repartidor no cumple con los requisitos.");
        }
    }

    public void asignarRepartidor(String nombreRepartidor) {
        if (peso <= 20 && volumen <= 0.5) {
            System.out.println("→ Pedido asignado a " + nombreRepartidor);
        } else {
            System.out.println("→ Pedido no asignado a " + nombreRepartidor+ " el repartidor no cumple con las condiciones ");
        }
    }
}
