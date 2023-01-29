package homework_ch6_20;

import java.util.Scanner;

public class BankApplication {

	private static Scanner sc=new Scanner(System.in); //정보입력 private
	private static Account[] accountArr=new Account[100];

	public static void main(String[] args) {

		boolean run=true;

		while(run) {
			System.out.println("-------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-------------------------");
			System.out.println("선택> ");

			String choose=sc.next();
			switch(choose) {

			case "1" :  createAccount(); break;
			case "2" : accountList(); break;
			case "3" : deposit(); break;
			case "4" : withdraw();	break;
			case "5" : run=false; break;
			default : System.out.println("숫자를 잘못 입력하였습니다"); 

			}//end switch 
		}//end while

		System.out.println("프로그램 종료");	

	} //end main


	private static void withdraw() {
		//4. 출금
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("-----------");	
		System.out.print("계좌번호: ");
		String account=sc.next();
		System.out.print("출금액: ");
		int withdraw = sc.nextInt();

		if(find(account)==null) {
			System.out.println("계좌 없음");
		} else {
			if(withdraw>find(account).getFirst()) { //출금>찾은계좌에 저장된 초기값
				System.out.println("잔액부족");
			}else{
				find(account).setFirst(find(account).getFirst()-withdraw);
				System.out.println("결과: 출금이 성공되었습니다.");
			}	
		}
	}

	private static void deposit() {
		//3. 예금
		System.out.println("----------");
		System.out.println("예금");
		System.out.println("-----------");
		System.out.print("계좌번호: ");
		String account=sc.next();
		System.out.print("예금액: ");
		int deposit = sc.nextInt();

		if(find(account)==null) {   //find에서 계좌 못찾음
			System.out.println("계좌 없음");
		}else {
			find(account).setFirst(find(account).getFirst()+deposit);
			//find메소드에서 계좌 찾음-초기금액first에 찾은계좌의 초기금액+입금금액 넣기
			System.out.println("결과: 입금이 성공되었습니다.");
		}

	}

	private static Account find(String account) {
		//배열에서 계좌 찾기
		for(int i=0;i<accountArr.length;i++) {
			if(accountArr [i]==null) { break; } //찾는값 없으면 실행 중지

			if(accountArr[i].getAccount().equals(account)) {
				return accountArr[i];
			}
		}
		return null; }

	private static void accountList() {
		//2. 계좌목록보기
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("-----------");

		for(int i=0;i<accountArr.length;i++) {		
			if(accountArr[i] ==null) {  //계좌없으면 나간다
				break;
			}
			System.out.println(accountArr[i].getAccount()+"   "+accountArr[i].getName()+"   "+accountArr[i].getFirst());
		}

	}

	private static void createAccount() {  //1. 계좌생성
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("-----------");

		System.out.print("계좌번호: ");
		String account=sc.next();

		System.out.println("계좌주: ");
		String name=sc.next();

		System.out.println("초기입금액: ");
		int first=sc.nextInt();

		for(int i=0;i<accountArr.length; i++) {
			if(accountArr[i]==null) {     //배열칸이 비어있으면 자료넣기
				accountArr[i]=new Account(account, name, first);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}//end for
	}//end main
}//end class
