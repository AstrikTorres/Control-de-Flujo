import java.util.Scanner;
public class FlujoIf {

    public static void main(String[] args) {

        /*
        Crear un programa donde se introduzcan los
        tres ángulos internos de un triángulo
        y se determine si el triángulo es válido o no.
         */

        System.out.println("Bienvenido, aquí puede verificar que los ángulos internos de su triangulo sean validos");
        System.out.println("Ingrese el primer ángulo");
        Scanner leerA = new Scanner(System.in);
        float a = leerA.nextFloat();
        System.out.println("Ingrese el segundo ángulo");
        Scanner leerB = new Scanner(System.in);
        float b = leerB.nextFloat();
        System.out.println("Ingrese el tercer ángulo");
        Scanner leerC = new Scanner(System.in);
        float c = leerC.nextFloat();

        String mensaje = validarTriangulo(a, b, c);
        System.out.println(mensaje);

    }

    public static String validarTriangulo(float a, float b, float c) {
        String mensaje;
        float angulosT = a + b + c;
        if(angulosT == 180 && a < 0 && b < 0 && c < 0) {
            mensaje = "Su triángulo es valido :D";
        } else {
            mensaje = "Eso no es un triángulo D:";
        }
        return mensaje;
    }

}
