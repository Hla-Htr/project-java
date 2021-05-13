import java.util.Scanner;
public class Nguoi {
		private String hoten;
		private int tuoi;
		private String nghenghiep;
		private String cmt;
		
		public Nguoi(String hoten , int tuoi , String nghenghiep , String cmt) {
			this.hoten = hoten;
			this.tuoi = tuoi;
			this.nghenghiep = nghenghiep;
			this.cmt = cmt;
		}
		public Nguoi() {
			
		}
		public String getHoten() {
			return hoten;
		}
		public void setHoten(String hoten) {
			this.hoten = hoten;
		}
		public int getTuoi() {
			return tuoi;
		}
		public void setTuoi(int tuoi) {
			this.tuoi = tuoi;
		}
		public String getNghenghiep() {
			return nghenghiep;
		}
		public void setNghenghiep(String nghenghiep) {
			this.nghenghiep = nghenghiep;
		}
		public String getCmt() {
			return cmt;
		}
		public void setCmt(String cmt) {
			this.cmt = cmt;
		}
		Scanner sc = new Scanner(System.in);
		public void nhap() {
			System.out.println("Nhap ho ten :");
			setHoten(sc.nextLine());
			System.out.println("Nhap tuoi :");
			setTuoi(sc.nextInt());
			sc.nextLine();
			System.out.println("Nhap nghe nghiep :");
			setNghenghiep(sc.nextLine());
			System.out.println("Nhap cmt :");
			setCmt(sc.nextLine());
			
		}
		public void xuat() {
			System.out.printf("%10s %15d %15s %15s \n",hoten,tuoi,nghenghiep,cmt);
		}
}
