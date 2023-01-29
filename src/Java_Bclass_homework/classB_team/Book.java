package bookManagement_M;

public class Book {
	//필드
		String bookName; //책이름
		String author;  //저자
		String position;  //위치
		
		//생성자
		Book(String bookName, String author, String position){
			this.bookName=bookName;
			this.author=author;
			this.position=position;
		}

		

		//메소드
		public String getBookName() { return bookName; }
		public void setBookName(String bookName) { this.bookName = bookName; }
		public String getAuthor() { return author; }
		public void setAuthor(String author) { this.author = author; }
		public String getPosition() { return position; }
		public void setPosition(String position) { this.position = position; }
	}




