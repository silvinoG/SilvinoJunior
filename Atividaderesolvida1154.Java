import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int a = 0;
    double b = 0;
    double c = 0;
    
    while (c >= 0){
    
        c = sc.nextInt();

    if (c >= 0) {
        b += c;
        a = a + 1;
    }
}
        c = b / a;
        
     System.out.printf("%.2f", c);
    }
}
