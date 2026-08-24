package app;

import models.Pedido;
import models.PedidoComida;
import models.PedidoEncomienda;
import models.PedidoExpress;




public class Main {
    public static void main(String[] args) {
        Pedido[] pedidos = {
                new PedidoComida(13, "Av Italia 456", 4, "Restaurante Comida Chilena", 20, true),
                new PedidoEncomienda(14, "Av Independencia 123", 10, 5.2,5.5),
                new PedidoExpress(15, "Av Apoquindo 1500", 5, "Falabella",false)
        };
        for (Pedido pedido : pedidos) {
            pedido.mostrarResumen();
            System.out.println("Tiempo estimado de entrega: " + pedido.calcularTiempoEntrega() + " minutos");
            pedido.asignarRepartidor();
            System.out.println("--------------------------------------------------\n");
        }
  // otra forma
        PedidoExpress express = new PedidoExpress(15, "Av Apoquindo 1500", 5, "Falabella", true);
        express.mostrarResumen();
        System.out.println("Tiempo estimado de entrega: " + express.calcularTiempoEntrega() + " minutos");
        express.asignarRepartidor();
        express.asignarRepartidor("Maria");
        System.out.println("--------------------------------------------------");

    }
}
