import java.util.Scanner;
public class MyClass {
    public static void main (String args []) {
        
    Scanner sc = new Scanner (System.in);
    
    double s = 0;
    double c = 0;
    double b = 1;
    
    for(double i =1; i<=39; i = i + 2){
    c = i / b;
    s = s + c;
    b = b * 2;
    }
    System.out.printf("%.2f\n", s);
    }
}
