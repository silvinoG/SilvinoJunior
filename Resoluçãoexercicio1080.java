import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    int n;
    int m = 0;
    int x = 0;
    int p = 0;
    int i = 1;
    
    for( i=0; i<100; i++){
    x = sc.nextInt();
        if(x > m){
            m = x;
            p = i + 1;
        
        }
    x = x + 1;
    }
    System.out.println(m);
    System.out.println(p);
    }
}
