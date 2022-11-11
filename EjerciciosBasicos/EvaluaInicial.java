import java.util.Scanner;

public class EvaluaInicial {
    public static void main(String[] args) {
        //Declaracion de constantes
        final float SUELDO_BASE = 950f;
        final float INCREMENTO_ANO_ANTIGUEDAD = 150f;
        final float INCREMENTO_HIJO = 10f;
        final float INCREMENTO_FAMILIA_NUMEROSA = 100;
        final float HORA_EXTRA_NORMAL = 21.4f;
        final float HORA_EXTRA_EXTRA = 30f;
        final float DESCUENTO_FORMACION = 0.05f;

        //Lectura de información
        Scanner sc = new Scanner(System.in);
        System.out.println("Años de antiguedad?");
        int antiguedad = sc.nextInt();

        System.out.println("Numero de hijos?");
        int numHijos = sc.nextInt();

        System.out.println("Numero de horas extras??");
        int horasExtras = sc.nextInt();

        sc.close();

        //REALIZAR LOS CALCULOS
        float nominaTotal = SUELDO_BASE;
        //Incremento por antiguedad
        float incrementoAntiguedad = antiguedad * INCREMENTO_ANO_ANTIGUEDAD)
        nominaTotal = nominaTotal + incrementoAntiguedad;

        //Incremento por hijo
        float incrementoPorHijo = numHijos * INCREMENTO_HIJO;
        float incrementoFamiliaNumerosa = (numHijos >= 3) ? INCREMENTO_FAMILIA_NUMEROSA : 0;

        //float incrementoHijos = (numHijos >= 3)? (numHijos * INCREMENTO_HIJO)+ INCREMENTO_FAMILIA_NUMEROSA: numHijos * INCREMENTO_HIJO; 

        nominaTotal = nominaTotal + incrementoPorHijo + incrementoFamiliaNumerosa; 

        //Calculo precio Horas Extras
        float horasExtrasNormales = (horasExtras > 20) ? 
                    (20 * HORA_EXTRA_NORMAL) + (horasExtras - 20) * HORA_EXTRA_EXTRA :
                    (horasExtras * HORA_EXTRA_NORMAL) ;

        nominaTotal = nominaTotal + horasExtrasNormales;

        //Parte de formación
        float formacion = nominaTotal * DESCUENTO_FORMACION;

        nominaTotal = nominaTotal - formacion;

        // Salida por pantalla

    }
}
