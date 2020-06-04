import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n;
    int a;
    int x = 1;
  
    n = sc.nextInt();

    for(a=n; a>=1; a--) { 
        x = a * x;
    }
        System.out.printf("%d\n", x);
    }
}
