import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double a;
    double b;
    double c;
    double m = 0;
  
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    
    if((b > a) && (b > c)){
        m = a;
        a = b;
        b = m;
    }else
    if(c > a){
        m = a;
        a = c;
        c = m;
    }
    if(a >= (b + c)){
        System.out.println("NAO FORMA TRIANGULO");
    }else{
    if((a * a) == (b * b + c * c)){
        System.out.println("TRIANGULO RETANGULO");
    }
    if((a * a) > (b * b) + (c * c)){
        System.out.println("TRIANGULO OBTUSANGULO");
    }
    if((a * a) < (b * b + c * c)){
        System.out.println("TRIANGULO ACUTANGULO");
    }
    if((a == b) && (b == c)){
       System.out.println("TRIANGULO EQUILATERO");  
    }
    if((a == b && a != c)|(b == c && b != a)|(a == c && a != b)){
       System.out.println("TRIANGULO ISOSCELES");
    }
    }
    }
}
