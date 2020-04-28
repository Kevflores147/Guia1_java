import java.util.Scanner;
public class caso16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double ht, th, sueldo, dolares, bono, total;
		
		System.out.print("Ingrese horas trabajadas: ");
		ht = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por horas: ");
		th = sc.nextFloat();
		
		sueldo = ht * th;
		bono = sueldo * 0.05;
		total = sueldo + bono;
		dolares = total / 3.24;
		
		System.out.println("--Resultados--");
		System.out.println("Sueldo: "+sueldo);
		System.out.println("Bono: "+bono);
		System.out.println("total: "+total);
		System.out.println("total en dolares: "+dolares);
		
		

	}

}
