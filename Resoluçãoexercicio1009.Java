import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    String nome;
    double sf;
    double tv;
    
    System.out.println("Nome do vendedor: ");
    nome = sc.next();    
    sf = sc.nextDouble();
    tv = sc.nextDouble();
    
    double comissao = tv * 0.15;
    
    System.out.printf("Total = R$ %.2f%n", (comissao + sf));
    
    }
}
