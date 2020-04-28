import java.util.Scanner;
//creado por kevin flores

public class caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=0, sumatoria=0;
		
		
		System.out.println("Ingrese numeros a sumar : ");
		n = sc.nextInt();
		
		sumatoria = (n*(n+1))/2;
		
		System.out.println(">>Resultados<<");
		System.out.print("Sumatoria de "+ n + " es " + sumatoria );
		
		
	}

}
