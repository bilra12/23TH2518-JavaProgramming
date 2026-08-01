/**
 * 
 */
package DTB;
import java.util.Scanner;
/**
 * 
 */
public class SinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Nhập họ và tên
        System.out.print("Nhập họ và tên sinh viên: ");
        String hoTen = sc.nextLine();

        // Nhập điểm trung bình
        System.out.print("Nhập điểm trung bình: ");
        double diemTB = sc.nextDouble();

        // Xuất kết quả
        System.out.println("\n===== THÔNG TIN SINH VIÊN =====");
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Điểm trung bình: " + diemTB);

        sc.close();
	}

}
