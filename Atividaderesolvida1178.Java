import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
     
    int i = 0;
    double[] V = new double [100];
    double A = 0;
    double B = 0;
    
        A = sc.nextDouble();
            V[i] = A;
        
    for(i = 0; i < 99; i++) {
        
    System.out.printf("N [%d] = %.4f\n ", i, V[i]);
        
        A = A / 2;
        V [i + 1] = A;
        
        }
    }
}
