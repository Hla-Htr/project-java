import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
public class Xuat27 {
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CBGV cb;
		ArrayList<CBGV> gv = new ArrayList<>();
		System.out.print("Nhap so luong CBGV :");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			cb = new CBGV();
			System.out.println("CBGV thu" +(i+1)+":");
			cb.nhapthongtinCB();
			gv.add(cb);
		}
		System.out.println("Thong tin CBGV :");
		for(int i=0;i<n;i++) {
			System.out.println(gv.get(i).toString());
		}
		
		CBGV them;
		System.out.print("Nhap so luong can bo muon them :");
		int m = sc.nextInt();
		for(int i=0;i<m;i++) {
			them = new CBGV();
			System.out.println("CBGV thu" +(i+1)+":");
			them.nhapthongtinCB();
			gv.add(them);
		}
		for(int i=0;i<gv.size();i++) {
			System.out.println(gv.get(i).toString());
		}
		System.out.println("Nhap ma gv muon xoa :");
		sc.nextLine();
		String magv = sc.nextLine();
		CBGV x = gv.stream().filter(g -> g.giaovien.getMagv().equals(magv)).findFirst().orElse(null);
		gv.remove(x);
		System.out.println("Danh Sach CBGV Sau Khi Xoa :");
		for(int i=0;i<gv.size();i++) {
			System.out.println(gv.get(i).toString());
		}
		
		 Collections.sort(gv, new Comparator<CBGV>() {
	            @Override
	            public int compare(CBGV gv1, CBGV gv2) {
	                return (gv1.getGiaovien().getHoten().compareTo(gv2.getGiaovien().getHoten()));
	            }
	        });
		System.out.println("\n Danh Sach CBGV sap xep ho ten theo bang chu cai");
		for(int i=0;i<gv.size();i++) {
			System.out.println(gv.get(i).toString());
		}
	}
}
