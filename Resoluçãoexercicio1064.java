import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double x = 0;
    double s = 0;
    double c = 0;
    int p = 0;
    
    for(int i=0; i<6; i++){
        x = sc.nextDouble();
        if(x > 0){
            p = p + 1;
            c = c + x;
        }
    x = x + 1;
    }
    
    s = c / p;
    
    System.out.println(p+" valores positivos");
    System.out.printf("%.1f\n",s);
    }
}
