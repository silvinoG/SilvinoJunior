import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int n;
    int m;
    int p = 0;
    
    n = sc.nextInt();
    m = sc.nextInt();
    
    while(n > 0 && m > 0){
        
    int s = 0;
    
    if(n < m){ 
        p = m;
        m = n;
        n = p;
    }
    for(int i=m; i<=n; i++){
    s = s + i;
    
    System.out.print(i+ " ");
    }

    System.out.println("Sum="+s);
    n = sc.nextInt();
    m = sc.nextInt();
        }
    }
}
