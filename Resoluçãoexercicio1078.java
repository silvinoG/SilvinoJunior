import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n;
    int t = 0;
    
    n = sc.nextInt();
    
    for(int i=1; i<=10; i++){
        t = i * n;
        System.out.println(i +" x "+ n +" = "+ t);
        }
    }
}
