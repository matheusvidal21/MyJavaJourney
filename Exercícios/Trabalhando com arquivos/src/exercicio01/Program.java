package exercicio01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File sourceFile = new File(strPath);
        // Pegando o caminho do arquivo
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "/out").mkdir();
        System.out.println("Directory created successfully: " + success);
        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
            String line = br.readLine();
            while(line != null){
                String[] values = line.split(",");
                String name = values[0];
                double price = Double.parseDouble(values[1]);
                int quantity =  Integer.parseInt(values[2]);
                products.add(new Product(name, price, quantity));
                line = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for(Product product : products){
                    bw.write(product.getName() + "," + String.format("%.2f", product.totalValue()));
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

        }catch (IOException e){
            System.out.println("Error writing file: " + e.getMessage());
        }




        sc.close();
    }
}
