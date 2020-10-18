import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int x;
    int p = 0;
    
    for(int i=0; i<5; i++){
        x = sc.nextInt();
        if(x % 2 == 0){
            p = p + 1;
        }
    x = x + 1;
    }
    System.out.println(p+" valores pares");
    }
}
