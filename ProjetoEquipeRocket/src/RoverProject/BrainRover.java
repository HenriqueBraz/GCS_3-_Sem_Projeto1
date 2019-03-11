/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverProject;

/**
 *Legenda de retornos:
 * 1 ---> OK
 * -1 ---> Exception
 * -2 ---> Erro de coordenadas fora do platô  ou perigo de
 * queda (o Rover não executará a ação para erros de código -2)
 * Os pontos cardeais N,S,E,W devem ser uma String upperCase
 * @author Henrique
 */
public class BrainRover {

    private static int lengthx = 0;
    private static int lengthy = 0;
    private static int x = 0;
    private static int y = 0;
    private static int xBackup = 0;
    private static int yBackup = 0;
     private static String positionBackup = "";
    private static String position = "";
    
    /**
     *Função para testar os limites do platô
     * a e b devem ser inteiros
     * Se retornar -2, Rover não executa a cadeia de comandos,
     * permanecendo na posição inicial
     * @param a
     * @param b
     * @return
     */
    public static int platoTest(int a, int b){
        
       if (x > lengthx || x < 0 || y > lengthy || y < 0) {
                x = xBackup;
                y = yBackup;
                position = positionBackup;
                System.out.println("Warning: Cadeia de comandos não executada - perigo de queda");
                System.out.println("posição atual: ["+xBackup+", "+yBackup+", "+positionBackup+"]");
                return -2;
       }
       return 1;
    }

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
        } catch (Exception e) {

            System.out.println("Erro: -1: " + e.getMessage());
            return -1;
        }
    }

    /**
     * Posição inicial do Rover, a representa posição no eixo x
     * e b posição no eixo y
     * s representa o ponto cardeal no qual o Rover está apontado e deve ser 
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
                xBackup = a;
                yBackup = b;
                positionBackup = s;
                x = a;
                y = b;
                position = s;
            }
        } catch (Exception e) {

            System.out.println("Erro: -1: " + e.getMessage());
            return -1;
        }
        return 1;
    }

    public static String[] roverMove(String[] comandos) {

        try {
            for (String comando : comandos) {
                switch (comando) {
                    case "L":
                        if (null != position) switch (position) {
                    case "N":
                        position = "W";
                        break;
                    case "S":
                        position = "E";
                        break;
                    case "E":
                        position = "N";
                        break;
                    case "W":
                        position = "S";
                        break;
                    default:
                        break;
                }
                        break;
                    case "R":
                        if (null != position) switch (position) {
                    case "N":
                        position = "E";
                        break;
                    case "S":
                        position = "W";
                        break;
                    case "E":
                        position = "S";
                        break;
                    case "W":
                        position = "N";
                        break;
                    default:
                        break;
                }
                        break;
                    case "M":
                        if (null != position) switch (position) {
                    case "N":
                        y++;
                        break;
                    case "S":
                        y--;
                        break;
                    case "E":
                        x++;
                        break;
                    case "W":
                        x--;
                        break;
                    default:
                        break;
                }
                        break;
                }
            }
            if(platoTest(x,y) == -2){
            }else{
            String stringX = Integer.toString(x);
            String stringY = Integer.toString(y);
            String [] retorno = {stringX,stringY,position};    
            return retorno;
            }
        }catch(Exception e){
                
            System.out.println("Erro -1:" + e.getMessage());
        }
        String[] retorno = {"-2"};
        return retorno;
    }

}
