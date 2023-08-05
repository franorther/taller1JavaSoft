public class Punto1 {
    private Integer num1;
    private Integer num2;

    public Punto1(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Integer suma() {
        return this.num1 + this.num2;
    }

    public Integer resta() {
        return num1 - num2;
    }

    public Integer multiplicacion() {
        return num1 * num2;
    }

    public Double division() {
        return (double) num1 / num2;
    }
}
