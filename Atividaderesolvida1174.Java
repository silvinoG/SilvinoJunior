import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    double[] A = new double [100];
    int i;
    
    for(i = 0; i <100; i++)
       A[i] = sc.nextDouble();
       
    for(i = 0; i <100; i++) {
        
        if (A[i] <= 10)
        
    System.out.printf("A [%d] = %.1f\n " ,i ,A[i]);
        }
    }
}
