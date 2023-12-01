public class MuestraYContaMultiplos {
    public static void main(String[] args) {
        int contadorMultiplosDos = 0;
        int contadorMultiplosTres = 0;

        System.out.println("1- Números múltiplos de dos entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                // Muestra y cuenta múltiplos de dos
                System.out.print(i+", ");
                contadorMultiplosDos++;
            } 
        } 
        System.out.println("\nTotal de números múltiplos de dos: " + contadorMultiplosDos);

        System.out.println("2- Números múltiplos de tres entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                // Muestra y cuenta múltiplos de tres
                System.out.print(i+ ", ");
                contadorMultiplosTres++;
            }
        }
        System.out.println("\nTotal de números múltiplos de tres: " + contadorMultiplosTres);
    }
}
