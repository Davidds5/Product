package Program;
import Enums.OrderStatus;
import application.Client;
import application.Order;
import application.OrderItem;
import application.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter data client: ");
        System.out.println("Name: ");
        String nameClient = sc.nextLine();

        System.out.println("Email: ");
        String emailClient = sc.nextLine();

        System.out.println("Birth date: ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client client = new Client(nameClient, emailClient, birthDate );

        System.out.println();

        System.out.println("Enter data order: ");
        System.out.println("Qual o status do seu pedido: ");
        String orderString= sc.nextLine();
        OrderStatus orderValor = OrderStatus.valueOf(orderString);

        Date dateMoment = new Date();

        Order order = new Order(dateMoment, orderValor, client);


        System.out.println("Quantos itens o pedido tera : ");
        int quantidadeItens = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i <quantidadeItens ; i++) {
            System.out.println("Item do pedido #" + (i + 1) + " :");
            System.out.println("Enter data products: ");
            System.out.println("Name Product: ");
            String nameProduct = sc.nextLine();

            System.out.println("Price product: ");
            double priceProduct = sc.nextDouble();

            System.out.println("Quantity:  ");
            int quantity = sc.nextInt();
            sc.nextLine();


            Product product = new Product(nameProduct, priceProduct);

            OrderItem orderItem = new OrderItem(quantity, priceProduct, product);

            order.addItem(orderItem);



        }
        System.out.println(order);
    }
}
