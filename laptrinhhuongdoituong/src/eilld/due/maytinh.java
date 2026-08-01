/**
 * 
 */
package eilld.due;

/**
 * 
 */
public class maytinh {


    int a;
    int b;

    public maytinh(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int tong() {
        return a + b;
    }

    int hieu() {
        return a - b;
    }

    int tich() {
        return a * b;
    }

    int thuong() {
        return a / b;
    }

    public static void main(String[] args) {

        maytinh mt = new maytinh(10, 5);

        System.out.println("Tong = " + mt.tong());
        System.out.println("Hieu = " + mt.hieu());
        System.out.println("Tich = " + mt.tich());
        System.out.println("Thuong = " + mt.thuong());
	}

}
