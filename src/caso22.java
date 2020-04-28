import java.util.Scanner;

public class caso22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double a, b, c, n1,n2,n3,promedio;
        String nombre;
        
        System.out.println("Ingresa el nombre del alumno: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese primera nota: ");
        a = sc.nextFloat();
        
        System.out.println("Ingrese segunda nota: ");
        b = sc.nextFloat();
        
        System.out.println("Ingrese tercera nota: ");
        c = sc.nextFloat();
        
        n1 = (a*20)/100; 
        n2 = (b*30)/100;
        n3 = (c*50)/100;
        
        promedio = (n1 + n2 + n3)/3;
        
        System.out.println("Promedio de notas es: "+promedio);
       

	}

}
