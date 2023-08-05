public class Punto15 {
    private Integer num1;


    public Punto15(Integer num1) {
        this.num1 = num1;

    }

    public String isCapicua() {
        String num = Integer.toString(this.num1);
        int longitud = num.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (num.charAt(i) != num.charAt(longitud - 1 - i)) {
                return "No es Capicua";
            }
        }

        return "Si es Capicua";


    }

}
