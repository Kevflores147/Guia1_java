import java.util.Scanner;
public class caso20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double pv, aumento;
        
        System.out.println("Ingresa el precio de venta: ");
        pv=sc.nextDouble();
        
        aumento = (pv*142)/100;
        
        System.out.println("Precio de venta incrementado en 42%: "+aumento);

	}

}
