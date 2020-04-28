import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double area;
		double radio;
		double perimetro;
		
		System.out.println("Ingrese el radio del circulo: ");
		radio = sc.nextFloat();
		
		area = 3.1416 * Math.pow(radio,2);
		perimetro = 2*Math.PI*radio;
		
		
		
		
		System.out.println("El area del cuadrado es: "+ area);
		System.out.println("El perimetro es: "+ perimetro);

	}

}
