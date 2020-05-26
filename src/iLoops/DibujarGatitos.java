package iLoops;

    import libs.Input;

    public class DibujarGatitos
    {
        public static void main(String[] args)
        {
            dibujarPiramide(10);
        }

        private static void dibujarPiramide(int altura)
        {
            for(int numRenglon =1, numEspacios=altura-1; numRenglon <= altura; numRenglon++, numEspacios--)
            {
              dibujarLinea(numEspacios, numRenglon+1);
            }
        }

        private static void dibujarLinea(int numEspacios, int numGatitos)
        {
            for(int i = 0; i < numEspacios; i++)
            {
                Input.print(" ");
            }
            for(int i = 0; i < numGatitos; i++)
            {
                Input.print("#");
            }
            System.out.println();
        }
    }