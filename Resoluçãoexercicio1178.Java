import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double [] x = new double [100];
    double n = 0;
    double a = 0;
    int i = 0;
    
    n = sc.nextDouble();
    
    x[0] = n;
    
    for(i = 1; i < 100; i++){
        n = n / 2;
        x[i] = n;
    }
        for(i = 0; i < 100; i++){
            
    System.out.printf("N["+i+"] = %.4f\n",x[i]);
        }
    }
}
