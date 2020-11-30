import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n;
    int x;
    int c;
    
    n = sc.nextInt();
    
    for(int i=0; i<n; i++){
        x = sc.nextInt();
        c = 0;
    
    for(int a=1; a<=x; a++){
        if(x % a == 0){
        c = c + 1;
        }
    }
    if(c == 2){
        System.out.printf(x+" eh primo\n");
    }else
        System.out.printf(x+" nao eh primo\n");
        }
    }
}
