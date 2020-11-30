import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    
    int [] x = new int  [20];
    int i = 0;
    int y = 0;
    int a = 0;

    for(i=0; i<20; i++)
        x[i] = sc.nextInt();
    
    for(i=0, y=19; i<10; i++, y--){
        a = x[i];
        x[i] = x[y];
        x[y] = a;
    }
    for(i=0; i<20; i++){
    System.out.println("N["+i+"] = "+x[i]);
            }
        }
    }
