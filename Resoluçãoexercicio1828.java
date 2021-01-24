import java.util.Scanner;

public class Testes {

    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    String n1,n2 = "papel" + "pedra" + "tesoura" + "lagarto" + "Spock";
    int t;
    int i;
    
    t = sc.nextInt();
    
    for(i=1; i<=t; i++){
    
    n1 = sc.next(); n2 = sc.next();
      
        if(n1.equals(n2)){
        System.out.println("Caso #"+i+": De novo!");
    }else{
        if(n1.equals("papel") && n2.equals("pedra")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("tesoura") && n2.equals("papel")){
         System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("tesoura") && n2.equals("lagarto")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("pedra") && n2.equals("lagarto")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("lagarto") && n2.equals("Spock")){
        System.out.println("Caso #"+i+": Bazinga!");  
    }else{
        if(n1.equals("Spock") && n2.equals("tesoura")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("lagarto") && n2.equals("papel")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("papel") && n2.equals("spock")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("spock") && n2.equals("pedra")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
        if(n1.equals("pedra") && n2.equals("tesoura")){
        System.out.println("Caso #"+i+": Bazinga!");
    }else{
          System.out.println("Caso #"+i+": Raj trapaceou!");
}
}
}
}
}
}
}
}
}
}
}
}
}
}
