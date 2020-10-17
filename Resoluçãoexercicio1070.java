import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int x;
    
    x = sc.nextInt();
    
    for(int i = x; i < x + 12; i++){
        if(i % 2 == 1)
    System.out.println(i);  
    }
    }
}
