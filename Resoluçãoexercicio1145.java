import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int x;
    int y;
    
    x = sc.nextInt();
    y = sc.nextInt();
    
    for(int i=1; i<=y; i++){
        System.out.print(i);
            if(i % x == 0){ 
            System.out.println("");
        }else
        System.out.print(" ");
        }
    }
}
