import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
   double x;
   double y;
   
   x = sc.nextDouble();
   y = sc.nextDouble();
   
   if((x == 0) && (y == 0)){
       System.out.print("Origem\n");
    }else
    if((x > 0) && (y > 0)){
        System.out.print("Q1\n");
    }else
    if((x < 0) && (y > 0)){
        System.out.print("Q2\n");
    }else
    if((x < 0) && (y < 0)){
        System.out.print("Q3\n");
    }else
    if((x > 0) && (y < 0)){
        System.out.print("Q4\n");
    }else
    if((x == 0) && (y != 0)){
        System.out.print("Eixo Y\n");
    }else
    if((x != 0) && (y == 0)){
        System.out.print("Eixo X\n");
    }
    }
}
