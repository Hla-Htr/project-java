import java.util.Scanner;
public class MainBT21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ManagerDocument managerdocument = new ManagerDocument();
		while(true) {
			System.out.println("1. Insert document");
			System.out.println("2. Search document");
			System.out.println("3. Show document");
			System.out.println("4. Remove document");
			System.out.println("5. Return ");
			String line = sc.nextLine();
			
			switch(line) {
			case "1" : {
				
				System.out.println("a : Insert Book");
				System.out.println("b : Insert Journal");
				System.out.println("c : Insert Newspaper");
				String tmp = sc.nextLine();
				switch(tmp) {
				case "a":{
					System.out.println("Nhap ID :");
					String id = sc.nextLine();
					System.out.println("Nhap NXB :");
					String nxb = sc.nextLine();
					System.out.println("Nhap Number :");
					int number = sc.nextInt();
					sc.nextLine();
					System.out.println("Nhap tac gia :");
					String tacgia = sc.nextLine();
					System.out.println("Nhap so trang :");
					int sotrang = sc.nextInt();
					Document book = new Book(id,nxb,number,tacgia,sotrang);
					managerdocument.addDocument(book);
					System.out.println(book.toString());
					sc.nextLine();
					break;
				}
				case "b" :{
					System.out.println("Nhap ID :");
					String id = sc.nextLine();
					System.out.println("Nhap NXB :");
					String nxb = sc.nextLine();
					System.out.println("Nhap Number :");
					int number = sc.nextInt();
					System.out.println("Nhap so phat hanh :");
					int soph = sc.nextInt();
					System.out.println("Nhap thang phat hanh :");
					int thangph = sc.nextInt();
					sc.nextLine();
					Document journal = new Journal(id,nxb,number,soph,thangph);
					managerdocument.addDocument(journal);
					System.out.println(journal.toString());
					break;
				}
				case "c" :{
					System.out.println("Nhap ID :");
					String id = sc.nextLine();
					System.out.println("Nhap NXB :");
					String nxb = sc.nextLine();
					System.out.println("Nhap Number :");
					int number = sc.nextInt();
					System.out.println("Nhap ngay phat hanh :");
					int ngayph = sc.nextInt();
					sc.nextLine();
					Document newspaper = new Newspaper(id,nxb,number,ngayph);
					managerdocument.addDocument(newspaper);
					System.out.println(newspaper.toString());
					break;
				}
				default :
					break;
				}
				break;
			}
			case "2" :{
				 System.out.println("Enter a to search book");
                 System.out.println("Enter b to search newspaper");
                 System.out.println("Enter c to search journal");
                 String num = sc.nextLine();
                 switch(num) {
                 case "a" :{
                	 managerdocument.showbyBook();
                	 break;
                 }
                 case "b" :{
                	 managerdocument.showbyNewspaper();
                	 break;
                 }
                 case "c" :{
                	 managerdocument.showbyJournal();
                	 break;

                 }
                 default:
                     System.out.println("Invalid");
                     break;

                 }
                 break;
			}
			case "3" :{
				managerdocument.showinfor();
				break;
			}
			case "4" :{
				System.out.println("Nhap id muon xoa :");
				String id = sc.nextLine();
				System.out.println(managerdocument.deleteDocument(id) ? " Xoa thanh cong " : "Fail");
				break;
			}
			case "5" :{
				return;
			}
			default :
				System.out.println("Errol");
				continue;
			}
		}

	}

}
