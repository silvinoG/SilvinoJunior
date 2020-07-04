import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
      Scanner sc = new Scanner(System.in);
      
      double a;
      double b;
      double c;
      double x1;
      double x2;
      
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    
    if(a > 0){
      
      x1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
      x2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a);
      
      System.out.printf("R1 = %.5f\n",x1);
      System.out.printf("R2 = %.5f\n",x2);
    }else
      System.out.println("Impossivel calcular");  
    }
  }
