import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
    Scanner sc = new Scanner (System.in);

    double N1;
    double N2;
    double N3;
    double N4;
    double exame = 0;
    double MEDIA = 0;
    double MEDIAF = 0;
    
    N1 = sc.nextDouble();
    N2 = sc.nextDouble();
    N3 = sc.nextDouble();
    N4 = sc.nextDouble();
    
    MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;
        
        System.out.printf("Media: %.1f\n", MEDIA);
        
    if(MEDIA >= 7){
        System.out.printf("Aluno aprovado.\n");
    }else
    if(MEDIA < 5){
        System.out.printf("Aluno reprovado.\n");
    }else
    if(MEDIA >= 5){
        System.out.printf("Aluno em exame.\n");
        exame = sc.nextDouble();
        MEDIAF = (MEDIA + exame) / 2;
        System.out.printf("Nota do exame: %.1f\n", exame);
    
    if(MEDIAF >= 5){
        System.out.printf("Aluno aprovado.\n");
    }else{
        System.out.printf("Aluno reprovado.\n");
    }
        System.out.printf("Media final: %.1f\n", MEDIAF);
    }
        }
    }
