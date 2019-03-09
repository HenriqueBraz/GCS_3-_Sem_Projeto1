/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverProject;

/**
 *Legenda de retornos:
 * 1 ---> OK
 * -1 ---> RuntimeException
 * -2 ---> Erro de coordenadas fora do platô, colisão ou
 * queda (o Rover não executará a ação para erros de código2)
 * Os pontos cardeais N,S,E,W devem ser uma String upperCase
 * @author Henrique
 */
public class BrainRover {

    private static int lengthx = 0;
    private static int lengthy = 0;
    private static int x = 0;
    private static int y = 0;
    private static String position = "";

    /**
     *parâmetros a e b devem ser inteiros, esse é o tamanho da grade.
     * Ex: grid(5,5) signfica que o eixo x terá 5 pontos de deslocamento
     * e o eixo y idem
     * @param a 
     * @param b
     * @return
     */
    public static int grid(int a, int b) {

        try {

            lengthx = a;
            lengthy = b;
            return 1;
        } catch (RuntimeException e) {

            System.out.println("Erro: -1: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Posição inicial do Rover, a representa posição no eixo x
     * e b posição no eixo y
     * s representa o ponto cardeal no qual o Rver está apontado e deve ser 
     * uma String upperCase (N,S,E,W)
     * @param a
     * @param b
     * @param s
     * @return
     */
    public static int initialPosition(int a, int b, String s) {

        try {
            if (a > lengthx || a < 0 || b > lengthy || b < 0) {
                System.out.println("Coordenadas fora do platô");
                return -2;
            } else {

                x = a;
                y = b;
                position = s;
            }
        } catch (NullPointerException e) {

            System.out.println("Erro: -1: " + e.getMessage());
            return -1;
        }
        return 1;
    }

    public static String[] roverMove(String[] comandos) {

        try {
            for (int i = 0; i < comandos.length; i++) {
                switch (comandos[i]) {

                    case "L":
                        if (position == "N") {
                            position = "W";
                        }
                        else if (position == "S") {
                            position = "E";
                        }
                        else if (position == "E") {
                            position = "N"; 
                        }
                        else if (position == "W") {
                            position = "S";
                        }
                        break;
                        
                    case "R":
                        if (position == "N") {
                            position = "E";
                        }
                        else if (position == "S") {
                            position = "W";
                        }
                        else if (position == "E") {
                            position = "S"; 
                        }
                        else if (position == "W") {
                            position = "N";
                        }
                        break;
                        
                    case "M":
                        if (position == "N") {
                            y++;
                        }
                        else if (position == "S") {
                            y--;
                        }
                        else if (position == "E") {
                            x++; 
                        }
                        else if (position == "W") {
                            x--; 
                        }
                        break;
                        
                }

            }
        String stringX = Integer.toString(x);
        String stringY = Integer.toString(y);
        String [] retorno = {stringX,stringY,position};    
        return retorno;
        }catch(NullPointerException e){
                
            System.out.println("Erro -1:" + e.getMessage());
        }
        return null;
    }

}
