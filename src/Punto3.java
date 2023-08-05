public class Punto3 {
    private Integer radious;

    public Punto3(Integer radious) {
        this.radious = radious;
    }

    public Double perimeter() {
        return 2 * Math.PI * this.radious;
    }
    public Double area() {
        return Math.PI * Math.pow(this.radious, 2) ;
    }

}
