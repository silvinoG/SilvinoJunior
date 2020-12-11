import java.util.Scanner;
public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
        
    int n;
    
    //hasNext() - retorna true enquanto existir proximo elemento na lista
    //usado normalmente com o "EOF"
    
    while(sc.hasNext()){ //enquanto o valor for true faça
        
    n = sc.nextInt(); //leia o numero
    
     if(n == 0){
        System.out.println("vai ter copa!");
     }else
        System.out.println("vai ter duas!");
        } 
    }
}
