import java.util.Arrays;
import java.util.Scanner;

public class Options {

    Scanner input = new Scanner(System.in);
    Scanner miScanner = new Scanner(System.in).useDelimiter("\n");

    public String option1() {
        System.out.println("1. Realiza un programa que solicite al usuario dos números " + "\n" +
                "enteros y muestre su suma, resta, multiplicación y división. " + "\n" +
                "Ingresa el primer número...");
        int num1 = input.nextInt();
        System.out.println("Ingresa el segundo número...");
        int num2 = input.nextInt();
        Punto1 res = new Punto1(num1, num2);
        return "El resultado de la suma es " + res.suma() + "\n" +
                "El resultado de la resta es " + res.resta() + "\n" +
                "El resultado de la resta es " + res.multiplicacion() + "\n" +
                "El resultado de la resta es " + res.division();
    }

    public String option2() {
        System.out.println("2. Escribe un programa que pida al usuario un número entero y determine si es par o impar.\n" +
                "Ingrese un número..");
        int num = input.nextInt();
        Punto2 resIsPar = new Punto2(num);
        return "El número ingresado " + resIsPar.isPar();

    }

    public String option3() {
        System.out.println("3. Escribe un programa que pida al usuario un número entero" + "\n" +
                "El usuario debe proporcionar el radio del círculo.\n" +
                "Ingrese el radio...");
        int num = input.nextInt();
        Punto3 result = new Punto3(num);
        return "El circulo con radio " + num + " tiene un perimetro de " + result.perimeter() + "\n" +
                "y su area es " + result.area();

    }

    public String option4() {
        System.out.println("4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad." + "\n" +
                "Ingrese la edad...");
        int num = input.nextInt();
        Punto4 result = new Punto4(num);
        return "el usuario con la edad " + num + " es " + result.isOlder();

    }

    public String option5() {
        System.out.println("5. Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos." + "\n" +
                "Ingrese el primer número..");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo número...");
        int num2 = input.nextInt();
        Punto5 result = new Punto5(num1, num2);
        return result.isBig();

    }

    public String option6() {
        System.out.println("6. Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero." + "\n" +
                "Ingrese el número..");
        int num1 = input.nextInt();
        Punto6 result = new Punto6(num1);
        return result.isPositive();

    }

    public String option7() {
        System.out.println("7. Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10." + "\n" +
                "Ingrese el número..");
        int num1 = input.nextInt();
        Punto7 result = new Punto7(num1);
        return result.showMultiTable();

    }

    public String option8() {
        System.out.println("8. Realiza un programa que simule un juego de adivinar un número. El programa debe generar un número aleatorio entre 1 y 100,\n" +
                " y el usuario debe adivinarlo. El programa debe indicar si el número ingresado es mayor o menor que el número a adivina" + "\n" +
                "Ingrese el número..");
        int num1 = input.nextInt();
        Punto8 result = new Punto8(num1);
        return result.guessNum();

    }

    public String option9() {
        System.out.println("9. Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.\n" +
                "Ingrese el número..");
        int num1 = input.nextInt();
        Punto9 result = new Punto9();
        return "El factorial de " + num1 + " es " + result.factorialNum(num1);

    }

    public String option10() {
        System.out.println("10. Crea un programa que muestre los primeros 20 números de la serie Fibonacci. \n" +
                "La serie Fibonacci se forma sumando los dos números anteriores para obtener\n" +
                " el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …");

        Punto10 result = new Punto10();
        return "primeros 20 números de la secuencia Fibonacci\n" +
                "  " + String.join(", ", result.fibonacci());

    }

    public String option11() {
        System.out.println("11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón.\n" +
                "El usuario debe ingresar las longitudes de los tres lados." + "\n" +
                "Ingrese el primer lado..");
        int num1 = input.nextInt();
        System.out.println("Ingrese el segundo lado..");
        int num2 = input.nextInt();
        System.out.println("Ingrese el tercer lado..");
        int num3 = input.nextInt();
        Punto11 result = new Punto11(num1, num2, num3);
        return result.heron() + " centimetros cuadrados";

    }

    public String option12() {
        System.out.println("12. Realiza un programa que pida al usuario un número entero y determine si es un número primo o no.\n" +
                "Ingrese un número..");
        int num1 = input.nextInt();
        Punto12 result = new Punto12(num1);
        return result.isPrime();

    }

    public String option13() {
        System.out.println("13. Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales \n" +
                "Ingrese un número..");
        double num1 = input.nextDouble();
        Punto13 result = new Punto13(num1);
        return result.decimalConverted();

    }

    public String option14() {
        System.out.println("14. Escribe un programa que solicite al usuario un número entero positivo y verifique si es un número perfecto.\n" +
                " Un número perfecto es aquel cuya suma de sus divisores propios (excluyendo al propio número) es igual al número.\n" +
                "Ingrese un número entero positivo..");
        int num1 = input.nextInt();
        Punto14 result = new Punto14(num1);
        return result.isPerfect();

    }

    public String option15() {
        System.out.println("15. Crea un programa que pida al usuario un número entero y determine si es un número capicúa. \n" +
                "Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda..\n" +
                "Ingrese un número entero positivo..");
        int num1 = input.nextInt();
        Punto15 result = new Punto15(num1);
        return result.isCapicua();

    }

    public String option16() {
        System.out.println("16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. \n" +
                "Ingrese un número entero..");
        int num1 = input.nextInt();
        Punto16 result = new Punto16(num1);
        return String.join(", ",result.isFibonacci());

    }
    public String option17() {
        System.out.println("17. Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango. \n" +
                "Ingrese primer numero..");
        int num1 = input.nextInt();
        System.out.println("Ingrese segundo numero..");
        int num2 = input.nextInt();
        Punto17 result = new Punto17(num1, num2);
        return String.join(", ",result.showPrimeNumbers());

    }
    public String option18() {
        System.out.println("18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, letras minúsculas y dígitos.\n" +
                " Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.");
        Punto18 result = new Punto18();
        return "Password" + result.generatePassword();

    }
    public String option19() {
        System.out.println("19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en mayúsculas y minúsculas ");
        System.out.println("Ingresa tu nombre");
        String nombre = input.next();
        Punto19 result = new Punto19(nombre);
        return result.mayusculasMinusculas();

    }
    public String option20() {
        System.out.println("20. Realiza un programa que solicite al usuario una cadena y luego invierta su orden \n" +
                "Ingrese la cadena..");
        String chain = input.next();
        Punto20 result = new Punto20(chain);
        return "chain reversed "+result.reverserChain();

    }
    public String option21() {
        System.out.println("21. Pide al usuario una cadena y muestra cuántas veces aparece una letra específica en ella  \n" +
                "Ingrese la cadena..");
        String chain1 = input.next();
        System.out.println("Ingrese la letra.");
        String chain2 = input.next();
        Punto21 result = new Punto21(chain1, chain2);
        return "Cantidad de letra "+chain2+" es "+result.showCantity();

    }
    public String option22() {
        System.out.println("22. Escribe un programa que solicite al usuario una frase \n" +
                " y verifique si es un palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)   \n" +
                "Ingrese la palabra..");
        String chain = input.next();
        Punto22 result = new Punto22(chain);
        return "La palabra "+result.isPalindrome();

    }
    public int option23() {
        System.out.println("23. Crea un programa que pida al usuario una oración y muestre cuántas palabras contiene ");
        System.out.println("Ingresa tu oración");
        String oracion = miScanner.next();
        Punto23 result = new Punto23(oracion);
        return result.contarPalabras();

    }
    public String option24() {
        System.out.println("24.Realiza un programa que solicite al usuario una cadena y reemplace todas las apariciones de una letra específica por otra \n" +
                "Ingrese la palabra..");
        String chain1 = input.next();
        System.out.println("Ingrese la letra que quiere reemplazar.");
        char chain2 = input.next().charAt(0);
        System.out.println("Por cual letra se va a reemplazar?");
        char chain3 = input.next().charAt(0);
        Punto24 result = new Punto24(chain1,chain2,chain3 );
        return "La palabra cambia a "+result.charReplaced();

    }
    public String option25() {
        System.out.println("25.Pide al usuario una frase y muestra cada palabra por separado  \n" +
                "Ingrese la palabra..");
        String chain1 = input.nextLine();
        Punto25 result = new Punto25(chain1);
        return result.wordByWord();

    }
    public String option26() {
        System.out.println("26. Escribe un programa que pida al usuario una cadena y muestre cuántos caracteres tiene sin contar los espacios en blanco  \n" +
                "Ingrese la palabra..");
        String chain1 = input.nextLine();
        Punto26 result = new Punto26(chain1);
        return result.showNoSpace();

    }
    public String option27() {
        System.out.println("27. Crea un programa que solicite al usuario una frase y luego muestre las palabras ordenadas alfabéticamente  \n" +
                "Ingrese la palabra..");
        String chain1 = input.nextLine();
        Punto27 result = new Punto27(chain1);
        return result.sortWords();

    }
    public String option28() {
        System.out.println("28. Suma de elementos: Escribe un programa que calcule la suma de todos los elementos en un arreglo de enteros  \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num = input.nextLine();
        Punto28 result = new Punto28(num);
        return result.sumElements();

    }
    public String option29() {
        System.out.println("29. Encontrar el número más grande: Crea un programa que encuentre el número más grande en un arreglo de enteros  \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num = input.nextLine();
        Punto29 result = new Punto29(num);
        return result.isBiggest();

    }
    public String option30() {
        System.out.println("30. Eliminar duplicados: Diseña un programa que elimine los elementos duplicados de un arreglo.  \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num = input.nextLine();
        Punto30 result = new Punto30(num);
        return result.removeDuplicated();

    }
    public String option31() {
        System.out.println("31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo, el algoritmo de burbuja o el de selección) \n" +
                "para ordenar un arreglo de enteros de manera ascendente. \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num = input.nextLine();
        Punto31 result = new Punto31(num);
        return result.sortAsc();

    }
    public String option32() {
        System.out.println("32. Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y muestre su índice (o un mensaje si no se encuentra). \n" +
                "para ordenar un arreglo de enteros de manera ascendente. \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num1 = input.nextLine();
        System.out.println("Ingrese el número a buscar");
        int num2 = input.nextInt();
        Punto32 result = new Punto32(num1, num2);
        return result.searchNum();

    }
    public String option33() {
        System.out.println("33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de cada elemento en un arreglo. \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num1 = input.nextLine();

        Punto33 result = new Punto33(num1);
        return result.countOften();

    }
    public String option34() {
        System.out.println("34. Rotación de elementos: Implementa un programa que rote los elementos de un arreglo hacia la izquierda \n" +
                "o la derecha una cierta cantidad de posiciones. \n" +
                "Ingrese el arreglo (ejemplo: 2 7 9 2)..");
        String num1 = input.nextLine();
        Punto34 result = new Punto34(num1);
        System.out.println("Ingrese la posición a la izquierda");
        int leftPos  = input.nextInt();
        result.rotateLeft(leftPos );
        System.out.println("Arreglo después de rotar hacia la izquierda: " +result.getResult());
        System.out.println("Ingrese la posición a la derecha");
        int rigthPos  = input.nextInt();
        result.rotateRight(rigthPos);
        System.out.println("Arreglo después de rotar hacia la derecha: " +result.getResult());
        return "";
    }
    public String option35() {
        System.out.println("35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar del 1 al  10. Usa para esto una matriz");
         Punto35 result = new Punto35();
        result.generateMultiplicationTable();
        result.printMultiplicationTable();
        return "";

    }
}
