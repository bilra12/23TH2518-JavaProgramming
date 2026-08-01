/**
 * 
 */
package ChuviDT;
import java.util.Scanner;
/**
 * 
 */
public class HinhChuNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);

	        // Nhập hai cạnh của hình chữ nhật
	        System.out.print("Nhập chiều dài: ");
	        double dai = sc.nextDouble();

	        System.out.print("Nhập chiều rộng: ");
	        double rong = sc.nextDouble();

	        // Tính chu vi, diện tích và cạnh nhỏ
	        double chuVi = (dai + rong) * 2;
	        double dienTich = dai * rong;
	        double canhNho = Math.min(dai, rong);

	        // Xuất kết quả
	        System.out.println("\n===== KẾT QUẢ =====");
	        System.out.println("Chu vi: " + chuVi);
	        System.out.println("Diện tích: " + dienTich);
	        System.out.println("Cạnh nhỏ: " + canhNho);

	        sc.close();
	}

}
