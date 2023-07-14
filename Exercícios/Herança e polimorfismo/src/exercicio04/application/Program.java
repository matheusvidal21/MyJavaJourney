package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<TaxPayer> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char choice = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(choice == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual individual = new Individual(name, anualIncome, healthExpenditures);
                list.add(individual);
            }else{
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                Company company = new Company(name, anualIncome, numberOfEmployees);
                list.add(company);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;

        for(TaxPayer taxpayer : list){
            System.out.println(taxpayer);
            sum += taxpayer.tax();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", sum);


        sc.close();
    }
}
