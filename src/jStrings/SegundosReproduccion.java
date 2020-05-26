package jStrings;

import libs.Input;

public class SegundosReproduccion
{
    public static void main(String[] args)
    {
        String[] tiempo;
        int flag = 0;
        do
            {
                System.out.println("Introduce la duracion del video usando el formato: mm:ss");
                tiempo = Input.get_string().split(":");
                try
                    {
                        if (((Integer.parseInt(tiempo[1])) > 0) && ((Integer.parseInt(tiempo[1])) <= 59))
                            {
                                int segundos = Integer.parseInt(tiempo[0])*60 + Integer.parseInt(tiempo[1]);
                                System.out.println("El video tiene una duracion de " + segundos + " segundos");
                                 flag = 1;
                            }
                         else System.out.println("La cantidad de segundos es incorrecta");
                    }
                catch (NumberFormatException exp)
                    {
                        System.out.println("El formato es incorrecto, por favor introduce usando el formato: mm:ss");
                    }
            } while((tiempo.length != 2) || flag != 1);
    }
}
