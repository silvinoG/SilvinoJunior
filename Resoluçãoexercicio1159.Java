import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    int n = 0;
    int i = 0;
    int b = 0;
    
    while(n != 1){
    n = sc.nextInt();
    
    b = 0;
    
    if(n == 0){
        break;
    }else{
        if(n % 2 == 0){
            
    for(i=n; i<=n + 8; i = i + 2)b = b + i;
    
    }else{
        
    for(i=n + 1; i<=n + 9; i = i + 2)b = b + i;
    
    }
    System.out.println(b);
            }
        }
    }
}
