import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		//Definir mis variables
		int año1;
		int año2;
		int edad;
		//Hacer el calculo de la edad
		Scanner sc = new Scanner(System.in);
		System.out.println("Tu año de nacimiento: ");
		año1 = sc.nextInt();
		System.out.println("Año actal: ");
		año2 = sc.nextInt();
		
		edad= año2 - año1;
		//Mostrar mensaje de la edad actul del usuario
		System.out.println("Usted tiene actualmente " + edad + " años");

	}

}
