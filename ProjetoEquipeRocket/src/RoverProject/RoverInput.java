/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverProject;

import java.util.Arrays;

/**
 *
 * @author Henrique
 */
public class RoverInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String[] comandos = {"L","M","L","M","L","M","L","M","M"}; 
         BrainRover.grid( 5, 5 );
         BrainRover.initialPosition(1, 2,"N");
         System.out.println(Arrays.toString(BrainRover.roverMove(comandos)));//1 3 N
         BrainRover.initialPosition(3, 3,"E");
         String[] comandos2 = {"M","M","R","M","M","R","M","R","R","M"};
         System.out.println(Arrays.toString(BrainRover.roverMove(comandos2))); //5 1 E         
        
    }
    
}
