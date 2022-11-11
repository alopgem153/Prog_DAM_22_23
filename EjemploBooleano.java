public class EjemploBooleano {
    
    public static void main(String[] args) {
        
        boolean operador1 = true;

        boolean operador2 = false;

        // operado1 && operador2

        boolean resultado = operador1 && operador2;

        System.out.println("El resultado de " + operador1 + " AND " + operador2 + "= " + resultado );

        // operador1 || (operador1 && operador2)

        resultado = operador1 ||  (operador1 && operador2);

        System.out.println("El resultado de: operador1 || (operador1 && operador2 = " + resultado );
        
        System.out.println("DESDE HITHUB" );
                           
        System.out.println("OTRA LINEA" );
        


    }
}
