import java.util.Scanner;
public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
 
    int n;
    double c = 0;
    double ct = 0;
    
    n = sc.nextInt();
    
    c = Math.pow((1 + Math.sqrt(5))/ 2, n) - Math.pow((1 - Math.sqrt(5))/ 2, n);
    ct = c / Math.sqrt(5);
    
    System.out.printf("%.1f\n",ct);
}  
}
