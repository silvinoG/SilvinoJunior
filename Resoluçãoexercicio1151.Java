import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int n;
    int a = 1;
    int p = 0;
    int c = 0;
        
    n = sc.nextInt();

    for(int i=1; i<=n; i++){ 
        if(i == n)System.out.println(c);
        else System.out.print(c + " ");
            p = c + a;
            c = a;
            a = p;
        }
    }
}
