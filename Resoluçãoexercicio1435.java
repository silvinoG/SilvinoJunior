import java.util.Scanner;

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
    int n;
    int x = 0;
    
    n = sc.nextInt();  //entrada do tamanho da matriz
    
    while(n > 0){   //enquanto for maior que zero faça
    
    for(int i=1; i<=n; i++){   //linha da matriz
        for(int j=1; j<=n; j++){   //coluna da matriz
            x = i;     //x passa a ser o valor de i em todos os testes da matriz
    if(j < x) x = j;   //se j for menor que x então x passa a ser j
    if(n - i + 1 < x) x = n - i + 1;     //se n menos i mais 1 for menor que x, x é igual a n menos i mais 1
    if(n - j + 1 < x) x = n - j + 1;    //se n menos j mais 1 for menor que x, x é igual a n menos j mais 1
    
    System.out.printf("%3d",x);   //imprima a matriz
    if (j < n) System.out.print(" ");   //se j for menor que n imprime um espaço
   else 
   System.out.print("\n");   //pule uma linha na matriz
        }    
    }
    System.out.print("\n");   //pule uma linha após a matriz
    n = sc.nextInt();   //leia outro valor
    }
    } 
}
