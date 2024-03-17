public class Campana extends Instrumento {
    public Campana() {
        super(); // Llama al constructor de la clase base Instrumento
    }

    // Redefine el método interpretar
    @Override
    void interpretar() {
        System.out.println("¡Ding ding! Suena la campana.");
    }
}