import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int N;
    int X = 0;
    int Y = 0;
    int i = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    
    N = sc.nextInt();
    
    for(i=1; i<=N; i++) {
    
    X = sc.nextInt();
    Y = sc.nextInt();
        
        if(X%2==1){
        c = 0;
    for(a=1; a<=Y; a++)
    {
        c += X;
        X += 2;
    }
        System.out.printf("%d\n", c);
    }else{
        
        X++;
        c = 0;
    for(b=1; b<=Y; b++){
        c += X;
        X+=2;
    }    
        System.out.printf("%d\n", c);
    }
}
    }
}
