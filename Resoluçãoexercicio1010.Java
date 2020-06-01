import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int cu1, nu1;
    int cu2, nu2;
    
    
    System.out.println("Codigo unidade 1: ");
    cu1 = sc.nextInt();
    System.out.println("Número unidade 1: ");
    nu1 = sc.nextInt();
    double pu1 = sc.nextDouble();
    
    System.out.println("Codigo unidade 2: ");
    cu2 = sc.nextInt();
    System.out.println("Número unidade 2: ");
    nu2 = sc.nextInt();
    double pu2 = sc.nextDouble();
    
    double total = nu1 * pu1 + nu2 * pu2;
    
    
    System.out.printf("Valor a pagar = R$ %.2f%n", total);
    
    }
}
