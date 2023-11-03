package exercicio03.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicio03.entities.Circle;
import exercicio03.entities.Rectangle;
import exercicio03.entities.Shape;

public class Program {
    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Circle(3.0));

        System.out.printf("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for(Shape s : list){
            sum += s.area();
        }
        return sum;
    }
}
