/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial objfact =  new Factorial ();
        System.out.println ("El factorial de 15 mediante recursivo es " + objfact.factorialRecursivo(15));
        
    }
   public int factorialRecursivo( int n){
       if ( n < 0){
           return 0; 
       }else{
           if (n== 0){
               return 1;
           }else{
               return n * factorialRecursivo(n-1);
           }
           
       }
   } 
}
