package Java_Bclass_homework;

import java.util.Scanner;

public class homework_230113 {
	
	
	
	// Ÿ��ġ�� �޼ҵ� �����
	//����ϴ� �޼ҵ� �����
	
	//Ÿ�� �޼ҵ�
public static void inputMethod(Banchan p) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("kind> ");
		p.kind=sc.next();                      //�Է��� ���� kind�� ����, p�� kind�� �ּҸ� �ƴϱ� ȣ��
		System.out.println("make> ");
		p.make=sc.nextInt();
		System.out.println("sale> ");
		p.sale=sc.nextInt();
		
	}//end inputMethod

//��� �޼ҵ�
public static void int getlast(int sale, int make ) {
	make-sale
} return; 
//�ִ��ּ� �޼ҵ�
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

	
	public static void main(String[] args) {  //���� �޼ҵ�
		// ������
		/*��������
		����  ������   �ǸŰ���  ��������
		������  10         5            5
		��        10        3            2
		������  10           

		���� �� �ȸ� ����:
		�� ���ȸ� ����:
		(�� �ȸ� ���� �� ����� 5/10*100)

		���α׷� ��å :������ ���ϴ� ��
		���� ������ ��� 10���� �����Ѵ�

		��ü����=*/
		
		
		Banchan p=new Banchan(); 
		input(p); //�Է´�� ȣ��, static void input()���� ����
		Banchan p1=new Banchan(); 
		input(p1);
		Banchan p2=new Banchan(); 
		input(p2);
		
		//�������� ���ϱ�
		int getlast=Banchan.last(Banchan.make,Banchan.sale);
		
		
		System.out.println("side dish");
		System.out.println("-------------");
		System.out.println("kind"+" "+"make"+" "+"sale"+" "+"last");
		System.out.println(p.kind+p.make+p.sale+p.getlast);
		System.out.println(p1.kind+p1.make+p1.sale+p1.getlast);
		System.out.println(p2.kind+p2.make+p2.sale+p2.getlast);
		
		
		
		
		
	}// ���θ޼ҵ� ��
		
	
	
		static void input(Banchan p) {   //�Է´�� �޼ҵ� 
			
	
			
			Scanner sc= new Scanner(System.in);
			System.out.println("kind> ");
			p.kind=sc.next();                      //�Է��� ���� kind�� ����, p�� kind�� �ּҸ� �ƴϱ� ȣ��
			System.out.println("make> ");
			p.make=sc.nextInt();
			System.out.println("sale> ");
			p.sale=sc.nextInt();
			System.out.println("last> "+Banchan.getlast);
			

			
		
			
		} //�Է� �޼ҵ� ��
		
		
		
		
		
		
		

 
} //end class

class Banchan{
	
	public String getlast;
	String kind; //����
	String best; //���� �� �ȸ� ����
	String worst; //�� ���ȸ� ����
	int make; //���簹��
	int sale; //�ǸŰ���
	int max;
	int min;
	
	String getkind(String kind) {
		return kind;
	} //���� �Է¹ޱ�
	
	int getmake(int make) {
		return make;
	} //���簹�� ���ϱ�
	int getsale(int sale) {
		return sale;
	}; //�ǸŰ��� ���ϱ�
	int last(int make, int sale) {
		return make-sale;
	} //�������� ���ϱ�
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
	
	
	
	
} //���� Ŭ���� ��
