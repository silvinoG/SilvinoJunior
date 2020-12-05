import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int x;
    int a = 0;
    long t;
    long c = 0;
    long p = 0;
    long s = 1;
    
    x = sc.nextInt();
    
    for(int i = 1; i <= x; i++, p = 0, s = 1){
        t = sc.nextInt();
        t = t + 1;
        
    for(a = 0; a < t; a++){
        
        if(a <= 1) c = a;
    else{
        c = p + s;
        p = s;
        s = c;
        }    
    }
        System.out.printf("Fib(%d) = %d\n", a - 1, c);
        }
    }
}
