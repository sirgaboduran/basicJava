package iConditionals;

import libs.Input;

public class MinimoMonedas
{
    public static void main(String[] args)
    {
        int monedas[] = new int[]{25, 10, 5, 1};
        int minimoMonedas = 0;
        float cambio =0;

        System.out.println("Hola!  Cuanto cambio te debo?");

        do
            {
                cambio = Input.get_float();
            } while (cambio < 0);
        cambio = Math.round(cambio*100);

        for (int i = 0; i<monedas.length; i++)
        {
            if ((int)cambio / monedas[i] > 0)
            {
                System.out.println((int)cambio / monedas[i] + " monedas de " + monedas[i] + "c");
                minimoMonedas += (int) cambio / monedas[i];
                cambio%=monedas[i];
            }
        }
        if (minimoMonedas > 0) System.out.println("El minimo de monedas son: " + minimoMonedas);
        else System.out.println("No me ajusta en monedas, lo vas a tener que redondear");
    }
}
