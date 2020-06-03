import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
     int X;

     X = sc.nextInt();
     
     while (X!=0) {
        for(int i=1; i<=X; i++){
        
        if(i==X)
            System.out.print(i + "\n");
        else
            System.out.print(i + " ");
        }
        
        X = sc.nextInt();
     }
    }
}
