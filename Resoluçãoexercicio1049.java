import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
    
     Scanner sc = new Scanner (System.in);
      
        String nome = "vertebrado"+"invertebrado";
        String tipo = "ave"+"mamifero"+"inseto"+"anelideo";
        String classe = "carnivoro"+"onivoro"+"herbivoro"+"hematofago";
        
        nome = sc.next();
        tipo = sc.next();
        classe = sc.next();
        
        if((nome.equals("vertebrado")) && (tipo.equals("ave")) && (classe.equals("carnivoro"))){
            System.out.println("aguia");
        }else
        if((nome.equals("vertebrado")) && (tipo.equals("ave")) && (classe.equals("onivoro"))){
            System.out.println("pomba");    
        }else
        if((nome.equals("vertebrado")) && (tipo.equals("mamifero")) && (classe.equals("onivoro"))){
            System.out.println("homem");
        }else
        if((nome.equals("vertebrado")) && (tipo.equals("mamifero")) && (classe.equals("herbivoro"))){
            System.out.println("vaca");
        }else
        if((nome.equals("invertebrado")) && (tipo.equals("inseto")) && (classe.equals("hematofago"))){
            System.out.println("pulga");
        }else
        if((nome.equals("invertebrado")) && (tipo.equals("inseto")) && (classe.equals("herbivoro"))){
            System.out.println("lagarta");
        }else
        if((nome.equals("invertebrado")) && (tipo.equals("anelideo")) && (classe.equals("hematofago"))){
            System.out.println("sanguessuga");
        }else
        if((nome.equals("invertebrado")) && (tipo.equals("anelideo")) && (classe.equals("onivoro"))){
            System.out.println("minhoca");
        }
    }
}
