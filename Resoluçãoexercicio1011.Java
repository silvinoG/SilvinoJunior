import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
   
    double PI = 3.14159;
    double raio = sc.nextDouble();
    double volumeEsfera = (4/3.0) * PI * raio * raio * raio;
    
    System.out.printf("Volume = %.3f%n", volumeEsfera);
   
   }
}
