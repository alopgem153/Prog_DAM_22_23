package contenedores.academicosLengua;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import javax.lang.model.util.ElementScanner6;

public class Ejercicio6 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //En hashMap guarda los usuarios y las contraseñas de acceso.
        //Tiene 3 intentos para acceder o se cierra el programa

        HashMap<String, String> usuario = new HashMap<>();
        usuario.put("root", "1234");

        int intentos = 3;
        boolean correcto = false;
        boolean salir = false;
        do
        {
            System.out.println("Inserte el usuario del sistema...");
            String user = sc.nextLine();
            System.out.println("Inserte la clave...");
            String password = sc.nextLine();

            correcto = usuario.containsKey(user) && usuario.get(user).equals(password);

            if (correcto)
            {
                salir = true;
            }
            else 
            {
                
                intentos--;
                System.out.println("Usurio/Contraseña incorrecta, te quedan "+ intentos + " intentos");
                if (intentos== 0)
                {
                    salir = true;
                }
            }
        

        } while(!salir);

        if (correcto)
        {
            System.out.println("ESTAS DENTRO");

        }
        else 
        {
            System.out.println("ADIOS, NO LO HAS CONSEGUIDO");
        }
    }
    
}
