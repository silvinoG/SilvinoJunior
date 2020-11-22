import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int n;
    int q = 0;
    int c = 0;
    int s = 0;
    int d = 0;
    
    n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
        
        q = (i * i);
        s = q + 1;
        c = (i * i * i);
        d = c + 1;
        
    System.out.println(i + " "+ q + " "+c);
    System.out.println(i + " "+ s + " "+d);
        }
    }
}
