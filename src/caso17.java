import java.util.Scanner;
import java.text.DecimalFormat;
public class caso17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double a, d, r, total, a1, d1, r1;
		
		System.out.print("Ingrese numero de aprobados: ");
		a = sc.nextFloat();
		
		System.out.print("Ingrese numero de desaprobados: ");
		d = sc.nextFloat();
		
		System.out.print("Ingrese numero de retirados: ");
		r = sc.nextFloat();
		
		total = a + d + r;
		
		a1 = (a/total)*100;
		d1 = (d/total)*100;
		r1 = (r/total)*100;
		
		System.out.println("--Resultados--");
		System.out.println("Aprobados: "+df.format(a1));
		System.out.println("desaprobados: "+df.format(d1));
		System.out.println("Retirados: "+df.format(r1));

	}

}
