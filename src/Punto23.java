public class Punto23 {
    private String oracion;

    public Punto23(String oracion) {
        this.oracion = oracion;
    }
    public int contarPalabras() {
        String s = this.oracion;
        int contador = 1, pos;
        s = s.trim();
        if (s.isEmpty()) {
            contador = 0;
        } else {
            pos = s.indexOf(" ");
            while (pos != -1) {
                contador++;
                pos = s.indexOf(" ", pos + 1);
            }
        }
        System.out.println("Número de palabras en tu oración: ");
        return contador;
    }

}