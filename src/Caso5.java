import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float n1, n2, promedio, aumento, disminucion = 0;
		System.out.println("Primer número: ");
		n1 = sc.nextFloat();
		
		System.out.println("Segundo número: ");
		n2 = sc.nextFloat();
		
		promedio= (n1 + n2)/2;
		aumento=(float)( n1 + n1 * 0.2); //aplicar conversion, (cast)
		disminucion =(float) (n2 - n2 * 0.3);
		
		System.out.println("---Resultados---");
		System.out.println("Promedio      : "+ promedio);
		System.out.println("Aumento       : "+aumento);
		System.out.println("Dsisminucion  :"+disminucion);
		
		
		
		

	}

}
