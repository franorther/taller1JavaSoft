import java.util.Arrays;

public class Punto32 {
    private String chain1;
    private Integer num;


    public Punto32(String chain1, int num) {
        this.num = num;
        this.chain1 = chain1;
    }

    public String searchNum() {
        String[] numerosStr = this.chain1.split(" ");
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }

        // Buscar el número en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                return "El número " + num + " está en el indice " + i;
            }
        }

        return "El número " + num + " no se encuentra en el arreglo.";
    }

}
