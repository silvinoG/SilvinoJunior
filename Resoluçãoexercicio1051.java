import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double s;
    double c = 0;
    double r = 0;
    double t = 0;
    double y = 0;
    double x = 0;
    
    s = sc.nextDouble();
    
    if(s < 2000.00){
    System.out.print("Isento\n");
    }else
    if(s > 2000.01 && s < 3000.00){
        c = (s - 2000.00);
        t = c * 0.08;
    System.out.printf("R$ %.2f\n",t);    
    }else
    if(s > 3000.01 && s <= 4500.00){
        c = (s - 2000.00);
        y = (c - 1000.00);
        r = 80;
        x = y * 0.18;
        t = x + r;
    System.out.printf("R$ %.2f\n",t);    
    }else
    if(s > 4500.00){
        c = (s - 3500.00);
        y = (c - 1000.00);
        r = 350;
        x = y * 0.28;
        t = r + x;
    System.out.printf("R$ %.2f\n",t);
    }
}
}
