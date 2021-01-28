import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);
    
    int qp = 0;
    int cp = 0;
    double s = 0;
    double st = 0;
    int t;
    
    t = sc.nextInt();
    
    for(int i=0; i<t; i++){
    cp = sc.nextInt(); qp = sc.nextInt();
    
    if(cp == 1001){
        s = qp * 1.50;
       }
    if(cp == 1002){
        s = qp * 2.50;
    }
    if(cp == 1003){
        s = qp * 3.50;
    }
    if(cp == 1004){
        s = qp * 4.50;
    }
    if(cp == 1005){
        s = qp * 5.50;
    }
    st = st + s;
    }
    System.out.printf("%.2f\n",st); 
    }
}
