import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    double x;
    int p = 0;
    
    for(int i = 0; i < 6; i++){
        x = sc.nextDouble();
        if(x > 0){
            x = p;
            p = p + 1;
        }
        x = x + 1;
    }
     System.out.println(p + " valores positivos");
    }
}
