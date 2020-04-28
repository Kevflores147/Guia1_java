import java.util.Scanner;

public class caso24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double m1 , m2, m3, a,b,c;
        
        System.out.println("Ingresa el primer monto: ");
        m1 = sc.nextFloat();
        
        System.out.println("Ingresa el segundo monto: ");
        m2 = sc.nextFloat();
        
        System.out.println("Ingresa el tercer monto: ");
        m3 = sc.nextFloat();
        
        a= (m1/5) + (m2 * 0.2);
        b= (m3*1.6)/2;
        c= (m1+m2+m3)*0.92;
        
        System.out.println("Primer resultado: "+a);
        System.out.println("segundo resultado: " +b);
        System.out.println("segundo resultado: "+c);
        
      

	}

}
