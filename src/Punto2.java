public class Punto2 {
    private Integer num1;

    public Punto2(Integer num1) {
        this.num1 = num1;
    }

    public String isPar(){
        if(this.num1 % 2 ==0) return "es par";
        return "es impar";
    }

}
