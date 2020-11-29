import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);
    int n;
    int x;
    int y;
    int c = 0;
    int s = 0;
    
    n = sc.nextInt();
    
    for(int i=0; i<n; i++){ 
    x = sc.nextInt();
    y = sc.nextInt();
    
    if(x % 2 == 1){
    c = 0;
    for(int a=0; a<y; a++){ 
    c = c + x;
    x = x + 2;
        }
        System.out.println(c);
    }else{
        x = x + 1;
        c = 0;
    for(int b=0; b<y; b++){
        c = c + x;
        x =x + 2;
    }
     System.out.println(c);
            }
        }
    }
}
