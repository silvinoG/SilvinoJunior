import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int p = 0;
    int b = 0;
    int n = 0;
    int m = 0;
    
    n = sc.nextInt();
        
    int[] x = new int [n];    
        
    for(int i = 0; i < n; i++) {
        
        x[i] = sc.nextInt();
        
        if(i == 0){
            m = x [i];
            p = i; 
        }else
        if(x [i] < m) {
            m = x [i];
            p = i; 
            }
        }
    System.out.println("Menor valor: "+ m);
    System.out.println("Posicao: "+ p);
        }
    }
