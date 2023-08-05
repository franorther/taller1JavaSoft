import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Punto30 {
    private String chain1;


    public Punto30(String chain1) {
        this.chain1 = chain1;
    }

    public String removeDuplicated() {
        String[] numerosStr = this.chain1.split(" ");
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        // Utilizar un Set para almacenar los elementos únicos
        Set<Integer> set = new HashSet<>();
        for (int num : numeros) {
            set.add(num);
        }


        int[] arregloSinDuplicados = new int[set.size()];
        int index = 0;
        for (int num : set) {
            arregloSinDuplicados[index] = num;
            index++;
        }


        String resultado = Arrays.toString(arregloSinDuplicados);

        return "Arreglo sin duplicados: " + resultado;
    }

}
