import java.util.Scanner;
public class caso18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double b, h, area;
        
        System.out.println("Ingresa base: ");
        b=sc.nextDouble();
        
        System.out.println("Ingresa altura: ");
        h=sc.nextDouble();
        
        area=(b*h)/2;
        
       System.out.println("El area del triangulo es: "+ area);

	}

}
