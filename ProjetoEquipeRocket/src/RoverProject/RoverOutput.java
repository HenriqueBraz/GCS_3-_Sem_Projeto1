/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverProject;

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
        
         BrainRover.grid( 2, 2 );
         System.out.println(BrainRover.initialPosition(1, 1, "S"));
         
        
        
    }
    
}
