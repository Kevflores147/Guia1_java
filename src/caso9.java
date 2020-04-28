import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		float lado = 0, area = 0, perimetro = 0, lado2=0; 
		
		System.out.println("Ingrese el lado: ");
		lado = sc.nextFloat();
		
		System.out.println("Ingrese el lado: ");
		lado2 = sc.nextFloat();
		
		area = lado * lado2;
		perimetro = lado+lado+lado2+lado2;
		
		System.out.println("---Resultados---");
		System.out.println("El area del rectangulo es: "+ area);
		System.out.println("El perimetro es: "+ perimetro);
	}

}
