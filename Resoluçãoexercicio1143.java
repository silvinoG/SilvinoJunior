import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int n;
    int q = 0;
    int c = 0;
    
    n = sc.nextInt();
    
    for(int i=1; i<=n; i++){
        
        q = (i * i);
        c = (i * i * i);
        
    System.out.println(i + " "+ q + " "+c);
        }
    }
}
