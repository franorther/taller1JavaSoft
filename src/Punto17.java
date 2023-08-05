public class Punto17 {
    private Integer num1;
    private Integer num2;


    public Punto17(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String showPrimeNumbers() {
        StringBuilder result = new StringBuilder();
        for (int i = this.num1; i <= this.num2; i++) {
            if (esPrimo(i)) {
                result.append(i).append(" ");
            }
        }
        if (result.length() == 0) {
            return "No hay números primos en el rango";
        } else {
            return result.toString();
        }

    }

    public Boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

}
