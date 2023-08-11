import java.util.Scanner;

/*
    11/08/23 - LAB 2
* Deberás crear un proyecto en Java que resuelva el siguiente problema:
* Dado un conjunto de tres números ingresados por el usuario a través de
* la consola, el programa debe ordenarlos de mayor a menor y mostrar el
* resultado por pantalla.
* */

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        int a,b,c;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        a=Entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        b=Entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        c=Entrada.nextInt();

        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
                if(b>a && a>c)
                    System.out.println(b+", "+a+", "+c);
                else{
                    if(b>c && c>a)
                        System.out.println(b+", "+c+", "+a);
                    else{
                        if(c>a && a>b)
                            System.out.println(c+", "+a+", "+b);
                        else{
                            if(c>b && b>a)
                                System.out.println(c+", "+b+", "+a);
                        }
                    }
                }
            }
        }
    }

}
