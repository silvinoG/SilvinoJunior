import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int x;
    int n;
    int d;
    int c = 0;
        
    x = sc.nextInt();
    
    for(int i=1; i<=x; i++){
    
    n = sc.nextInt();
    c = n / 2;  
    d = 0;
    
    for(int a=1; a<=c; a++){
        if(n % a == 0)
        d = d + a;
    }
    if(d == n){
    System.out.printf(n+" eh perfeito\n");
    }else
    System.out.printf(n+" nao eh perfeito\n");
        }
    }
}
