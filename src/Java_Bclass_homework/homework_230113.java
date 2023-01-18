package Java_Bclass_homework;

import java.util.Scanner;

public class homework_230113 {
	
	
	
	// 타자치는 메소드 만들기
	//계산하는 메소드 만들기
	
	//타자 메소드
public static void inputMethod(Banchan p) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("kind> ");
		p.kind=sc.next();                      //입력한 값을 kind에 담음, p가 kind의 주소를 아니까 호출
		System.out.println("make> ");
		p.make=sc.nextInt();
		System.out.println("sale> ");
		p.sale=sc.nextInt();
		
	}//end inputMethod

//계산 메소드
public static void int getlast(int sale, int make ) {
	make-sale
} return; 
//최대최소 메소드
public static void int per(int sale, int make) {
	result=make/sale;
			


}return result;

if (best1>=best2 && best1>=best3) {
	max=best1;
} else if (best2>=best1 && best2>=best3) {
	max=best2;
} else {
	max=best3;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void last(int make, int sale) {
		System.out.println(make-sale);
	}

	
	public static void main(String[] args) {  //메인 메소드
		// 조별로
		/*반찬가게
		종류  만듯갯수   판매갯수  남은갯수
		조림류  10         5            5
		국        10        3            2
		샐러드  10           

		제일 잘 팔린 종류:
		잘 안팔린 종류:
		(잘 팔린 구할 때 백분율 5/10*100)

		프로그램 정책 :기준을 정하는 것
		만든 갯수는 모두 10개로 가정한다

		객체생성=*/
		
		
		Banchan p=new Banchan(); 
		input(p); //입력담당 호출, static void input()으로 간다
		Banchan p1=new Banchan(); 
		input(p1);
		Banchan p2=new Banchan(); 
		input(p2);
		
		//남은갯수 구하기
		int getlast=Banchan.last(Banchan.make,Banchan.sale);
		
		
		System.out.println("side dish");
		System.out.println("-------------");
		System.out.println("kind"+" "+"make"+" "+"sale"+" "+"last");
		System.out.println(p.kind+p.make+p.sale+p.getlast);
		System.out.println(p1.kind+p1.make+p1.sale+p1.getlast);
		System.out.println(p2.kind+p2.make+p2.sale+p2.getlast);
		
		
		
		
		
	}// 메인메소드 끝
		
	
	
		static void input(Banchan p) {   //입력담당 메소드 
			
	
			
			Scanner sc= new Scanner(System.in);
			System.out.println("kind> ");
			p.kind=sc.next();                      //입력한 값을 kind에 담음, p가 kind의 주소를 아니까 호출
			System.out.println("make> ");
			p.make=sc.nextInt();
			System.out.println("sale> ");
			p.sale=sc.nextInt();
			System.out.println("last> "+Banchan.getlast);
			

			
		
			
		} //입력 메소드 끝
		
		
		
		
		
		
		

 
} //end class

class Banchan{
	
	public String getlast;
	String kind; //종류
	String best; //제일 잘 팔린 종류
	String worst; //잘 안팔린 종류
	int make; //만든갯수
	int sale; //판매갯수
	int max;
	int min;
	
	String getkind(String kind) {
		return kind;
	} //종류 입력받기
	
	int getmake(int make) {
		return make;
	} //만든갯수 구하기
	int getsale(int sale) {
		return sale;
	}; //판매갯수 구하기
	int last(int make, int sale) {
		return make-sale;
	} //남은갯수 구하기
	String best(int make, int sale) {
		int a=(sale/make)*100;
		
		if (p.a>=p.a1 && p.a>=p.a2) {
			max=p.a;
		} else if(p.a1>=p.a && p.a1>=p.a2) {
			max=p.a1;
		} else {
			max=p.a2;
		}
		
	}
	
	
	
	
} //반찬 클래스 끝
