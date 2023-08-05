import java.util.Random;

public class Punto8 {
    private Integer num1;

    public Punto8(Integer num1) {
        this.num1 = num1;
    }

    public String  guessNum() {
        int randomNumber = new Random().nextInt(100) +1;
        if(randomNumber > this.num1) return "El número ingresado es menor";
        if(randomNumber < this.num1) return "El número ingresado es mayor";
        return "Has adivinado el número, felicidades";
    }

}
