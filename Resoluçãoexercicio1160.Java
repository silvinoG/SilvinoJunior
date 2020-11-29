import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int t;
    int pa;
    int pb;
    int c = 0;
    double ca;
    double cb;
    
    t = sc.nextInt();
    
    for(int i=1; i<=t; i++){
        c = 0;
        
    pa = sc.nextInt();
    pb = sc.nextInt();
    ca = sc.nextDouble();
    cb = sc.nextDouble();
    
    while(pa <= pb){
    pa *= (ca / 100.0) + 1.0;
    pb *= (cb / 100.0) + 1.0;
    c = c + 1;
    
    if(c > 100){
        System.out.printf("Mais de 1 seculo.\n");
        break;
        }
    }
    if(c <= 100){
        System.out.printf(c +" anos.\n");
            }
        }
    }
}
