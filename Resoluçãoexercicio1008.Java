import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int funcionario;
    int ht;
    double vh;
    
    System.out.println("Número do funcionario: ");
    funcionario = sc.nextInt();    
    
    System.out.println("Horas trabalhadas: ");
    ht = sc.nextInt();
    
    vh = sc.nextDouble();
    
    double salario = ht * vh;
    
    System.out.println("Funcionário: " + funcionario);
    System.out.printf("Salario = U$ %.2f%n", salario);
    
    }
}
