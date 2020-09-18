import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
   double A;
   double B;
   double C;
   double p = 0;
   double a = 0;
   
   A = sc.nextDouble();
   B = sc.nextDouble();
   C = sc.nextDouble();
   
   if(((A - B) < C) && ((A - C) < B) && ((B - C) < A)){
       if(((A + B) > C)  && ((A + C) > B) && ((B + C) > A))
       p = A + B + C;
       System.out.printf("Perimetro = %.1f\n", p);
   }else{
       a = ((A + B) * C) / 2;
       System.out.printf("Area = %.1f\n", a);
   }
    }
}
