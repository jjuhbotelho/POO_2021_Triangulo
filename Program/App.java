package Program;

import Entidade.Triangle;

import java.util.Locale;
import java.util.Scanner;

import static Entidade.Triangle.*;

public class App {

    public static void main (String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira os valores de x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Insira os valores de y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        if(isTriangleValid(x.a, x.b, x.c) & isTriangleValid(y.a, y.b, y.c)){
            x.area = calculateArea(x.a, x.b, x.c);
            y.area = calculateArea(y.a, y.b, y.c);

            if(x.area > y.area){
                System.out.println("O triâgulo x possui a maior área");
            }else if (x.area < y.area){
                System.out.println("O triâgulo y possui a maior área");
            }else {
                System.out.println("Os triâgulos x e y possuem área igual");
            }

            triangleType(x.a, x.b, x.c , "X");
            triangleType(y.a, y.b, y.c , "Y");

        }else if(!isTriangleValid(x.a, x.b, x.c) & !isTriangleValid(y.a, y.b, y.c)){
            System.out.println("Lados de x e y não são válidos para formar um triângulo");
        }else if(!isTriangleValid(x.a, x.b, x.c)){
            System.out.println("Lados de x não são válidos para formar um triângulo");
        }else {
            System.out.println("Lados de y não são válidos para formar um triângulo");
        }

        sc.close();
    }

}
