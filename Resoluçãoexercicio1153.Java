import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    int n;
    int x = 1;
    
    n = sc.nextInt();
    
    for(int i=n; i>=1; i--){
       x = i * x; 
    }
    System.out.println(x);
    }
}
