import java.util.Scanner;
import java.util.Comparator;
public class CBGV{
	private double luongcung;
	private double luongthuong;
	private double luongphat;
	Giaovien giaovien;
	
	public CBGV() {
		
	}
	public CBGV(double luongcung , double luongthuong , double luongphat , Giaovien giaovien) {
		this.luongcung = luongcung;
		this.luongthuong = luongthuong;
		this.luongphat = luongphat;
		this.giaovien = giaovien;
	}
	public double getLuongcung() {
		return luongcung;
	}
	public void setLuongcung(double luongcung) {
		this.luongcung = luongcung;
	}
	public double getLuongthuong() {
		return luongthuong;
	}
	public void setLuongthuong(double luongthuong) {
		this.luongthuong = luongthuong;
	}
	public double getLuongphat() {
		return luongphat;
	}
	public void setLuongphat(double luongphat) {
		this.luongphat = luongphat;
	}
	public Giaovien getGiaovien() {
		return giaovien;
	}
	public void setGiaovien(Giaovien giaovien) {
		this.giaovien = giaovien;
	}
	public void nhapthongtinCB() {
		Scanner sc  = new Scanner(System.in);
		giaovien = new Giaovien();
		giaovien.nhap();
		System.out.println("Nhap luong cung :");
		luongcung = sc.nextDouble();
		System.out.println("Nhap luong thuong :");
		luongthuong = sc.nextDouble();
		System.out.println("Nhap luong phat :");
		luongphat = sc.nextDouble();
		
	}
	public double thuclinh() {
		return luongcung + luongthuong - luongphat;
	}
	public String toString() {
		System.out.print(giaovien.toString());
		return "\t luongcung=" + luongcung + "\t luongthuong=" + luongthuong + "\t luongphat=" + luongphat + "\tLuong thuc linh = " +thuclinh();
		
	}
	
	
	
}
