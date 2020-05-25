import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
    String nome = " X ";
    int A;
    int B;
        
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Digite o valor A ");
        A = sc.nextInt();
        
    
        System.out.println("Digite o valor B ");
        B = sc.nextInt();
    
        System.out.println("X = " + (A + B));
    
        System.out.println("----------------------");
    }
}
