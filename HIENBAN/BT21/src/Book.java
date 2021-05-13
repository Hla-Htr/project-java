
public class Book extends Document {
		private String tacgia;
		private int sotrang;
		
		public Book(String id , String nxb , int number , String tacgia , int sotrang) {
			super(id,nxb,number);
			this.tacgia = tacgia;
			this.sotrang = sotrang;
		}
		
		public String getTacgia() {
			return tacgia;
		}
		public void setTacgia(String tacgia) {
			this.tacgia = tacgia;
		}
		public int getSotrang() {
			return sotrang;
		}
		public void setSotrang(int sotrang) {
			this.sotrang = sotrang;
		}
		public String toString() {
	        return "Book{" +
	                "author='" + tacgia + '\'' +
	                ", numerPage=" + sotrang +
	                ", id='" + id + '\'' +
	                ", nxb='" + nxb + '\'' +
	                ", number='" + number + '\'' +
	                '}';
	    }

		public void xuat() {
			System.out.printf(" %10s %15s %15d %15s %15d \n"," Ma TL" , " NXB " , " So BanPH" ," Tac Gia" , " So Trang" );
			System.out.printf(" %10s %15s %15d %15s %15d \n",id,nxb,number,tacgia,sotrang);
		}
}
