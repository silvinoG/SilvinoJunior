import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
Scanner sc = new Scanner (System.in);
    char L;
    double MC = 0;
    double MR = 0;
    double MS = 0;
    int T = 0;
    int N;
    int Q;
    int C = 0;
    int R = 0;
    int S = 0;
    
    N = sc.nextInt();
     
    for(int i=0; i<N; i++){
    Q = sc.nextInt();
    L = sc.next().charAt(0);
        T = T + Q;
        if(L == 'C'){
            C = C + Q;
        }
        if(L == 'R'){
            R = R + Q;
        }
        if(L == 'S'){
            S = S + Q;
        }
    MC = (C * 100.0) / T;
    MR = (R * 100.0) / T;
    MS = (S * 100.0) / T;
    }
    System.out.println("Total: "+ T + " cobaias");
    System.out.println("Total de coelhos: " + C);
    System.out.println("Total de ratos: " + R);
    System.out.println("Total de sapos: " + S);
    System.out.printf("Percentual de coelhos: %.2f %%\n",MC);
    System.out.printf("Percentual de ratos: %.2f %%\n",MR);
    System.out.printf("Percentual de sapos: %.2f %%\n",MS);
    }
}
