import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        
    Scanner sc = new Scanner(System.in);
      int x;
      int y;
      int s = 0;

    x = sc.nextInt();
    y = sc.nextInt();
    
    if(x < y){
        for(int i=x+1; i<y; i++){
            if(i % 2 != 0){
            s = s + i;
        }    
        }
    }else{
        for(int i=y+1; i<x; i++){
            if(i % 2 != 0){
            s = s + i;
        } 
    }
    }
      System.out.println(s);
    }
}
