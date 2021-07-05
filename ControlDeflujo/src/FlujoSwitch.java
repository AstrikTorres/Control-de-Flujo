import java.util.Scanner;
public class FlujoSwitch {

    public static void main(String[] args) {

        /* Switch
        / switch(condicion) {
        * case valor:
        *   codigo
        *   codigo
        *   codigo
        *   break;
        * case valor2:
        *   codigo
        *   codigo
        *   codigo
        *   break;
        * default:
        *   codigo por defecto
        * }
        */

        /*
        int dia = 5;
        String mensaje = "";

        switch (dia) {
            // Se puede usar cualquier tipo de numero
            case 1:
                mensaje = "Lunes";
                break;
            case 2:
                mensaje = "Martes";
                break;
            case 3:
                mensaje = "Miercoles";
                break;
            case 4:
                mensaje = "Jueves";
                break;
            case 5:
                mensaje = "Viernes";
                break;
            case 6:
                mensaje = "Sabado";
                break;
            case 7:
                mensaje = "Domingo";
                break;
            default:
                mensaje = "Dia invalido";
                break;
        }

        System.out.println(mensaje);


            Crear una calculadora que pueda sumar, restar, multiplicar y dividir 2 números
            La calculadora debe pedir dos números y posterior a eso preguntar que
            operacion se quiere realizar, el menu es el siguiente;
            1. Suma
            2. Resta
            3. Multiplicación
            4. División
            Al final debe mostrar los resultados de la operacion
         */

        System.out.println("Ingresa el primer numero");
        Scanner leerA = new Scanner(System.in);
        float a = leerA.nextFloat();
        System.out.println("Ingresa el segundo numero");
        Scanner leerB = new Scanner(System.in);
        float b = leerB.nextFloat();
        System.out.println("Selecciona tu operacion con el numero correspondiente: " +
                "(1)Suma (2)Resta (3)Multiplicacion (4)Division");
        float resultado = 0;
        String stringResultado;
        Scanner leerOperacion = new Scanner(System.in);
        byte operacion = leerOperacion.nextByte();


        switch (operacion) {
            // Se puede usar cualquier tipo de numero
            case 1:
                stringResultado = "El resultado de tu suma es: ";
                resultado = a + b;
            break;
            case 2:
                stringResultado = "El resultado de tu resta es: ";
                resultado = a - b;
            break;
            case 3:
                stringResultado = "El resultado de tu multiplicacion es: ";
                resultado = a * b;
            break;
            case 4:
                stringResultado = "El resultado de tu division es: ";
                resultado = a / b;
            break;
            default:
                stringResultado = "Error 404";
            break;
        }

        System.out.println(stringResultado + resultado);


    }

}
