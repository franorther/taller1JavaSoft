public class Punto4 {
    private Integer age;

    public Punto4(Integer age) {
        this.age = age;
    }

    public String  isOlder() {
        if(this.age >= 18)  return "mayor de edad";
        return  "menor de edad";
    }

}
