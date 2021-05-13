import java.util.Scanner;

public class MainBT23 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Nguoi p[] = null;
		System.out.println("Nhap so luong ho dan :");
		int n = sc.nextInt();
		p = new Nguoi[n];
		for(int i=0;i<n;i++) {
			System.out.println("Ho dan thu"+(i+1) +":");
			p[i] = new Nguoi();
			p[i].nhap();
		}
		System.out.printf("%10s %15s %15s %15s \n","Ho ten" , "Tuoi" , "Nghe Nghiep" , "CMND" );
		for(int i=0;i<n;i++) {
			p[i].xuat();
		}
		sc.close();

	}
	}

