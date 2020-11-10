import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    int x;
    int y;
    int m  = 0;
    
    x = sc.nextInt();
    y = sc.nextInt();
    
    if(x <= y){
    for(int i=x; i<=y; i++){
        if(i % 13 != 0)
        m = m + i;
    }
    }else
    if(y <= x){
    for(int i=y; i<=x; i++){
        if(i % 13 != 0)
        m = m + i;
    }
    }
      System.out.println(m);
    }
}
