import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
     
    int i;
    int P = 0;
    int B;
    int N;
    int M;
    //int[] X = new int[0];
    
    
        X[N] = sc.nextInt();
        int X[N];
        
    for(i = 0; i < N; i++) {
        
        X[i] = sc.nextInt();
       
        M = X [0];
        
        for(i = 1; i < N; i++) {
            if(M > X [i]) {
                M = X [i];
               P = i; 
            }
        }
    System.out.printf("Menor valor: %d\n ", M);
    System.out.printf("Posição: %d\n ", P);
        }
    }
}
