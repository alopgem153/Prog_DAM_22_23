package clasesHerencia;

import clasesHerencia.Instrumento.Notas;

public class UsoInstrumento {

    public static void main(String[] args) {
        
    
        Notas[] cancion = { Notas.DO, Notas.LA, Notas.DO, Notas.LA, Notas.DO, Notas.LA, Notas.SOL };
        
        //Creo el instrumento : Piano
        Piano piano = new Piano();

        //Introduzco las notas de la canción en el piano
        for (Notas notas : cancion) {
            piano.add(notas);
        }   

        //Interpreto con el piano las notas
        piano.interpretar();
    }

}
