import java.util.Scanner;

public class caso21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double pv, descuento;
        
        System.out.println("Ingresa el precio de venta: ");
        pv=sc.nextDouble();
        
        descuento = (pv*88)/100;
        
        System.out.println("Precio de venta disminuido en 12%: "+descuento);


	}

}
