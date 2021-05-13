import java.util.ArrayList;
import java.util.List;

public class ManagerDocument {
		List<Document> documents;
	
		public ManagerDocument() {
			this.documents = new ArrayList<>();
		}
		public void addDocument(Document d) {
			this.documents.add(d);
		}
		public boolean deleteDocument(String id) {
			Document doc = this.documents.stream().filter(d -> d.getId().equals(id)).findFirst().orElse(null);
			if(doc == null) {
				return false;
			}
			this.documents.remove(doc);
			this.documents.forEach(d -> System.out.println(d.toString()));
			return true;
		}
		public void showinfor() {
			this.documents.forEach(documents -> System.out.println(documents.toString()));
		}
		public void showbyBook() {
			this.documents.stream().filter(doc -> doc instanceof Book).forEach(doc -> System.out.println(doc.toString()));
			
		}
		public void showbyJournal() {
			this.documents.stream().filter(doc -> doc instanceof Journal).forEach(doc -> System.out.println(doc.toString()));
		}
		public void showbyNewspaper() {
			this.documents.stream().filter(doc -> doc instanceof Newspaper).forEach(doc -> System.out.println(doc.toString()));
		}
}
