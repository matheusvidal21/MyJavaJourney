package exercicio05.application;

import exercicio05.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Product> productList = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                productList.add(new Product(name, price));
                line = br.readLine();
            }

            double avg = productList.stream()
                    .map(Product::getPrice)
                    .reduce(0.0, Double::sum) / productList.size();

            System.out.printf("Average price: %.2f %n", avg);

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            productList.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(Product::getName)
                    .sorted(comp.reversed())
                    .forEach(System.out::println);


        }catch (IOException e){
            System.out.printf("Erro ao abrir o arquivo: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
