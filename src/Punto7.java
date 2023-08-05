import java.lang.reflect.Array;

public class Punto7 {
    private Integer num1;

    public Punto7(Integer num1) {
        this.num1 = num1;
    }

    public String  showMultiTable() {
        String tableM =
                "1 x " + this.num1 + " = " + 1 * this.num1 +"\n" +
                "2 x " + this.num1 + " = " + 2 * this.num1 +"\n" +
                "3 x " + this.num1 + " = " + 3 * this.num1 +"\n" +
                "4 x " + this.num1 + " = " + 4 * this.num1 +"\n" +
                "5 x " + this.num1 + " = " + 5 * this.num1 +"\n" +
                "6 x " + this.num1 + " = " + 6 * this.num1 +"\n" +
                "7 x " + this.num1 + " = " + 7 * this.num1 +"\n" +
                "8 x " + this.num1 + " = " + 8 * this.num1 +"\n" +
                "9 x " + this.num1 + " = " + 9 * this.num1 +"\n" +
                "10 x " + this.num1 + " = " + 10 * this.num1;
        return tableM;
    }

}
