import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int c;
    int d;
    
    System.out.println("Digite o valor de a: ");
     a = sc.nextInt();
    
     System.out.println("Digite o valor de b: ");
     b = sc.nextInt();
    
     System.out.println("Digite o valor de c: ");
     c = sc.nextInt();
    
     System.out.println("Digite o valor de d: ");
     d = sc.nextInt();
    
    System.out.println("DIFERENCA = " + (a * b - c * d) );
    
        
    }
}
