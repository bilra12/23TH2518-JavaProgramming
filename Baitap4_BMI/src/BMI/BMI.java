/**
 * 
 */
package BMI;
import java.util.Scanner;
/**
 * 
 */
public class BMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Nhập chiều cao và cân nặng
        System.out.print("Nhập chiều cao (m): ");
        double chieuCao = sc.nextDouble();

        System.out.print("Nhập cân nặng (kg): ");
        double canNang = sc.nextDouble();

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // Xuất BMI
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.printf("Chỉ số BMI: %.2f\n", bmi);

        // Đánh giá tình trạng
        if (bmi < 18.5) {
            System.out.println("Tình trạng: Gầy");
        } else if (bmi < 23) {
            System.out.println("Tình trạng: Bình thường");
        } else if (bmi < 25) {
            System.out.println("Tình trạng: Thừa cân");
        } else if (bmi < 30) {
            System.out.println("Tình trạng: Béo phì độ I");
        } else {
            System.out.println("Tình trạng: Béo phì độ II");
        }

        sc.close();
	}

}
