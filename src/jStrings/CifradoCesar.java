package jStrings;

import libs.Input;

public class CifradoCesar
{
    public static void main(String[] args)
    {
        System.out.println("Introduce un texto a encriptar");
        String texto = Input.get_string();
        System.out.println("Introduce la clave");
        int clave = Input.get_int();
        char letraEncriptada;
        clave %= 26;
        for (int i = 0; i < texto.length(); i++)
        {
            if ((texto.charAt(i) >= 'A') && (texto.charAt(i) <= 'Z'))
            {
            letraEncriptada = (char) (((char) texto.charAt(i)) + clave);
            if ((int) letraEncriptada < 90)
                System.out.print((char) letraEncriptada);
            else
                System.out.print((char) (letraEncriptada - 26));
            }
            else System.out.print(texto.charAt(i));
        }
    }
}
