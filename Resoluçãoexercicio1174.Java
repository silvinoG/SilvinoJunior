import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    double [] x = new double  [100];
    int i = 0;

    for(i=0; i<x.length; i++){
        x[i] = sc.nextDouble();
    }
    for(i=0; i<x.length; i++){
        if(x[i] <= 10)
        
    System.out.printf("A["+i+"] = %.1f\n",x[i]);
            }
        }
    }
