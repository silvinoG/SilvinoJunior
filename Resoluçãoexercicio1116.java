import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    int n;
    int x = 0;
    int y = 0;
    double s = 0;
    
    n = sc.nextInt();
    
    for(int i=0;i<n;i++){
    x = sc.nextInt();
    y = sc.nextInt();
    
    if(y == 0){
        System.out.println("divisao impossivel");
    }else{
    s = (double) x / y;
        System.out.printf("%.1f\n",s);
    }
        }
    }
}                            
