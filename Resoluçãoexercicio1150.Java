import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int x;
    int z;
    int s;
    int c = 0;
        
    x = sc.nextInt();
    z = sc.nextInt();
    
    while(z <= x){
        
    z = sc.nextInt();
    
    s = c = 0;
    
    while(s < z){
        s = s + x;
        x = x + 1;
        c = c + 1;
        }
    }
    System.out.println(c);
    }
}
