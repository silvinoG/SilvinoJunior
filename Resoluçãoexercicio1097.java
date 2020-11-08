import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    int i;
    int j;
    int n = 7;
    
    for(i=0; i<=9; i ++){
    i = i + 1;
    for(j=n; j>(n - 3); j--)
    System.out.println("I="+i+" J="+j);
    n = n + 2;
    }
    }
}
