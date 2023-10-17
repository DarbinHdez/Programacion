import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		int año1;
		int año2;
		int edad;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Tu año de nacimiento: ");
		año1 = sc.nextInt();
		System.out.println("Año actal: ");
		año2 = sc.nextInt();
		
		edad= año2 - año1;
		
		System.out.println("Usted tiene actualmente " + edad + " años");

	}

}
