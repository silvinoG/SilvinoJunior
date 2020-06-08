import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
     
    int T = 0;
    int[] V = new int [1000];
    
        T = sc.nextInt();
    
    for(int i =0, A = 0; i <1000; i++) {
        
    System.out.printf("N [%d] = %d\n ", i, A);
        A = A + 1;
    if (A==T)
        A = 0;
        }
    }
}
