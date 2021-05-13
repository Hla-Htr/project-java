import java.util.Scanner;
public class PhieuKiemKe {
	protected String maphieu;
	protected String ngaykiem;
	protected String nhanvien;
	protected String chucvu;
	protected String phong;
	protected String maphong;
	protected String truongphong;
	public PhieuKiemKe(String maphieu , String ngaykiem , String nhanvien , String chucvu , String phong , String maphong , String truongphong) {
		this.maphieu = maphieu;
		this.ngaykiem = ngaykiem;
		this.nhanvien = nhanvien;
		this.chucvu = chucvu;
		this.phong = phong;
		this.maphong = maphong;
		this.truongphong = truongphong;
	}
	public PhieuKiemKe() {
		
	}
	public String getMaphieu() {
		return maphieu;
	}

	public void setMaphieu(String maphieu) {
		this.maphieu = maphieu;
	}

	public String getNgaykiem() {
		return ngaykiem;
	}

	public void setNgaykiem(String ngaykiem) {
		this.ngaykiem = ngaykiem;
	}

	public String getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(String nhanvien) {
		this.nhanvien = nhanvien;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	public String getPhong() {
		return phong;
	}

	public void setPhong(String phong) {
		this.phong = phong;
	}

	public String getMaphong() {
		return maphong;
	}

	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}

	public String getTuongphong() {
		return truongphong;
	}

	public void setTuongphong(String truongphong) {
		this.truongphong = truongphong;
	}
	public void nhapphieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma phieu :");
		maphieu = sc.nextLine();
		System.out.println("Nhap ngay kiem :");
		ngaykiem = sc.nextLine();
		System.out.println("Nhap nhan vien :");
		nhanvien = sc.nextLine();
		System.out.println("Nhap chuc vu :");
		chucvu = sc.nextLine();
		System.out.println("Nhap phong :");
		phong = sc.nextLine();
		System.out.println("Nhap ma phong :");
		maphong = sc.nextLine();
		System.out.println("Nhap truong phong :");
		truongphong = sc.nextLine();
	}
	public void xuatphieu() {
		System.out.println("Ma Phieu :" + maphieu);
		System.out.println("Ngay Kiem :" + ngaykiem);
		System.out.println("Nhan Vien :" + nhanvien);
		System.out.println("Chuc vu :" + chucvu);
		System.out.println("Phong :" + phong);
		System.out.println("Ma Phong :" + maphong);
		System.out.println("Truong Phong :" + truongphong);
		
	}

}
