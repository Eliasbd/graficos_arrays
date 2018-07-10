/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays_anvanced;

/**
 *
 * @author JB
 */

import java.util.Scanner;

public class Arrays_anvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        int num_notas;
        int not;
        //String in = " "; String bueno = " ";String mb = " ";String sobre = " ";
        int cont_in = 0, cont_b = 0, cont_mb = 0, cont_sobre = 0,cont_ex = 0;
        
        System.out.println("Sistema de Notas");
        System.out.println();
        System.out.print("Ingrese la cantidad de notas que va a Graficar! →  ");
        num_notas = tec.nextInt();
         System.out.println();
         
        int[] arrays_notas= new int[num_notas];
        
        for(int y = 0; y < arrays_notas.length ; y++){
            
            System.out.print("Ingrese la " + (y+1) + " nota a graficar →  ");
            not = tec.nextInt();
            arrays_notas[y] = not;
            System.out.println();
            
       
            
            
            
        }
        
        
        for(int c = 0; c < arrays_notas.length ; c++){
            
            if(arrays_notas[c] == 0 || arrays_notas[c]   <= 40 ){
                cont_in++;
            }else  if(arrays_notas[c] == 41 || arrays_notas[c]   <= 60 ){
                cont_b++;
            }else  if(arrays_notas[c] == 61 || arrays_notas[c]   <= 80 ){
                cont_mb++;
            }else  if(arrays_notas[c] == 81 || arrays_notas[c]   <= 95 ){
                cont_sobre++;
            }else  if(arrays_notas[c] == 96 || arrays_notas[c]   <= 100 ){
                cont_ex++;
            }
            
            
            
            
        }
        
        System.out.println("GRAFICOS");
        System.out.println();
        System.out.print("→  0 a 40 = ");
        
        
        for(int x = 0 ; x < cont_in ; x++){
            
            System.out.print("♦");
            
            
        }
        
        System.out.println();
        System.out.print("→ 41 a 60 = ");
        
        
        for(int x = 0 ; x < cont_b ; x++){
            
            System.out.print("♦");
            
            
        }
        
        System.out.println();
        System.out.print("→ 61 a 80 = ");
        
        
        for(int x = 0 ; x < cont_mb ; x++){
            
            System.out.print("♦");
            
            
        }
        
        System.out.println();
        System.out.print("→ 81 a 95 = ");
        
        
        for(int x = 0 ; x < cont_sobre ; x++){
            
            System.out.print("♦");
            
            
        }
        
        System.out.println();
        System.out.print("→ 96 a 100= ");
        
        
        for(int x = 0 ; x < cont_ex ; x++){
            
            System.out.print("♦");
            
            
        }
        
        
    }
    
}
