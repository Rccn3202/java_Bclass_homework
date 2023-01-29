package bookManagement_M;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;




public class Main {
	
	static Scanner sc=new Scanner(System.in);
	//new 연산자로 배열 생성 타입[] 변수=new 타입[길이]
		static Book[] books=new Book[1000];
		
		

	public static void main(String[] args) {
		System.out.println("-----------------------------------------");
		System.out.println("***************도서관리 프로그램*************");
		System.out.println("-----------------------------------------");

		
		//로그인 메소드
		System.out.print("ID: ");
		String id=sc.next();
		System.out.print("PASSWORD: ");
		String password=sc.next();
		boolean login = true;
		while(login) {
		if(id.equals(Librarian.id[0]) && password.equals(Librarian.password[0])) {
			System.out.println("환영");	break;
		} else if(id.equals(Librarian.id[1]) && password.equals(Librarian.password[1])){
			System.out.println("환영");	break;
		} else if(id.equals(Librarian.id[2]) && password.equals(Librarian.password[2])) {
			System.out.println("환영");  break;
		} else {
			login=false;
			System.out.println("틀림");
			System.exit(0);  //강제종료
		}
		}
		
		
	
		
		
		//번호 선택
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1. 검색 | 2. 신규도서추가 | 3. 회원관리 | 4. 미납도서확인");
			System.out.println("5. 주간인기도서 | 6. 행사관리 | 7. 종료 ");
			System.out.println("-----------------------------------------");
			System.out.print("메뉴선택>");
			String menu = sc.nextLine();
			switch(menu) {
			case "1" : search(); break;  //책 찾을 수 없음 까지만
			case "2" : newBook(); break;  //y
			case "3" : memberList(); break;  //n-배열에 책이랑 대출자 이름 저장하고 검색에 이름 걸리면 미납자 출력하면 될듯? 
			case "4" : overdueBook(); break;  //n-배열저장된 정보 중에 오늘날짜 기준 +?-?7 되어있으면 뜨는걸로..
			case "5" : best(); break;  //n-이건 그냥 저장된 목록 보기..
			case "6" : event(); break;  //n-저장된 숫자랑 오늘 날짜 출력해서 일치하면 뜨게 하는 걸로..
			case "0" :check(); break; /////확인용
			case "7" :                  //y
				System.out.println("종료");
				run=false; break;
			default : System.out.println("잘못 입력");
			
			}
		
		}
		
		}// end main
		
	
	
	private static Book search() {
		//1. 검색
		System.out.print("책이름> ");
		String bookName =sc.nextLine();
		
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {  //책 없을 때
				System.out.println("책 찾을 수 없음");break;
			}
			if(books[i].getBookName().equals(bookName)) {
				return books[i];
			}
		}
		return null;
		
		

	}

	private static  void newBook() {
		//2. 신규도서추가
		System.out.println("신규도서 추가");
		System.out.println("-----------");
		
		System.out.print("책이름> ");
		String bookName =sc.nextLine();
		
		System.out.print("저자명> ");
		String author =sc.nextLine();
		
		System.out.print("위치> ");
		String position =sc.nextLine();
		
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {  //배열칸 비어있으면 책 추가
				books[i]=new Book(bookName,author,position);
				System.out.println("도서가 추가되었습니다.");
				break;
				
			}
			}//end for
	}//end method newBook
	
	
	
	private static void check() {   ////*******
		System.out.println("도서목록***그냥 확인용");
		for(int i=0;i<books.length;i++) {
			if(books[i]==null) {
				break;
			}
			
			System.out.println(books[i].getAuthor()+" "+books[i].getAuthor()+" "+books[i].getPosition());
			
		}
	}



	private static void memberList() {
		//3. 회원관리

	}
	private static void overdueBook() {
		//4. 미납도서 확인

	}
	private static void best() {
		//5.주간인기도서

	}
	private static void event() {
		//6.  행사관리
		System.out.print("날짜입력");
		System.out.print("yyyy");
		int d1=sc.nextInt();
		System.out.print("mm");
		int d2=sc.nextInt();
		System.out.print("dd");
		int d3=sc.nextInt();
		
	
	
		//오늘 날짜와 입력한 날짜 비교
//		LocalDate date1=LocalDate.of(d1, d2, d3);
//		for(int i=0;i<eventArr.length;i++) {
//		if(eventArr[i]==null) {
//			eventArr[i]=date1;
//			
//		}
//		}
//		System.out.println(date1.isEqual(null));
		
		
		

	
	}
}//end class main

//class Librarian {
//	
//	
//	
//}






	
