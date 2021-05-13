import java.util.Scanner;

public class Giaovien {
	private String hoten;
	private int tuoi;
	private String quequan;
	private String magv;
	
	public Giaovien() {
		
	}
	public Giaovien(String hoten , int tuoi , String quequan , String magv) {
		this.hoten = hoten;
		this.tuoi = tuoi;
		this.quequan = quequan;
		this.magv = magv;
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

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public String getMagv() {
		return magv;
	}

	public void setMagv(String magv) {
		this.magv = magv;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten :");
		hoten = sc.nextLine();
		System.out.println("Nhap tuoi :");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap que quan :");
		quequan = sc.nextLine();
		System.out.println("Nhap ma GV :");
		magv = sc.nextLine();
	}
	@Override
	public String toString() {
		return "hoten = " + hoten + "\t tuoi=" + tuoi + "\t quequan=" + quequan + "\t magv=" + magv ;
	}
	

}
