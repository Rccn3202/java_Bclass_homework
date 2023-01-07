package Java_Bclass_homework;

import java.util.Scanner;

public class homework_23016 {

	public static void main(String[] args) {
		
		//문제1. 숫자 변수에 50을 입력하고 25이상이면 "포인트대상" 아니면 "포인트 대상이 아닙니다"라고 출력하기
		//숫자변수 int, 삼항연산자 이용
		int var1 = 50; //숫자변수에 50 입력
		System.out.println((var1>=25)? "Eligible for point payment":"Ineligible for point payment");

		//문제2. 문자형 변수에 "자바"라고 입력하고 자바가 아니면 "B교실,C교실입니다." 자바이면 "A교실입니다"라고 출력하기
		//문자형 변수 입력, 삼항연산자 이용, 결과값 출력
		String var="java";
		System.out.println(var.equals("java")? "A Class":"BnC Class");

		//문제3. 숫자 2개를 입력 받아서 큰 숫자를 출력하기 삼항연산자 사용하기
		//숫자변수 int, Scanner 클래스로 콘솔에 입력, 삼항연산자 이용
		int num1,num2; //숫자 변수 num1,num2 선언
		Scanner q3 = new Scanner(System.in); //콘솔에서 숫자 입력 받을 q3객체 생성
		
		System.out.println("write first number ");
		num1 = q3.nextInt(); //q3 객체에 입력받은 숫자를 num1에 저장
		System.out.println("write second number ");
		num2 = q3.nextInt();
		System.out.printf("%d ",(num1>num2)? num1:num2); //(삼항연산자)%d(십진수)로 나타내기, num1>num2? 맞으면 : 앞의 것 출력

		
		System.out.println(" "); //이건 그냥 문제3과 문제4 줄 분리하려고 넣음
		
		
		//문제4. 숫자3개를 입력받아서 작은 숫자를 출력하기 삼항연산자 사용하기
		//숫자변수 int, *int result1를 추가로 규정해서 이용*, 삼항연산자
		int num3,num4,num5; //숫자 변수 선언
		int result1; //1차 비교
		
		Scanner q4 = new Scanner(System.in); //콘솔에서 숫자 입력 받을 sc객체 생성
		
		System.out.println("write first number ");
		num3 = q4.nextInt(); //sc 객체에 입력받은 숫자를 num1에 저장
		System.out.println("write second number ");
		num4 = q4.nextInt();
		System.out.println("wirte third number ");
		num5 = q4.nextInt();

		result1 = (num3>num4)? num3:num4; //n3과 n4 비교 후 저장
		int result2 = (num5>result1)? num5:result1; //result1과 num5 비교, 저장
		System.out.println(result2); //결과 출력
		

	}

}


/*
 사용한 함수 정리
 
printf() : 함수의 f는 formatted의 약자이며, 서식화된 출력을 지원한다는 의미
%d : 십진수를 영어로한 decimal의 약어
*기본적으로 객체 생성하는 방법 : 클래스이름 객체이름 = new 클래스이름()
**Scanner는 클래스이다.
Scanner q3 = new Scanner(System.in); : q3이라는 Scanner 객체 생성
String 000 = "~~" : 문자열 변수 입력
int 000 = "~~" : 숫자 변수 입력


오류 정리

*/