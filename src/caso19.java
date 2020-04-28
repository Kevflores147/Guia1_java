import java.util.Scanner;

public class caso19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double a, b, c, perimetro;
        
        System.out.println("Halla el perimetro de tu triangulo: ");
        
        System.out.println("Ingresa primer lado: ");
        a=sc.nextDouble();
        
        System.out.println("Ingresa segundo lado: ");
        b=sc.nextDouble();
        
        System.out.println("Ingresa tercer lado: ");
        c=sc.nextDouble();
        
        perimetro = a+b+ c;
        
       System.out.println("El area del triangulo es: "+ perimetro);
	}

}
