package Musica;

//Subclase.
//El constructor es igual pero el metodo cambia :D
public class Campana extends Instrumento {
    public Campana() {
        super(); // Llama al constructor de la clase base Instrumento. El enunciado nos dice que no varia en nada
    }

    // Redefine el método interpretar, es el que cambia
    @Override
    void interpretar() {
       // System.out.println("¡Ding doooooooooooong!");
        // Sería una forma facíl de redefinir este método. Como no nos pone para que lo quiere usar...
        //Vamos a usar el ejemplo del 8.5
        for (Nota nota: melodia){
            switch (nota){

                case DO:
                System.out.println("DO");
                break;

                case RE:
                    System.out.println("RE");
                    break;

                case MI:
                    System.out.println("MI");
                    break;

                case FA:
                    System.out.println("FA");
                    break;

                case SOL:
                    System.out.println("SOL");
                    break;

                case LA:
                    System.out.println("LA");
                    break;

                case SI:
                    System.out.println("SI");
                    break;
            }
            System.out.println("");
        }
    }
}