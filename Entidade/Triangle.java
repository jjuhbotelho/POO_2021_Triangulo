package Entidade;

public class Triangle {

    public double a;
    public double b;
    public double c;
    public double area;

    public static double calculateArea(double a, double b, double c) {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static boolean isTriangleValid(double a, double b, double c) {
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            return true;
        }else {
            return false;
        }
    }

    public static void triangleType(double a, double b, double c, String triangle){
        if(a == b & a == c & b == c){
            System.out.println("O triangulo " + triangle + " é equilátero");
        }
        else if((a == b & b != c) || (a == c & c != b) || (b == c & c != a)){
            System.out.println("O triangulo " + triangle + " é isósceles");
        }
        else{
            System.out.println("O triangulo " + triangle + " é escaleno");
        }
    }

}




