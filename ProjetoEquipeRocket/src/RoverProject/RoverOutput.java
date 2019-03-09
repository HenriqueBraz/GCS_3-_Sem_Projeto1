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
public class RoverOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         String[] comandos = {"L","M","L","M","L","M","L","M","M"}; 
         BrainRover.grid( 5, 5 );
         BrainRover.initialPosition(1, 2,"N");
         System.out.println(Arrays.toString(BrainRover.roverMove(comandos)));
         
        
        
    }
    
}
