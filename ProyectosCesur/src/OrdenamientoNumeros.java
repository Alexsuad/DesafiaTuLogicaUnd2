import java.util.Scanner;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        //  Solicitar tres números al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        //  Solicitar un orden de ordenamiento (1 para ascendente, 2 para descendente)
        System.out.print("Introduce 1 para orden ascendente o 2 para orden descendente: ");
        int orden = scanner.nextInt();

        // Validar la opción de ordenamiento
        if (orden != 1 || orden != 2) {
            System.out.println("Opción de ordenamiento no válida. Los números no se mostrarán.");
            return;
        }

        // Ordenar de manera ascendente
        if (orden == 1) {
            if (num1 > num2) {
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 > num3) {
                double temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 > num2) {
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        // Ordenar de manera descendente
        else {
            if (num1 < num2) {
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }
            if (num2 < num3) {
                double temp = num2;
                num2 = num3;
                num3 = temp;
            }
            if (num1 < num2) {
                double temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        // Mostrar los tres números ordenados
        System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3);
    }
}
