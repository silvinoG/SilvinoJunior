import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int n, i;
    int a = 0;
    int b = 1;
    int c = 0;
        
    n = sc.nextInt();

    for(i=1; i<n; i++) { 
            if(i%2==1){
        System.out.printf("%d ", c);
            c = a + b;
            a= c;
        }else {
            if(i==2){
        System.out.printf("%d ", c);
        
        }else {
            if(i%2==0){
        System.out.printf("%d ", c);
            c = a + b;
            b = c;
        }
        System.out.printf("%d\n", c);
    }
}
}
}
}
