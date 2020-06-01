import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    double A;
    double B;
    double C;
    double pi = 3.14159;
    
    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();
    
     double triangulo;
     double circulo;
     double trapezio;
     double quadrado;
     double retangulo;
     
     triangulo = (A * C)/2.0;
     circulo = pi * C * C;
     trapezio = (A + B) * C / 2.0;
     quadrado = B * B;
     retangulo = A * B;
     
    System.out.printf("Triângulo: %.3f%n", triangulo);
    System.out.printf("Circulo: %.3f%n", circulo);
    System.out.printf("Trapézio: %.3f%n", trapezio);
    System.out.printf("Quadrado: %.3f%n", quadrado);
    System.out.printf("Retângulo: %.3f%n", retangulo);
    }
}
