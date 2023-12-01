import java.util.Scanner;

public class CalculadoraDeImpuestos {

	public static void main(String[] args) {
		
		String respuesta = " "; // variable donde se almacenará la respuesta del usuario para continuar.
		int salarioAnual = 0;  // Saliario anual del Usuario
		double tasaTramo1 = 0.10; // Primer tramo 10%
		double tasaTramo2 = 0.15; // Segundo tramo 20%
		double tasaTramo3 = 0.20; //Tercer tramo 30%
		double importeImpuesto = 0; //Valor del impuesto a pagar
				
		Scanner scanner = new Scanner (System.in);
		
			//Bucle Do-While
			// Bucle para asegurarse de que se ingrese un salario válido
		
			do { 
				System.out.print("Introduce tu salario anual: "); // Solicitar salario anual al usuario
				salarioAnual = scanner.nextInt();
				
					if (salarioAnual <= 0) {
					System.out.println ("Lo siento la cantidad dede ser un número mayor a 0.");	//si el valor es <0
				
				
					}while (salarioAnual <=0);   // Calcular impuestos
					
						if (salarioAnual <=30000) {
							  importeImpuesto = salarioAnual * tasaTramo1; // Impuesto = el salario del usuario * 10%
							  System.out.println("**Este es el reesultado del cálculo de tu Tasa: **");
							  System.out.println("- Para un salario Anual de: " + salarioAnual+"€");
							  System.out.println("- La tasa Impositiva es: " + (tasaTramo1 * 100)+"%");
							  System.out.println("- Impuesto que debes pagar es : " + importeImpuesto + "€");
						}else {
							if (salarioAnual <=50000) {
								importeImpuesto = salarioAnual * tasaTramo2; // Impuesto = el salario del usuario * 15%
								System.out.println("**Este es el reesultado del cálculo de tu Tasa: **");
								System.out.println("- Para un salario Anual de: " + salarioAnual+"€");
								System.out.println("- La tasa Impositiva es: " + (tasaTramo2 * 100)+"%");
								System.out.println("- Impuesto que debes pagar es : " + importeImpuesto + "€");
								}else {
									importeImpuesto = salarioAnual * tasaTramo3; // Impuesto = el salario del usuario * 20%
									System.out.println("**Este es el reesultado del cálculo de tu Tasa: **");
									System.out.println("- Para un salario Anual de: " + salarioAnual+"€");
									System.out.println("- La tasa Impositiva es: " + (tasaTramo3 * 100)+"%");
									System.out.println("- Impuesto que debes pagar es : " + importeImpuesto + "€");
									}
						}			// Preguntar al usuario si desea continuar		
							System.out.println("Deseas continuar calculando impuestos? Si/No:");
							respuesta = scanner.next().toLowerCase();
									
				}while (respuesta.equalsIgnoreCase("si"));{
					// Si la respuesta no es "sí", salir del bucle
					System.out.println("Gracias por utilizar nuestros servicios!");
				}	
				// Cerrar el scanner al salir del programa
						 scanner.close();
		   }	        
		}


