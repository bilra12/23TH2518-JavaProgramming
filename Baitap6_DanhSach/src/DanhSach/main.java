/**
 * 
 */
package DanhSach;

/**
 * 
 */
public class main {



	    public static void main(String[] args) {

	       DanhSach hv1 = new   DanhSach("HV01", "Nguyễn Văn A", 2004, "Nam");
	       DanhSach hv2 = new   DanhSach("HV02", "Trần Thị B", 2002, "Nữ");
	       DanhSach hv3 = new   DanhSach("HV03", "Lê Văn C", 2005, "Nam");

	        // Đưa vào mảng
	       DanhSach[] ds = {hv1, hv2, hv3};

	        System.out.println("DANH SÁCH HỌC VIÊN");

	        for (DanhSach hv : ds) {
	            System.out.println("Mã: " + hv.getMaHocVien());
	            System.out.println("Họ tên: " + hv.getHoTen());
	            System.out.println("Năm sinh: " + hv.getNamSinh());
	            System.out.println("Giới tính: " + hv.getGioiTinh());
	            System.out.println("-------------------------");
	        }

	        // Tìm học viên nhiều tuổi nhất
	       DanhSach lonTuoi = ds[0];

	        for (int i = 1; i < ds.length; i++) {
	            if (ds[i].getNamSinh() < lonTuoi.getNamSinh()) {
	                lonTuoi = ds[i];
	            }
	        }

	        System.out.println("Học viên nhiều tuổi nhất:");
	        System.out.println("Họ tên: " + lonTuoi.getHoTen());
	        System.out.println("Năm sinh: " + lonTuoi.getNamSinh());
	    }
	
	}


