import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    double c = 0;
    double s = 1;
    double a = 0;
    
    for(double i=1; i<=39; i = i + 2){    
    c = i / s;
    a = a + c;
    s = s * 2;
    }
    System.out.printf("%.2f\n",a);
    }
}
