import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    String nome = "PROD";
    int A;
    int B;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite A ");
    A = sc.nextInt();
    
    System.out.println("Digite B ");
    B = sc.nextInt();
    
        System.out.println("PROD = " + (A * B));
    }
}
