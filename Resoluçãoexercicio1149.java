import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int a;
    int n = 0;
    
    a = sc.nextInt();
    
    while(n <= 0){
    n = sc.nextInt();
    }
    int s = 0;
    for(int i=1; i<=n; i++){
        s = s + a;
        a = a + 1;
        }
         System.out.println(s);
    }
}
