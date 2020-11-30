import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int [] x = new int  [10];
    int i;
    
    for(i=0; i<x.length; i++){
        x[i] = sc.nextInt();
    }
    for(i=0; i<x.length; i++){
        if(x[i]<= 0) x[i] = 1;
    }
    for(i=0; i<x.length; i++){
    System.out.println("X["+i+"]"+" = "+x[i]);
            }
        }
    }
