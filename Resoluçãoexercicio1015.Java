import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      
      double x1;
      double y1;
      double x2;
      double y2;
      
     x1 = sc.nextDouble();
     y1 = sc.nextDouble();
     x2 = sc.nextDouble();   
     y2 = sc.nextDouble();   
    
    double xy = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
    
    System.out.printf("%.4f%n", xy);
    
    }
}
