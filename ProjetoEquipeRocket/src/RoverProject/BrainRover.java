/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoverProject;

import java.util.HashMap;

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

    public static int grid(int a, int b) {

        try {

            lengthx = a;
            lengthy = b;
            return 1;
        } catch (NullPointerException e) {

            System.out.println("Erro:" + e);
            return -1;
        }
    }

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

            System.out.println("Erro:" + e);
            return -1;
        }
        return 1;
    }

    public static int roverMove(String[] comandos) {

        try {
            for (int i = 0; i < comandos.length; i++) {

                switch (position) {

                    case "N":
                        if (comandos[i] == "L") {
                            position = "W";
                        }
                        if (comandos[i] == "R") {
                            position = "W";
                        }
                    case "S":
                        if (comandos[i] == "L") {
                            position = "E";
                        }
                        if (comandos[i] == "R") {
                            position = "W";
                        }

                    case "E":
                        if (comandos[i] == "L") {
                            position = "N";
                        }
                        if (comandos[i] == "R") {
                            position = "W";
                        }

                    case "W":
                        if (comandos[i] == "L") {
                            position = "S";
                        }
                        if (comandos[i] == "R") {
                            position = "W";
                        }
                }

            }
             return 1;
        }catch(NullPointerException e){
                
            System.out.println("Erro:" + e);
        return -1;
        }
    }

}
