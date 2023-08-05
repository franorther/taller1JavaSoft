import java.util.ArrayList;
import java.util.StringJoiner;

public class Punto25 {
    private String chain1;


    public Punto25(String chain1) {
        this.chain1 = chain1;

    }

    public String wordByWord(){
        ArrayList<String> bucket = new ArrayList<>();
        String[] palabras =  this.chain1.split(" ");
        for (String palabra : palabras) {
            bucket.add(palabra);
        }
        StringJoiner joiner = new StringJoiner("\n");
        for (String palabraActual : bucket) {
            joiner.add(palabraActual);

        }
        return joiner.toString();
    }

}
