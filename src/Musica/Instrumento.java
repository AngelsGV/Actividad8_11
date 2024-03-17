package Musica;//Ejercicio 8.4 copiaod talcual.
//Supeerclase
import Musica.Nota;

import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public abstract class Instrumento {
protected Nota[] melodia;
public Instrumento(){
    melodia = new Nota[0];
}
void add(Nota n){
    melodia= Arrays.copyOf(melodia,melodia.length+1);
    melodia[melodia.length-1] = n;
}
abstract void interpretar();//al ser clase abstracta solo se crea para heredar
}

