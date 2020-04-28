import java.util.Scanner;
//creado por kevin flores
public class caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double importe,dolares,euros, cantidad, precio;
		
		
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextFloat();
		
		System.out.print("Ingrese precio: ");
		precio = sc.nextFloat();
		
		importe = cantidad * precio;
	    dolares = importe/ 3.24;
		euros = importe/ 3.75;
		
		System.out.println("resultados");
		System.out.println("Importe: "+ importe);
		System.out.println("En dolares: "+ dolares );
		System.out.println("En dolares: "+ euros );
		

	}

}
