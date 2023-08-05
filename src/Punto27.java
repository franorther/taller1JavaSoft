import java.util.Arrays;

public class Punto27 {
    private String chain1;


    public Punto27(String chain1) {
        this.chain1 = chain1;
    }

    public String sortWords(){
        String[] palabras = this.chain1.split(" ");
        Arrays.sort(palabras);
        return String.join(" ",palabras);

    }

}
