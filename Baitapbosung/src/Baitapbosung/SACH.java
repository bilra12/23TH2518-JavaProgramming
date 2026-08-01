/**
 * 
 */
package Baitapbosung;

/**
 * 
 */
public class SACH {

	/**
	 * @param args
	 */
	 private String maSach;
	    private String tenSach;
	    private double gia;

	    // Constructor không tham số
	    public SACH() {
	    }

	    // Constructor có tham số
	    public SACH(String maSach, String tenSach, double gia) {
	        this.maSach = maSach;
	        this.tenSach = tenSach;
	        this.gia = gia;
	    }

	    // Getter
	    public String getMaSach() {
	        return maSach;
	    }

	    public String getTenSach() {
	        return tenSach;
	    }

	    public double getGia() {
	        return gia;
	    }

	    // Setter
	    public void setMaSach(String maSach) {
	        this.maSach = maSach;
	    }

	    public void setTenSach(String tenSach) {
	        this.tenSach = tenSach;
	    }

	    public void setGia(double gia) {
	        this.gia = gia;
	}

}
