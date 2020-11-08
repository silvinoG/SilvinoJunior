import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner (System.in);
    
    int n;
    int x;
    int y;
    
    n = sc.nextInt();
    
    for(int i=0; i<n; i++){
    x = sc.nextInt();
    y = sc.nextInt();
    
    int r = 0;
    int t = 0;
    
    if(x<y){
        for(int s=x+1; s<y; s++){
            if(s % 2 != 0){
        r = r + s;
            }
        }
        System.out.println(r);
    }else{
    for(int s=y+1; s<x; s++){
        if(s % 2 != 0){
        t = t + s;
            }
        }
        System.out.println(t);
            }
        }
    }
}
