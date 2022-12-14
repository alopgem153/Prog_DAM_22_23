package ArraysT5;

public class EjemploArrays {

    public static void main(String[] args) {
        
        //declarar edades : array de 5 elementos
        int[] edades = new int[5];

        //declarar nombres = array de stringsd de 5 elementos
        String[] nombres = new String[5];

        System.out.println("EDADES: La posicion 2 tiene el valor: "+  edades[2]);
        System.out.println("NOMBRES: La posicion 2 tiene el valor: "+  nombres[2]);


        //formas de inicializar valores de arrays
        int[] edades2 = {1, 14, 56, 89, 18};
        System.out.println("EDADES2: La posicion 2 tiene el valor: "+  edades2[2]);

        //Dar un valor en concreto a una posicion en concreto
        edades[0] = 19;
        System.out.println("EDADES: La posicion 2 tiene el valor: "+  edades[0]);

        //Poner a todas las posiciones del array edades el valor 18
        for(int aux = 0; aux < edades.length; aux++)
        {
            edades[aux] = 18;
        }
        System.out.println("EDADES: La posicion 2 tiene el valor: "+  edades[2]); 
        
        System.out.println(edades);


        int[] e;
        int[] d;
        e = new int[5];
        for(int aux = 0; aux < e.length; aux++)
        {
            e[aux] = 7;
        }
        d = e;

        System.out.println("Array d , en la posicion 4: " + d[4]);
        d[4] = 10;
        System.out.println("Array e , en la posicion 4: " + e[4]);
        System.out.println("Array d , en la posicion 4: " + d[4]);

        
        for(int aux = 0; aux < e.length; aux++)
        {
            System.out.println("Pos " + aux + "= " + e[aux] );
        }
    }
    
}
