import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in); 
    
    int n;
    int c = 1;
    
    n = sc.nextInt();

    for(int i=0; i<n; i++){
        for(int a=1; a<4; a++){
        
    System.out.printf(c + " ");
     c = c + 1;
        }
    System.out.printf("PUM\n");
    c = c + 1;
    }
}
}
