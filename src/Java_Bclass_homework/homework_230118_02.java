package Java_Bclass_homework;

import java.util.Scanner;

public class homework_230118_02 {

	public static void main(String[] args) {
		 boolean flage = true;
		
	      Scanner sc = new Scanner(System.in);
	      while( flage ){
	         System.out.println("-------------------------------------------------");
	         System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 : 4. 분석 | 5. 종료");
	         System.out.println("-------------------------------------------------");
	         System.out.print("선택 > ");
	         String menu = sc.nextLine();
	         
	         switch( menu ) {
	             case "1":  studentCount(); break;
	             case "2":  input();  break;
	             case "3":  jumsulist(); break;
	             case "4":  analyze(); break;
	             case "5": flage=false;  break;
	             default : System.out.println("메뉴가 잘못됐습니다(1~5)");
	           }
	      };
	      	
	      
	      
	      
	   }

	   private static void analyze() {
	      // 4.분석
		   int studentNum=0;
			int[] scoresArray=new int[studentNum];
			int max=0;
			int cnt=0;
			int sum=0;
		   for(int i=0;i<scoresArray.length;i++) {
				if(max<=scoresArray[i]) {  
					max=scoresArray[i];}
				System.out.println("max"+ max);
	   }
			//평균
			
			System.out.println("Average: ");
		
			for(int j=0;j<scoresArray.length;j++) {  
					sum=sum+scoresArray[j];
					cnt++;	
			}
		}
	   private static void jumsulist() {
	      // 3.점수리스트
	      
	   }

	   private static void input() {
	      // 2.점수입력
	      
	   }

	   private static void studentCount() {
	      // 1.학생수
		  int studentNum=sc.nextInt();
		   
	   }
		   
		   
		   
		   
		   
	      
	   }//end main

	

	}//end class


