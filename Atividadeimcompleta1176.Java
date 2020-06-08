import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
     
    int T = 0;
    int i;
    int A = 0;
    int B = 0;
    long long int C = 0;
    int primeiro = 0;
    int segundo = 1;
    
    A = sc.nextInt();
    
    for(i =1; i <=A; i++, primeiro = 0, segundo = 1) {
        
       T = sc.nextInt();
       T = T + 1;
        
       for(B = 0, B< T; B++) {
           if (B <=1) C = B
       }else {
           C = primeiro + segundo;
           primeiro = segundo;
           segundo = C;
       } 
    }
    System.out.printf("Fib (%lld) = %lld\n " ,B-1 ,C);
        }
    }
}
