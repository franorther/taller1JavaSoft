import java.util.ArrayList;
import java.util.StringJoiner;

public class Punto26 {
    private String chain1;


    public Punto26(String chain1) {
        this.chain1 = chain1;
    }

    public String showNoSpace(){
        int contador = 0;
        for (char caracter : this.chain1.toCharArray()) {
            if (caracter != ' ') {
                contador++;
            }
        }
        return "La cadena tiene "+contador+ " caracteres";

    }

}
