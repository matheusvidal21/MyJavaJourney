package application;

import application.entities.ImportedProduct;
import application.entities.Product;
import application.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char choiceProductType = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if(choiceProductType == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureData = sc.next();
                Product product = new UsedProduct(name, price, LocalDate.parse(manufactureData, fmt));
                products.add(product);
            }else if(choiceProductType == 'i'){
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }else{
                Product product = new Product(name, price);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for(Product prod : products){
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
