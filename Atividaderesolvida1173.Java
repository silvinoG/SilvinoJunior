import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int[] M = new int [10];
    int N = 0;
    int V = 0;
    
       V = sc.nextInt();
    
    for(int i = 0; i <=10; i++) {
        M[N] = V;
        
    System.out.println("N ["+i+"] = " + V);
        V = V * 2;
        }
    }
}
