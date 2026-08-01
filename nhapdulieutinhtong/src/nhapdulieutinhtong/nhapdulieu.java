/**
 * 
 */
package nhapdulieutinhtong;

/**
 * 
 */
import java.util.Scanner;
public class nhapdulieu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Nhap so thu nhat: ");
	        int a = sc.nextInt();

	        System.out.print("Nhap so thu hai: ");
	        int b = sc.nextInt();

	        int tong = a + b;

	        System.out.println("Tong = " + tong);

	        sc.close();
	}

}
