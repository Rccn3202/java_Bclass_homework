package Java_Bclass_homework;

import java.lang.reflect.Array;
import java.util.Scanner;

public class homework_230118 {

	public static void main(String[] args) {
		// ch5 연습문제 9 
				
				boolean b=true;
				Scanner sc=new Scanner(System.in);
				
				
				
				while(b) {		
				System.out.println("-------------------------------------------------");
				System.out.println("1.StudentNum |2.Scores |3.List |4.Analysis|5.End ");
				System.out.println("-------------------------------------------------");
				System.out.println("choose> ");
				String choose=sc.next();
				
				int studentNum=0;
				int[] scoresArray=new int[studentNum];
				int max=0;
				int cnt=0;
				int sum=0;
				
				if(choose.equals("1")) {				
					System.out.print("StudentNum> "); 
					studentNum=sc.nextInt(); break;				//학생수 입력
				} else if(choose.equals("2")) {
					System.out.print("Choose> 2") ; 
					for (int i=0;i<=scoresArray.length;i++) 	//점수 입력, 배열
						System.out.println("scores["+i+"]"+"> "); break;
					//	scoresArray[i]=sc.nextInt();
				} else if(choose.equals("3")) {				//입력된 점수 출력
					for(int i=0;i<scoresArray.length;i++) 
						System.out.println("scores["+i+"]"+": "+scoresArray[i]);  break;
				} else if(choose.equals("4")) {				//최고점수, 평균점수
						
					
					System.out.println("Best: ");
					//베스트
					for(int i=0;i<scoresArray.length;i++) {
						if(max<=scoresArray[i]) {  
							max=scoresArray[i];}
						System.out.println("max"+ max);
						//평균
						
					System.out.println("Average: ");
				
					for(int j=0;j<scoresArray.length;j++) {  
							sum=sum+scoresArray[j];
							cnt++;	
					}
				}
					System.out.println("평균은 "+(sum/cnt));
				
				}break;
				
				}//end while
				
				
					
				
				
				

				
			} //end main
	
	/*void Cal () {				//최고점수, 평균점수
		int Best=0;
		int Average=0;
		int array=0;
		int sum=0;
		int cnt=0;
		
		//베스트
		for(int i=0;i<scoresArray.length;i++) {
			if(max<=array[i]) {  
				max=array[i];}
		}
		
		
		 int[] array = new int[10]; //배열 크기 10으로 지정한다.
	        System.out.println("10개의 랜덤한 수");
	        Scanner s = new Scanner(System.in); //Scanner 선언
	        
	        for(int i=0; i< array.length; i++) {
	            System.out.print((i+1)+"번째 수:");
	            array[i]=s.nextInt();
	        }
	        System.out.println("array="+Arrays.toString(array));
	        
	        Arrays.sort(array);
	        int max= array[array.length-1];
	        int min= array[0];
	        
	        System.out.println("최소값:"+ min);
	        System.out.println("최대값:"+ max);
	        
	        
	        
		
		//평균점수
		
		for(int i=0;i<array[0].length;i++) {   //행 반복하는 for   i=0,1,2
			for(int k=0; k<array[i].length;k++) {	//열 반복하는 for i=0d일 떄, 0열 1열 /i=1일 때 0 1 2열 /i=2일 때 0 2 3 4
				sum=sum+array[i][k];
				cnt++;	
			}
		}
		
	}*/


		} //end class


