package Musica;

import Musica.Campana;

//Este programa solo lo haremos para probar la clase campana
public class ProgramaPrueba {
    public static void main(String[] args) {
        Nota cancion[] = {Nota.DO, Nota.RE, Nota.MI, Nota.FA, Nota.SOL, Nota.LA, Nota.SI};
        //Se crea el array con las notas que queremos para la cancion
        Campana campana = new Campana(); //Se define variable
        for(Nota nota:cancion){
            campana.add(nota); //se añaden al metodo de la subclase
        }
        campana.interpretar();
    }
}

