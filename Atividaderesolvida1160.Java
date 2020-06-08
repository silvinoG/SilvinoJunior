import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      
    Scanner sc = new Scanner(System.in);
    
    int X = 0;
    int A = 0;
    int B = 0;
    int C = 0;
    int i;
    double AC = 0;
    double BC = 0;
    
    X = sc.nextInt();
    
    for(i=1; i<=X; i++){
        C = 0;
      
    A = sc.nextInt();
    B = sc.nextInt();
    AC = sc.nextDouble();
    BC = sc.nextDouble();
        
    while(A<=B) {
        A*= (AC/100.0) + 1.0;
        B*= (BC/100.0) + 1.0;
        C++;
    if(C>100){
            System.out.printf("Mais de um século.\n");
        break;
        }
    }
    if(C<=100)
            System.out.printf("%d Anos.\n", C);
        }
    }
}
