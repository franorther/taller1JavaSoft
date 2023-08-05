import java.util.HashMap;
import java.util.Map;

public class Punto33 {
    private String chain1;


    public Punto33(String chain1) {
        this.chain1 = chain1;
    }

    public String countOften() {
        String[] numerosStr = this.chain1.split(" ");
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        // Contar la frecuencia de cada elemento en el arreglo usando un HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numeros) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Mostrar los resultados
        StringBuilder resultBuilder = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int num = entry.getKey();
            int frequency = entry.getValue();
            resultBuilder.append("El número ").append(num).append(" aparece ").append(frequency).append(" veces.\n");
        }

        return resultBuilder.toString();
    }

}
