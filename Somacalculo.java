import java.util.Scanner;

public class MyClass {
    
    public static void main(String args[]) {
    
        String nome = "Prod";
        int valor1;
        int valor2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor1: ");
        valor1 = sc.nextInt();
        
        System.out.println("Digite o valor2: ");
        valor2 = sc.nextInt();
        
            System.out.println("Prod = " + (valor1 * valor2));
    }
    
}
