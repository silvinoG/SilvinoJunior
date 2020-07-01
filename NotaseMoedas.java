import java.util.Scanner;
public class MyClass {
    public static void main (String args []) {
        
    Scanner sc = new Scanner (System.in);
    
    int v;
    double n;
    
    n = sc.nextDouble();
    
    System.out.println("Notas");
    
    System.out.printf((v = (int) n / 100) + " nota (s) de R$ 100.00\n", v + (n = n % 100.0));
    //n = n % 100.0;
    System.out.printf((v = (int) n / 50) + " nota (s) de R$ 50.00\n", v + (n = n % 50.0));
    //n = n % 50.0;
    System.out.printf((v = (int) n / 20) + " nota (s) de R$ 20.00\n", v + (n = n % 20.0));
    //n = n % 20.0;
    System.out.printf((v = (int) n / 10) + " nota (s) de R$ 10.00\n", v + (n = n % 10.0));
    //n = n % 10.0;
    System.out.printf((v = (int) n / 5) + " nota (s) de R$ 5.00\n", v + (n = n % 5.0));
    //n = n % 5.0;
    System.out.printf((v = (int) n / 2) + " nota (s) de R$ 2.00\n", v + (n = n % 2.0));
    //n = n % 2.0;
    
    n = n * 100;
    
    System.out.println("Moedas");
    
    System.out.printf((v = (int) n / 100) + " moeda (s) de R$ 1.00\n", v + (n = n % 100));
    //n = n % 100;
    System.out.printf((v = (int) n / 50) + " moeda (s) de R$ 0.50\n", v + (n = n % 50));
    //n = n % 50;
    System.out.printf((v = (int) n / 25) + " moeda (s) de R$ 0.25\n", v + (n = n % 25));
    //n = n % 25;
    System.out.printf((v = (int) n / 10) + " moeda (s) de R$ 0.10\n", v + (n = n % 10));
    //n = n % 10;
    System.out.printf((v = (int) n / 5) + " moeda (s) de R$ 0.05\n", v + (n = n % 5));
    //n = n % 5;
    System.out.printf((v = (int) n / 1) + " moeda (s) de R$ 0.01\n", v + (n = n % 1));
    //n = n % 1;
    }
}
