/**
 * 
 */
package TheTich;
import java.util.Scanner;
/**
 * 
 */
public class TheTich {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        // Nhập cạnh của khối lập phương
	        System.out.print("Nhập cạnh của khối lập phương: ");
	        double canh = sc.nextDouble();

	        // Tính thể tích
	        double theTich = canh * canh * canh;

	        // Xuất kết quả
	        System.out.println("\n===== KẾT QUẢ =====");
	        System.out.println("Thể tích khối lập phương: " + theTich);

	        sc.close();
	}

}
