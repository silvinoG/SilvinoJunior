import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int X;
    double Y;
    
    X = sc.nextInt();
    Y = sc.nextDouble();
    
    double consumo = X / Y;
    
    System.out.printf("%.3f Km / l%n", consumo);
    }
}
