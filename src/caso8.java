import java.util.Scanner;
public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float lado = 0, area = 0, perimetro = 0;
		
		System.out.println("Ingrese el lado del cuadrado: ");
		lado = sc.nextFloat();
		
		area = lado * lado;
		perimetro = lado*4;
		
		System.out.println("El area del cuadrado es: "+ area);
		System.out.println("El perimetro es: "+ perimetro);
		

	}

}
