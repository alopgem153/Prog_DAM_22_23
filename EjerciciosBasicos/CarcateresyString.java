public class CarcateresyString {
    public static void main(String[] args) {
        
        System.out.println("-----------Ej-18-----------------------------");
        //Ejercicio 18
        char vocal = 'e';

        String cadenaDeCaracteres = "Esto es una cadena larga";

        System.out.println(vocal + " " + cadenaDeCaracteres);

        System.out.println("---------------------------------------------");
        System.out.println("-----------Ej-19-----------------------------");

        //Ejercicio 19
        char caracter1 = 'r';
        char caracter2 = 'a';
        char caracter3 = 'm';
        char caracter4 = 'o';
        char caracter5 = 'n';

        //Error - intenta sumar codigos ASCII
        //String cadena = caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
        

        //Error - nmo permite el casting
        //String cadena = (string)caracter1 + (string)caracter2 + (string)caracter3 + (string)caracter4 + (String)caracter5;

        String cadena = caracter1 + "" + caracter2 + caracter3 + caracter4 + caracter5;

        System.out.println(cadena);

    }
}
