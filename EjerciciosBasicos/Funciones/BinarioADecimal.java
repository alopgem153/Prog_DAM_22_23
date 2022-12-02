package Funciones;

public class BinarioADecimal {

    public static void main(String[] args) {
        /*
         * programa que pase de binario a decimal.
         */

         int numero = 16; //5423; //debe dar 10101001011111


         long resultado = 0;

        //  if (numero == 0)
        //  {
        //     resultado = 0;
        //  }
        //  else
        //  {
            
            while (numero > 0)
            {
                resultado = MathAlfonso.pegaPorDetras(resultado, numero % 2);
                numero = numero / 2;
            }

            
        //  }

         resultado = MathAlfonso.voltea(resultado);
         System.out.println("Binario: " + resultado);
    }
    
}
