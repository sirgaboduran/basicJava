package jStrings;

import libs.Input;

public class Iniciales
{

    public static boolean imprimirIniciales()
    {
        System.out.println("Introduce tu nombre:");
        String[] nombreCompleto;
        try
        {
            nombreCompleto = Input.get_string().split(" ");
            for (int i = 0; i < nombreCompleto.length; i++ )
            {
                if (nombreCompleto[i].charAt(0) >= 'A' && nombreCompleto[i].charAt(0) <= 'Z')
                    if (i == nombreCompleto.length - 1)
                    {
                        for (int j = 0; j < nombreCompleto.length; j++ )
                        System.out.print(nombreCompleto[i].charAt(0));
                    }
                else
                    {
                        System.out.println("El formato es incorrecto, por favor introduce correctamente tu nombre (La primera letra de cada nombre/apellido debe ser mayúscula)");
                        return false;
                    }
            }
        }
        catch (Exception e)
        {
            System.out.println("El formato es incorrecto, por favor introduce correctamente tu nombre (La primera letra de cada nombre/apellido debe ser mayúscula)");
        }
        return true;
    }

    public static void main(String[] args)
    {
        while (!imprimirIniciales());
    }
}
