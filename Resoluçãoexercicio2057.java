import java.util.Scanner;
public class Testes {

    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int s;
    int t;
    int f;
    int c = 0;
    
    s = sc.nextInt();
    t = sc.nextInt();
    f = sc.nextInt();
    
    c = s + t + f;
    
    if(c >= 24){
        c = c - 24;
    }else
    if(c < 0){
        c = c + 24;
    }
     System.out.println(c);
}
}
