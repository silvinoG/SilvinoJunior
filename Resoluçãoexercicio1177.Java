import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int [] x = new int [1000];
    int n = 0;
    
    n = sc.nextInt();
    
    for(int i=0, a=0; i<1000; i++){
        
    System.out.println("N["+i+"] = "+ a);
    
    a = a + 1;
    
    if(a == n)
        a = 0;
        }
    }
}
