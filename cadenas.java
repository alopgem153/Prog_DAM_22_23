public class cadenas {

    public static void main(String[] args)
    {
        char caracter1 = 'A';

        char caracter2 = 'Z';

        System.out.println(caracter1);
        System.out.println(caracter2);

        System.out.println("esto es una cadena");
        String cadena = "Esto es otra cadena";

        System.out.println(cadena);

        String cadenaFinal = " - Esto es el final";

        System.out.println(cadena + cadenaFinal);

        String cadenaTotal = cadena + cadenaFinal;
        System.out.println(cadenaTotal);

        System.out.println(caracter1 + caracter2);

        System.out.println(caracter1 + "" + caracter2);


        float temperatura = 33.45f;

        System.out.println("La temperatura es: " +  temperatura + " Grados centígrados");

        
    }

}