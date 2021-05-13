
public class Newspaper extends Document{
		private int ngayph;
		
		public Newspaper(String id , String nxb , int number , int ngayph) {
			super(id,nxb,number);
			this.ngayph = ngayph;
		}
		public int getNgayph() {
			return ngayph;
		}
		public void setNgayph(int ngayph) {
			this.ngayph = ngayph;
		}
		public String toString() {
	        return "Newspaper{" +
	                "dayIssue=" + ngayph +
	                ", id='" + id + '\'' +
	                ", nxb='" + nxb + '\'' +
	                ", number='" + number + '\'' +
	                '}';
	    }

		public void xuat() {
			System.out.printf(" %10s %15s %15d %15s %15d \n"," Ma TL" , " NXB " , " So BanPH" ," NgayPH");
			System.out.printf(" %10s %15s %15d %15d \n",id,nxb,number,ngayph);
		}
	

}
