/**
 * 
 */
package HocVien;
import java.util.Scanner;
/**
 * 
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        HocVien hv = new HocVien();

	        System.out.print("Nhập mã học viên: ");
	        hv.setMaHocVien(sc.nextLine());

	        System.out.print("Nhập họ tên: ");
	        hv.setHoTen(sc.nextLine());

	        System.out.print("Nhập năm sinh: ");
	        hv.setNamSinh(sc.nextInt());
	        sc.nextLine(); // Xóa bộ đệm

	        System.out.print("Nhập giới tính: ");
	        hv.setGioiTinh(sc.nextLine());

	        System.out.println("\n===== THÔNG TIN HỌC VIÊN =====");
	        System.out.println("Mã học viên: " + hv.getMaHocVien());
	        System.out.println("Họ tên: " + hv.getHoTen());
	        System.out.println("Năm sinh: " + hv.getNamSinh());
	        System.out.println("Giới tính: " + hv.getGioiTinh());

	        sc.close();
	}

}
