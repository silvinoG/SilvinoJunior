import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
     
    int i;
    int b;
    int A = 0;
    long T = 0;
    long C = 0;
    long primeiro = 0;
    long segundo = 1;
    
    A = sc.nextInt();
    
    for(i =1; i <=A; i++, primeiro = 0, segundo = 1) {
        
       T = sc.nextInt();
       T = T + 1;
        
       for(b = 0; b < T; b++) {
    
        if (b <=1) C = b;
       
        else {
           
        C = primeiro + segundo;
        primeiro = segundo;
        segundo = C;
       } 
    }
        System.out.printf("Fib (%d) = %d\n " ,b-1 ,C);
        }
    }
}
