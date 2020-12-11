import java.util.Scanner;

public class Testes {
   
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
        
    int n;
    int x = 0;
    
    n = sc.nextInt();  //entrada do tamanho da matriz
    
    while(n > 0){ //enquanto n for maior que zero faça
    
    for(int i=1; i<=n; i++){  //linha da matriz
        x = i;  //x é igual a i
        for(int j=1; j<=n; j++){  //coluna da matriz
            
        if(j == i){  //se j receber o mesmo valor de i
        x = 1;  //então x é igual a 1
    }
    System.out.printf("%3d",x); //imprima a matriz
        if (j < n) System.out.print(" "); //se j for menor que n imprime um espaço
    else 
    System.out.print("\n"); //pule uma linha na matriz

        if(j >= i){ //se j for maior ou igual a i
        x = x + 1; //x é igual a x mais 1
    }else{  //senão
        x = x - 1; //x é igual a x menos 1
            }
        }
    }
    System.out.println("\n"); //pule uma linha após a matriz
    n = sc.nextInt(); //leia outro valor
        } 
    }
}
