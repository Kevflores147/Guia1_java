import java.util.Scanner;

public class caso23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double precio,cantidad, importe,igv,descuento, total;
        String nombre;
        
        System.out.println("Ingresa el nombre del producto: ");
        nombre = sc.nextLine();
        
        System.out.println("Ingrese precio de producto: ");
        precio = sc.nextFloat();
        
        System.out.println("Ingrese cantidad del producto: ");
        cantidad = sc.nextFloat();
        
        importe = precio * cantidad;
        igv = importe*0.18;
        descuento = importe * 0.03;
        total = importe + igv - descuento;
        
        System.out.println("El precio neto de los productos comprados es: "+total);

	}

}
