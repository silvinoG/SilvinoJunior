import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double s;
    double c = 0;
    double r = 0;
    
    s = sc.nextDouble();
    
    if((s >= 0.0)  && (s <= 400.00)){
        r = s * 0.15;
        c = s + r;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", r);
        System.out.println("Em percentual: 15 %");
    }else
        if((s >= 400.01)  && (s <= 800.00)){
        r = s * 0.12;
        c = s + r;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", r);
        System.out.println("Em percentual: 12 %");
        
    }else
        if((s >= 800.01)  && (s <= 1200.00)){
        r = s * 0.10;
        c = s + r;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", r);
        System.out.println("Em percentual: 10 %");
        
    }else
        if((s >= 1200.01)  && (s <= 2000.00)){
        r = s * 0.07;
        c = s + r;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", r);
        System.out.println("Em percentual: 7 %");
        
    }else
        if(s > 2000.00){
        r = s * 0.04;
        c = s + r;
        System.out.printf("Novo salario: %.2f\n", c);
        System.out.printf("Reajuste ganho: %.2f\n", r);
        System.out.println("Em percentual: 4 %");
        }
    }
}
