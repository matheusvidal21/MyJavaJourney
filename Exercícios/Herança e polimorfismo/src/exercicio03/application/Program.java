package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.Color;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Shape #"+ i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if(shapeType == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Shape rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);
            }else{
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Shape circle = new Circle(color, radius);
                shapes.add(circle);
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shp : shapes){
            System.out.printf("%.2f%n", shp.area());
        }


        sc.close();
    }
}

