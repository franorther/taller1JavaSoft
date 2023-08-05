import java.util.Arrays;

public class Punto28 {
    private String chain1;


    public Punto28(String chain1) {
        this.chain1 = chain1;
    }

    public String sumElements(){
        String[] numerosStr = this.chain1.split(" ");
        int suma = 0;
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }
        for(int elemento:  numeros){
            suma+= elemento;
        }
        return "La suma es "+ suma;
    }

}
