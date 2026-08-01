/**
 * 
 */
package Baitapbosung;
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

	        // Tạo mảng chứa 3 quyển sách
	        SACH[] ds = new SACH[3];

	        // Nhập dữ liệu
	        for (int i = 0; i < ds.length; i++) {

	            System.out.println("Nhập thông tin sách thứ " + (i + 1));

	            System.out.print("Mã sách: ");
	            String ma = sc.nextLine();

	            System.out.print("Tên sách: ");
	            String ten = sc.nextLine();

	            System.out.print("Giá: ");
	            double gia = sc.nextDouble();
	            sc.nextLine(); // Xóa bộ đệm

	            ds[i] = new SACH(ma, ten, gia);
	        }

	        // In danh sách
	        System.out.println("\n===== DANH SÁCH SÁCH =====");

	        for (SACH s : ds) {
	            System.out.println("Mã sách: " + s.getMaSach());
	            System.out.println("Tên sách: " + s.getTenSach());
	            System.out.println("Giá: " + s.getGia());
	            System.out.println("-------------------------");
	        }

	        // Tìm sách có giá cao nhất
	        SACH max = ds[0];

	        for (int i = 1; i < ds.length; i++) {
	            if (ds[i].getGia() > max.getGia()) {
	                max = ds[i];
	            }
	        }

	        System.out.println("Sách có giá cao nhất:");
	        System.out.println("Mã sách: " + max.getMaSach());
	        System.out.println("Tên sách: " + max.getTenSach());
	        System.out.println("Giá: " + max.getGia());

	        sc.close();
	}

}
