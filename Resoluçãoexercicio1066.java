import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    
    int x;
    int p = 0;
    int y = 0;
    int s = 0;
    int n = 0;
    
    for(int i = 0; i <5; i++){
        x = sc.nextInt();
        if(x % 2 == 0){
            p = p + 1;
        }
        if(x % 2 != 0){
            y = y + 1;
        }
        if(x > 0){
            s = s + 1;
        }
        if(x < 0){
            n = n + 1;
        }
    x = x + 1;
    }
    System.out.println(p+" valor(es) par(es)");
    System.out.println(y+" valor(es) impar(es)");
    System.out.println(s+" valor(es) positivo(s)");
    System.out.println(n+" valor(es) negativo(s)");
    }
}
