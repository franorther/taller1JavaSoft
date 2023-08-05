public class Punto14 {
    private Integer num1;

    public Punto14(Integer num1) {
        this.num1 = num1;
    }

    public String isPerfect() {
        int num = this.num1;
        if (num <= 0) return "No es un número perfecto";
        int sumaDivisores = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == num) return "El número si es perfecto";

        return "No es un número perfecto";
    }

}
