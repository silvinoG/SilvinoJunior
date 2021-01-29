import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int n = 0;
    int c = 0;
    int t;
    
    t = sc.nextInt(); //numero escolhido
    
    for(int i=0; i<5; i++){
    
    n = sc.nextInt(); //numero de entrada
    
    if(n == t)   //se o numero da entrada for o mesmo escolhido
     c++;   //faça a incrementação
    }
    System.out.println(c); 
    }
}
