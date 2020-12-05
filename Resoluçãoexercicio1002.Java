import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 Scanner sc = new Scanner (System.in);
    
    double r;
    double pi = 3.14159;
    double a;
    
   r = sc.nextDouble();
   
   a = pi * r * r;
   
   System.out.printf("A=%.4f\n", a);
    }
 
}
