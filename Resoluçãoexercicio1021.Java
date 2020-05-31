import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
   
    double valorinformado = sc.nextDouble();
    int valor = 0;
    
    System.out.println("NOTAS");
        
        valor = (int) valorinformado / 100;
    System.out.printf("%d nota (s) de R$ 100.00%n", valor);
        valorinformado = valorinformado % 100.0;
        
        valor = (int) valorinformado / 50;
    System.out.printf("%d nota (s) de R$ 50.00%n", valor);
        valorinformado = valorinformado % 50.0;
        
        valor = (int) valorinformado / 20;
    System.out.printf("%d nota (s) de R$ 20.00%n", valor);
        valorinformado = valorinformado % 20.0;
        
        valor = (int) valorinformado / 10;
    System.out.printf("%d nota (s) de R$ 10.00%n", valor);
        valorinformado = valorinformado % 10.0;
        
        valor = (int) valorinformado / 5;
    System.out.printf("%d nota (s) de R$ 5.00%n", valor);
        valorinformado = valorinformado % 5.0;
        
        valor = (int) valorinformado / 2;
    System.out.printf("%d nota (s) de R$ 2.00%n", valor);
        valorinformado = valorinformado % 2.0;
        
        valorinformado = valorinformado * 100.0;
        
    System.out.println("MOEDAS");
       
        valor = (int) valorinformado / 100;
    System.out.printf("%d moeda (s) de R$ 1.00%n", valor);
        valorinformado = valorinformado / 100.0;
        
        valor = (int) valorinformado / 50;
    System.out.printf("%d moeda (s) de R$ 0.50%n", valor);
        valorinformado = valorinformado % 50.0;
        
        valor = (int) valorinformado / 25;
    System.out.printf("%d moeda (s) de R$ 0.25%n", valor);
        valorinformado = valorinformado % 25.0;
        
        valor = (int) valorinformado / 20;
    System.out.printf("%d moeda (s) de R$ 0.20%n", valor);
        valorinformado = valorinformado % 20.0;
        
        valor = (int) valorinformado / 10;
    System.out.printf("%d moeda (s) de R$ 0.10%n", valor);
        valorinformado = valorinformado % 10.0;
        
        valor = (int) valorinformado / 5;
    System.out.printf("%d moeda (s) de R$ 0.05%n", valor);
        valorinformado = valorinformado % 5.0;
        
        valor = (int) valorinformado / 1;
    System.out.printf("%d moeda (s) de R$ 0.01%n", valor);
        valorinformado = valorinformado % 1.0;
        
    }
}
