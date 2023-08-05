public class Punto29 {
    private String chain1;


    public Punto29(String chain1) {
        this.chain1 = chain1;
    }

    public String isBiggest(){
        String[] numerosStr = this.chain1.split(" ");
        int max = 0;
        // Convertir los strings del array a enteros
        int[] numeros = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return "El numero mayor es "+ max;
    }

}
