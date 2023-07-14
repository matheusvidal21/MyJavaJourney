package application;

import entities.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();
        Client client = new Client(name, email, LocalDate.parse(birthDate, fmt));

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.next();


        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        LocalDateTime moment = LocalDateTime.now();
        Order order = new Order(moment, OrderStatus.valueOf(status), client);

        for(int i = 1; i <= n; i++){
            System.out.printf("Enter #%d item data:\n", i);
            System.out.print("Product name: ");
            String productName = sc.next();

            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();


            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println(order);


    }
}
