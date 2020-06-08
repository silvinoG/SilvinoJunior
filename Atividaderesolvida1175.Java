import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int[] N = new int [20];
    int i;
    int A = 0;
    int B;
    
    for(i = 0; i <20; i++)
       
       N[i] = sc.nextInt();
       
    for(i = 0, B= 19; i<10; i++, B--) {
        
        A = N[i];
        N[i] = N[B];
        N[B] = A;
    }
    for(i = 0; i<20; i++) {
        
    System.out.printf("N [%d] = %d\n " ,i ,N[i]);
        }
    }
}
