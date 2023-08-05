import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Punto31 {
    private String chain1;


    public Punto31(String chain1) {
        this.chain1 = chain1;
    }

    public String sortAsc() {
        String[] numerosStr = this.chain1.split(" ");
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        // Algoritmo de ordenamiento por selección
        for (int i = 0; i < numeros.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = numeros[i];
                numeros[i] = numeros[minIndex];
                numeros[minIndex] = temp;
            }
        }

        // Convertir el arreglo  a un String
        String resultado = Arrays.toString(numeros);

        return "Arreglo ordenado de manera ascendente: " + resultado;
    }

}
