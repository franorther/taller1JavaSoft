public class Punto5 {
    private Integer num1;
    private Integer num2;

    public Punto5(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String  isBig() {
        if(this.num1 > this.num2)  return "el número "+this.num1+" es mayor que el número "+this.num2;
        if(this.num2 > this.num1)  return "el número "+this.num2+"es mayor que el número "+this.num1;
        return "Ambos números son iguales";
    }

}
