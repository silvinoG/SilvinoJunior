import java.util.Scanner;
 import java.text.DecimalFormat;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner (System.in);
    DecimalFormat df = new DecimalFormat("0.0");

    double N1;
    double N2;
    double N3;
    double N4;
    double e;
    double M = 0;
    double MF = 0;
    
    N1 = sc.nextDouble();
    N2 = sc.nextDouble();
    N3 = sc.nextDouble();
    N4 = sc.nextDouble();
    
    M = (N1 * 2 + N2 * 3 + N3 * 4 + N4 * 1) / (2+3+4+1);
        
        System.out.println("Media: "+ df.format(M));
        
    if(M >= 7.0){
        System.out.println("Aluno aprovado.");
    }else
    if(M < 5.0){
        System.out.println("Aluno reprovado.");
    }else{
        System.out.println("Aluno em exame.");
        e = sc.nextDouble();
        System.out.printf("Nota do exame: %.1f\n",e);
        MF = (M + e) / 2;
    
    if(MF > 5.0){
        System.out.println("Aluno aprovado.");
    }else
        System.out.println("Aluno reprovado.");
        System.out.printf("Media final: %.1f\n",MF);
    }
    }
 
}
