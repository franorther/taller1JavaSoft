import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la resolución del taller1\n " +
                "por favor indique de cual inciso quiere ver la respuesta\n" +
                "las opciones son desde el 1 hasta el 35");

        boolean n = true;

        while(n == true){
            int point= input.nextInt();
            switch (point){
                //punto1
                case 1:
                    String punto1  = new Options().option1();
                    System.out.println(punto1);
                    break;
                //punto2
                case 2:
                    String punto2  = new Options().option2();
                    System.out.println(punto2);
                    break;
                //punto3
                case 3:
                    String punto3  = new Options().option3();
                    System.out.println(punto3);
                    break;
                //punto4
                case 4:
                    String punto4  = new Options().option4();
                    System.out.println(punto4);
                    break;
                //punto5
                case 5:
                    String punto5  = new Options().option5();
                    System.out.println(punto5);
                    break;
                //punto6
                case 6:
                    String punto6  = new Options().option6();
                    System.out.println(punto6);
                    break;
                //punto7
                case 7:
                    String punto7  = new Options().option7();
                    System.out.println(punto7);
                    break;
                //punto8
                case 8:
                    String punto8  = new Options().option8();
                    System.out.println(punto8);
                    break;
                //punto9
                case 9:
                    String punto9  = new Options().option9();
                    System.out.println(punto9);
                    break;
                //punto10
                case 10:
                    String punto10  = new Options().option10();
                    System.out.println(punto10);
                    break;
                //punto11
                case 11:
                    String punto11  = new Options().option11();
                    System.out.println(punto11);
                    break;
                //punto12
                case 12:
                    String punto12  = new Options().option12();
                    System.out.println(punto12);
                    break;
                //punto13
                case 13:
                    String punto13  = new Options().option13();
                    System.out.println(punto13);
                    break;
                //punto14
                case 14:
                    String punto14  = new Options().option14();
                    System.out.println(punto14);
                    break;
                //punto15
                case 15:
                    String punto15  = new Options().option15();
                    System.out.println(punto15);
                    break;

                //punto16
                case 16:
                    String punto16  = new Options().option16();
                    System.out.println(punto16);
                    break;
                //punto17
                case 17:
                    String punto17  = new Options().option17();
                    System.out.println(punto17);
                    break;
                //punto18
                case 18:
                    String punto18  = new Options().option18();
                    System.out.println(punto18);
                    break;
                //punto19
                case 19:
                    String punto19  = new Options().option19();
                    System.out.println(punto19);
                    break;
                //punto20
                case 20:
                    String punto20  = new Options().option20();
                    System.out.println(punto20);
                    break;
                //punto21
                case 21:
                    String punto21  = new Options().option21();
                    System.out.println(punto21);
                    break;
                //punto22
                case 22:
                    String punto22  = new Options().option22();
                    System.out.println(punto22);
                    break;
                //punto23
                case 23:
                    int punto23  = new Options().option23();
                    System.out.println(punto23);
                    break;
                //punto24
                case 24:
                    String punto24  = new Options().option24();
                    System.out.println(punto24);
                    break;
                //punto25
                case 25:
                    String punto25  = new Options().option25();
                    System.out.println(punto25);
                    break;
                //punto26
                case 26:
                    String punto26  = new Options().option26();
                    System.out.println(punto26);
                    break;
                //punto27
                case 27:
                    String punto27  = new Options().option27();
                    System.out.println(punto27);
                    break;
                //punto28
                case 28:
                    String punto28  = new Options().option28();
                    System.out.println(punto28);
                    break;
                //punto29
                case 29:
                    String punto29  = new Options().option29();
                    System.out.println(punto29);
                    break;
                //punto30
                case 30:
                    String punto30  = new Options().option30();
                    System.out.println(punto30);
                    break;
                //punto31
                case 31:
                    String punto31  = new Options().option31();
                    System.out.println(punto31);
                    break;
                //punto32
                case 32:
                    String punto32  = new Options().option32();
                    System.out.println(punto32);
                    break;
                //punto33
                case 33:
                    String punto33  = new Options().option33();
                    System.out.println(punto33);
                    break;
                //punto34
                case 34:
                    String punto34  = new Options().option34();
                    //system.out.println(punto34);
                    break;
                //punto35
                case 35:
                    String punto35  = new Options().option35();
                    System.out.println(punto35);
                    break;
                //SALIR
                case 0:
                    n = false;
                    break;


            }
            if(n == true){
                System.out.println("Quiere seguir viendo más respuestas ? por favor indique de cual inciso quiere ver la respuesta\n" +
                        "las opciones son desde el 1 hasta el 35\n" +
                        "Si quiere salir del programa ingrese 0");
            }else{
                System.out.println("Graciasss");
            }

        }


    }
}