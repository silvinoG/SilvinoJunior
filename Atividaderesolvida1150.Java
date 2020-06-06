import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
    int x, z;
    int s, c;
     
     x = sc.nextInt();
     z = sc.nextInt();
     z = sc.nextInt();
     
    while (z <= x);
     
     s = c = 0;
     
    while (s < z){
        s += x;
        x = x + 1;
        c = c + 1;
        }
     
        System.out.printf("%d\n", c);
    }
}
