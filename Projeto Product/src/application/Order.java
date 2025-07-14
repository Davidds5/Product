package application;

import Enums.OrderStatus;
import com.sun.source.tree.BinaryTree;

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

}
