package ArraysT5;

public class EjerciciosArrays {

    public static void main(String[] args) {
                
                int[] array = new int[0];
        
                UtilesArrayAlfonso.rellenar(array, 10);
        
                UtilesArrayAlfonso.imprimir(array);
        
                array =UtilesArrayAlfonso.limpiar();
        
                array =UtilesArrayAlfonso.insertarAlPrincipio(array, 10);
        
                array =UtilesArrayAlfonso.insertarAlPrincipio(array, 20);
        
                array =UtilesArrayAlfonso.insertarAlPrincipio(array, 30);
        
                array =UtilesArrayAlfonso.insertarAlPrincipio(array, 40);
        
                array =UtilesArrayAlfonso.insertarAlFinal(array, 5);
        
                boolean ordenado = UtilesArrayAlfonso.estaOrdenado(array);
        
                System.out.println("Esta ordenado: " + ordenado);
        
                UtilesArrayAlfonso.imprimir(array);
        
                array =UtilesArrayAlfonso.eliminarPrimero(array);
        
                array =UtilesArrayAlfonso.eliminar(array, 40);
        
                array =UtilesArrayAlfonso.ordenar(array);
        
                array =UtilesArrayAlfonso.insertarOrdenado(array, 15);
        
                UtilesArrayAlfonso.imprimir(array);
                
                int posicion30 =UtilesArrayAlfonso.buscar(array, 30);
        
                System.out.println("El elemento 30 está en la posicion: " + posicion30);
        
                int posicion99 =UtilesArrayAlfonso.buscar(array, 99);
        
                System.out.println("El elemento 99 está en la posicion: " + posicion99);
        
                array =UtilesArrayAlfonso.partirPor(array, 1,3);
        
                UtilesArrayAlfonso.imprimir(array);


    }
    
}
