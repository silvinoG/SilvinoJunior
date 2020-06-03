import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
     int x, z;
     int soma, contagem;
     
     x = sc.nextInt();
     z = sc.nextInt();
     z = sc.nextInt();
     
     while (z<=x);
     
     soma = contagem = 0;
     
    while (soma < z){
        soma += x;
        x++;
        contagem++;
        }
     
        System.out.printf("%d\n", contagem);
    }
}
