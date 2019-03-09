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
public class BrainRover {
    private static int lengthx = 0;
    private static int lengthy = 0;
    private static int x = 0;
    private static int y = 0;
    private static String position = "";
    
    public static int grid(int a, int b){  
	
        try{
            
            lengthx = a;
            lengthy = b;
            return 1;   
        } 
        catch(NullPointerException e){
                
            System.out.println("Erro:" + e);
            return -1;
        }   
    }
    
    public static int initialPosition(int a, int b, String s){  
	
        try{
            if(a > lengthx ||a < lengthx ||b > lengthy ||b < lengthy){
              System.out.println("Coordenadas fora do platô");  
              return -2;
            }
            else{
                
                x = x + a;
                y = y + b;
                position = s;               
            }   
        } 
        catch(NullPointerException e){
                
            System.out.println("Erro:" + e);
            return -1;
        }
        return 1;
    }
    
    public static int roverMove(int a, int b){  
	
        try{
               if(x > lengthx ||x < lengthx ||y > lengthy ||y < lengthy){
                x = x - a;
                y = y - b;
                position = "";
                System.out.println("Warning: Roover cairá do platô se executar a ação");
                return -2;
                
                }
           
            return 1;   
        } 
        catch(NullPointerException e){
                
            System.out.println("Erro:" + e);
            return -1;
        }   
    }
  
}
  
    
    

