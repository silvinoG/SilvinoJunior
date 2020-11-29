import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    int n = 0;
    int a = 0;
    double c = 0;
    double i = 0;
    
    while(n >= 0){
        n = sc.nextInt();
        
        if(n >= 0){
        i = i + n;    
        a = a + 1;
        }
    }
    c = i / a;
    System.out.printf("%.2f\n",c);
    }
}
