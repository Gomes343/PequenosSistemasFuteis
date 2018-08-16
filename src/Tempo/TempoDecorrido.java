package Tempo;

import java.util.Scanner;

public class TempoDecorrido {    
    public static void main(String[]args){
        long inicio = System.currentTimeMillis();
        System.out.println("pressione enter quando quiser parar!");
        
        Scanner sc = new Scanner(System.in);
        
        sc.nextLine();
        
        long fim = System.currentTimeMillis() - inicio;
        
        System.out.println("O processo levou "+fim+" ms");
        
        System.out.println("equivalente a "+fim/1000+" segundos");
        
    }





    
}
