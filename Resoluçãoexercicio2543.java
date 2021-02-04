import java.util.Scanner;
public class Testes {
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int inj;
    int ng;
    int inu;
    int j;
  
    while(sc.hasNext()){ //EOF
    
     ng = sc.nextInt();  //numero de jogos publicados
     inj = sc.nextInt(); //identificação do jogador
    
    int c = 0; //reinicia a variavel c
    for (int i = 0; i < ng; i++) { //faz todos os jogos
      inu = sc.nextInt(); //identificação da universidade
      j = sc.nextInt(); //identificação do jogo
    
      if(inj == inu && j == 0){ //se identificação do jogador for igual a da universidade e o numero do jogo receber 0
              c++;  //faça a icrementação   
      }
    }
        System.out.println(c);
    }
    }
    }
