import java.util.Random;

public class Punto18 {

    public String generatePassword() {
        String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasenaGenerada = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(allowedCharacters.length());
            char caracterAleatorio = allowedCharacters.charAt(index);
            contrasenaGenerada.append(caracterAleatorio);
        }
        return contrasenaGenerada.toString();
    }

}
