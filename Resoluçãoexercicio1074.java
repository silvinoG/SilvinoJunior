import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n;
    int x = 0;
    
    n = sc.nextInt();
    
    for(int i = 0; i<n; i++){
        x = sc.nextInt();
        
            if((x % 2 == 0) && (x > 0)){
                System.out.println("EVEN POSITIVE");
            }else
            if((x % 2 != 0) && (x > 0)){
                System.out.println("ODD POSITIVE");
            }else
            if((x % 2 == 0) && (x < 0)){
                System.out.println("EVEN NEGATIVE");
            }else
            if((x % 2 != 0) && (x < 0)){
                System.out.println("ODD NEGATIVE");
            }else{
                System.out.println("NULL");
            }
        x = x + 1;
        }
    }
}
