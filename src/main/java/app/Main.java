package app;

import models.Pedido;
import models.PedidoComida;
import models.PedidoEncomienda;
import models.PedidoExpress;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidos = new ArrayList<>();

        // comida

        Pedido pedido1 = new PedidoComida(1, "Recoleta 221", "COMIDA", "Restaurant comida chilena", 21, true);
        Pedido pedido2 = new PedidoComida(2, "Recoleta 221", "COMIDA", "Restaurant comida peruana", 15, false);

         // encomienda
        Pedido pedido3 = new PedidoEncomienda(3, "Santiago Centro 444", "ENCOMIENDA", 20, 0.7);
        Pedido pedido4 = new PedidoEncomienda(4, "Independencia 500", "ENCOMIENDA", 15, 0.3);
        // express
        Pedido pedido5 = new PedidoExpress(5, "Santiago Centro 100", "EXPRESS", "Farmacia Ahumada", 5.5, false);
        Pedido pedido6 = new PedidoExpress(6, "Santiago Centro 100", "EXPRESS", "Cruz Verde", 3.5, true);

        // ---------------- AGREGAR PEDIDOS ----------------
        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);
        pedidos.add(pedido6);

        //("------- Sobreescritura  ------");
        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

       // ("------- Sobrecarga  ------");

        // comida

        PedidoComida comida = new PedidoComida(7,"Recoleta 300", "COMIDA", "Restaurant Arabe", 25, true);
        comida.asignarRepartidor("Juan");
        PedidoComida comida1 = new PedidoComida(8,"Recoleta 320", "COMIDA", "Restaurant Arabe", 30, false);
        comida1.asignarRepartidor("Miguel");

        // encomienda
        PedidoEncomienda encomienda = new PedidoEncomienda(9,"maipu","encomienda",2.2,3);
        encomienda.asignarRepartidor("Alfredo");
        PedidoEncomienda encomienda1 = new PedidoEncomienda(10,"maipu","encomienda",20,0.5);
        encomienda1.asignarRepartidor("Jose");

        // express

        PedidoExpress express = new PedidoExpress(11,"Independencia","Express","Falabella",5,true);
        express.asignarRepartidor("Maria");

        PedidoExpress express1 = new PedidoExpress(12,"Huechuraba","Express","Sodimac",25,false);
        express1.asignarRepartidor("Hugo");

    }
}