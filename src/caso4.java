import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// Instancia 
		Scanner sc = new Scanner(System.in);
		
		//definir variables
		float n1 = 0;
		float n2 = 0;
		
		System.out.println("Primer n�mero: ");
		n1 = sc.nextFloat();
		
		System.out.println("Segundo n�mero: ");
		n2 = sc.nextFloat();
		
		float suma, resta, producto, division, resto;
		suma= n1 + n2;
		resta= n1 -n2;
		producto= n1* n2;
		division= n1/n2;
		resto = n1 % n2;
		
		System.out.println("---resultados---");
		System.out.println("Suma: "+ suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("Division: " + division);
		System.out.println("Resto: " + resto);
		
		

	}

}
