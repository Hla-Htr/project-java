import java.util.Scanner;
import java.util.ArrayList;

public class Xuat33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Taisan taisan;
		Taisan t = new Taisan();
		ArrayList<Taisan> arr = new ArrayList<>();
		t.nhapphieu();
		System.out.println("Nhap so luong tai san: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {  
        taisan = new Taisan();
          System.out.println("Nhap thong tin tai san thu " + (i+1) + ":");  
          taisan.nhap();
          arr.add(taisan);
        } 
        System.out.println("THONG TIN PHIEU KIEM KE :");
        t.xuatphieu();
        System.out.printf("%15s %13s %15s \n" , "Ten Tai San " , "So Luong " , "Tinh trang");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).xuat();
        }
        System.out.println("So tai san da kiem ke :" + n);
        int tong = 0;
        for(int i=0;i<arr.size();i++) {
        	tong += arr.get(i).getSoluong();
        }
        System.out.println("Tong so luong :" + tong);
	}

}
