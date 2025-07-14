package Program;
import application.Client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        System.out.println("");

    }
}
