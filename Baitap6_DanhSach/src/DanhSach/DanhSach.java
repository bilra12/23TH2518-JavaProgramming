/**
 * 
 */
package DanhSach;

/**
 * 
 */
public class DanhSach {
	    private String maHocVien;
	    private String hoTen;
	    private int namSinh;
	    private String gioiTinh;

	    public DanhSach() {
	    }

	    public DanhSach(String maHocVien, String hoTen, int namSinh, String gioiTinh) {
	        this.maHocVien = maHocVien;
	        this.hoTen = hoTen;
	        this.namSinh = namSinh;
	        this.gioiTinh = gioiTinh;
	    }

	    public String getMaHocVien() {
	        return maHocVien;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public int getNamSinh() {
	        return namSinh;
	    }

	    public String getGioiTinh() {
	        return gioiTinh;
	    }
	}	