public class Punto19 {
    private String nombreUsuario;

    public Punto19(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String mayusculasMinusculas(){
        String nombre = this.nombreUsuario;

        // En Mayúsculas
        //System.out.println("Tu nombre en Mayúsculas-->"+nombre.toUpperCase());
        // En minúsculas...
        //System.out.println("Tu nombre en Minúsculas-->"+nombre.toLowerCase());

        return "Tu nombre en Mayúsculas: "+nombre.toUpperCase()+"; y en minúsculas: "+nombre.toLowerCase();
    }

}