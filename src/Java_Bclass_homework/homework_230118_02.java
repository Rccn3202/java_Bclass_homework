package Java_Bclass_homework;

import java.util.Scanner;

public class homework_230118_02 {

	public static void main(String[] args) {
		 boolean flage = true;
		
	      Scanner sc = new Scanner(System.in);
	      while( flage ){
	         System.out.println("-------------------------------------------------");
	         System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ : 4. �м� | 5. ����");
	         System.out.println("-------------------------------------------------");
	         System.out.print("���� > ");
	         String menu = sc.nextLine();
	         
	         switch( menu ) {
	             case "1":  studentCount(); break;
	             case "2":  input();  break;
	             case "3":  jumsulist(); break;
	             case "4":  analyze(); break;
	             case "5": flage=false;  break;
	             default : System.out.println("�޴��� �߸��ƽ��ϴ�(1~5)");
	           }
	      };
	      	
	      
	      
	      
	   }

	   private static void analyze() {
	      // 4.�м�
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
			//���
			
			System.out.println("Average: ");
		
			for(int j=0;j<scoresArray.length;j++) {  
					sum=sum+scoresArray[j];
					cnt++;	
			}
		}
	   private static void jumsulist() {
	      // 3.��������Ʈ
	      
	   }

	   private static void input() {
	      // 2.�����Է�
	      
	   }

	   private static void studentCount() {
	      // 1.�л���
		  int studentNum=sc.nextInt();
		   
	   }
		   
		   
		   
		   
		   
	      
	   }//end main

	

	}//end class


