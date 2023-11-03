package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();
        Map<String, Integer> votes = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while(line != null){
                String[] fiels = line.split(",");
                String name = fiels[0];
                int count = Integer.parseInt(fiels[1]);

                if(votes.containsKey(name)){
                    int totalVotes = count + votes.get(name);
                    votes.put(name, totalVotes);
                }else{
                    votes.put(name, count);
                }
                line = br.readLine();
            }

            if(!votes.isEmpty()){
                for(String key : votes.keySet()){
                    System.out.println(key + ": " + votes.get(key));
                }
            }else{
                System.out.println("O Map está vazio.");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }


        sc.close();
    }
}
