package application;

import Enums.OrderStatus;
import com.sun.source.tree.BinaryTree;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus orderStatus;
    private Client client;
    List<OrderItem> orderItemList = new ArrayList<>();

    public Order(){}

    public Order(Date moment, OrderStatus orderStatus, Client client){
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }
    public void addItem(OrderItem item){
        orderItemList.add(item);
    }

    public void removerItem(OrderItem item){
        orderItemList.remove(item);
    }

    public Double total(){
      double soma = 0.0;
      for(OrderItem orderItem : orderItemList){
          soma += orderItem.subTotal();
      }
      return  soma;

    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        sb.append("DATA DO PEDIDO: ");
        sb.append(sdf.format(moment) + "\n");

        sb.append("STATUS: ");
        sb.append(orderStatus + "\n");

        sb.append("DADOS DO CLIENTE: ");
        sb.append(client + "\n"); // espera-se que a classe Client também tenha um toString()

        sb.append("ITENS DO PEDIDO:\n");
        for (OrderItem item : orderItemList) {
            sb.append(item + "\n"); // idem: espera-se que OrderItem tenha toString com subtotal incluso
        }

        sb.append("TOTAL: R$ ");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }

    }


