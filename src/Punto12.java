public class Punto12 {
    private Integer num1;

    public Punto12(Integer num1) {
        this.num1 = num1;
    }
    public String isPrime(){
        if(this.num1 <= 1) return "No es primo";
        for (int i = 2; i <= Math.sqrt(this.num1); i++){
            if(this.num1 % i == 0) return "No es primo";
        }
        return "Es primo";
    }

}
