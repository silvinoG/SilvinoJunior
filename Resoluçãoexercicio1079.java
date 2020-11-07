import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    int n;
    double s = 0;
    double n1;
    double n2;
    double n3;
      
    n = sc.nextInt();
    
    for(int i=0; i<n; i++){
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    n3 = sc.nextDouble();
    
    s = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
    
    System.out.printf("%.1f\n",s);
        }
    }
}
