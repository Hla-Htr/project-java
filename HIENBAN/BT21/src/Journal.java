
public class Journal extends Document{
		private int soph;
		private int thangph;
		
		public Journal(String id , String nxb , int number,int soph , int thangph) {
			super(id,nxb,number);
			this.soph = soph;
			this.thangph = thangph;
		}
		
		public int getSoph() {
			return soph;
		}
		public void setSoph(int soph) {
			this.soph = soph;
		}
		public int getThangph() {
			return thangph;
		}
		public void setThangph(int thangph) {
			this.thangph = thangph;
		}
		public String toString() {
	        return "Journal{" +
	                "issueNumber=" + soph +
	                ", monthIssue=" + thangph +
	                ", id='" + id + '\'' +
	                ", nxb='" + nxb + '\'' +
	                ", number='" + number + '\'' +
	                '}';
	    }

		public void xuat() {
			System.out.printf(" %10s %15s %15d %15s %15d \n"," Ma TL" , " NXB " , " So BanPH" ," So PH" , " ThangPH" );
			System.out.printf(" %10s %15s %15d %15d %15d \n",id,nxb,number,soph,thangph);
		}

}
