import java.util.Scanner;

public class Taisan extends PhieuKiemKe{
	private String tentaisan;
	private int soluong;
	private String tinhtrang;
	
	public Taisan(String maphieu , String ngaykiem , String nhanvien , String chucvu , String phong , String maphong , String truongphong , String tentaisan , int soluong , String tinhtrang) {
		super(maphieu,ngaykiem,nhanvien,chucvu,phong,maphong,truongphong);
		this.tentaisan = tentaisan;
		this.soluong = soluong;
		this.tinhtrang = tinhtrang;
	}
	public Taisan() {
		
	}
	public String getTentaisan() {
		return tentaisan;
	}

	public void setTentaisan(String tentaisan) {
		this.tentaisan = tentaisan;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(String tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tai san :");
		tentaisan = sc.nextLine();
		System.out.println("Nhap so luong :");
		soluong = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap tinh trang :");
		tinhtrang = sc.nextLine();
		
	}
	public void xuat() {
		System.out.printf("%15s %11d %15s \n",tentaisan , soluong , tinhtrang);
	}
}
