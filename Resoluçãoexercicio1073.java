import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int n;
    int c = 0;
    int i = 0;
    
    n = sc.nextInt();
    
    for( i=1; i<n; i++){
        i = i + 1;
        c = i * i;
    System.out.println(i +"^2 = "+ c);
}
}
}
