import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int [] x = new int  [10];
    int n = 0;
    int y = 0;
    
    y = sc.nextInt();
    
    for(int i=0; i<x.length; i++){
        x[n] = y;
    
    System.out.println("N["+i+"]"+" = "+x[n]);
        
        y = y * 2;
            }
        }
    }
