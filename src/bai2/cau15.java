package bai2;

import java.util.Scanner;

public class cau15 {
	//15.8 tính tổng các số chẵn trong khoảng từ 1 đến 99
	public int tinhTongTrongKhoang() {
		int sum = 0;
		for (int i = 1; i <= 99; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	//15.9 kiểm tra một số nguyên có phải là số âm hay không
	public boolean kiemTraSoAm(int n) {
		if (n < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//15.10 in ra ngày trong tuần dựa trên số nhập vào
	
	public void ngay(int n) {
		switch(n) {
		case 1:
			System.out.println("Thứ hai");
			break;
		case 2:
			System.out.println("Thứ ba");
			break;
		case 3:
			System.out.println("Thứ tư");
			break;
		case 4:
			System.out.println("Thứ năm");
			break;
		case 5:
			System.out.println("Thứ 6");
			break;
		case 6:
			System.out.println("Thứ 7");
			break;
		case 7:
			System.out.println("Chủ nhật");
			break;
		default:
		System.out.println("Số không hợp lệ!");		
		}
	}
	
	//15.11 tính tổng các số từ 1 đến n(n nhập từ bàn phím)
	public int tinhTongNhapTuBanPhim() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			 sum += i;
		}
		return sum;
	}
	
	//15.12 kiểm tra một năm có phải là năm nhuần hay không. Năm nhuần là năm chia hết cho 4 nhưng không chi hết cho 100 hoặc chia hết cho 400;
	public boolean kiemTraNamNhuan(int nam) {
		if (nam % 400 == 0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//15.13 giải và biện luận phương trình bậc 2
	public void phuongTrinhBac2(int a, int b, int c) {
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phương trình vô nghiệm");
			}
			else {
				 double x = (double)-c/b;
				 System.out.print("Nghiệm phương trình là: " + x);
			}
		}
		else {
			double deta = b*b - 4*a*c;
			if (deta < 0) {
					 System.out.println("Phương trình vô nghiệm");
			}
			else if (deta == 0) {
				double x = (double)-b/(2*a);
				System.out.println("Phương trình có nghiệm kép là: " + x);
			}
			else {
				double x1 = (double)(-b + Math.sqrt(deta))/(2*a);
				double x2 = (double)(-b - Math.sqrt(deta))/(2*a);
				System.out.println("Phương trình có 2 nghiệm phân biệt là: X1 = " + x1 +", X2 = " + x2);
			}
		}
	}
	
	//15.14 nhập số nguyên từ bàn phím và tính n!
	public long giaiThua() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long giaiThua = 0;
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
		}
		return giaiThua;
	}
	
	//15.15 tìm UCLN của 2 số được nhập từ bàn phím và in kết quả ra màn hình
	public void uCLN() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 || b == 0) {
			System.out.println(a + b);
		}
		int min = a < b ? a : b;
		for (int i = min ; i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				System.out.println(i);
			}
		}
	}
	
	//15.16 tìm BCNN của 2 số được nhập từ bàn phím và in kết quả ra màn hình
	public void bCNN() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max = a > b ? a : b;
		int kq = max;
		while(true) {
			if (max % a == 0 && max % b == 0) {
				kq = max;
				break;
			}
			++max;
		}
		System.out.print(kq);
	}
	
	//15.17 nhập một số nguyên từ bàn phím và kiểm tra số đó có phải số nguyên tố hay không 
	public boolean kiemTraSoNguyenTo() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			return false;
		}
		else if (n == 1) {
			return true;
		}
		else {
			for (int i = 2; i < Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		}
		
	}
	
	//15.18 tính diện tích tam giác, hình thang, hình tròn
	public void dienTich(int a, int b, int c, int h, int r) {
		//diện tích hình tam giác
		int p = (a + b + c) / 2;
		double s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
		//diện tích hình thang
		int sHT = ((a + b) * h) / 2;
		// diện tích hình tròn
		double sHTron = r*r*3.14;
	}
}
