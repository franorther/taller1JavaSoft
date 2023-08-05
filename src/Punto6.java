public class Punto6 {
    private Integer num1;

    public Punto6(Integer num1) {
        this.num1 = num1;
    }

    public String  isPositive() {
        if(this.num1 > 0)  return "el número "+this.num1+" es positivo ";
        if(this.num1 < 0)  return "el número "+this.num1+" es negativo ";
        return "el número es cero";
    }

}
