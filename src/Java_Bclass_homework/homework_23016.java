package Java_Bclass_homework;

import java.util.Scanner;

public class homework_23016 {

	public static void main(String[] args) {
		
		//����1. ���� ������ 50�� �Է��ϰ� 25�̻��̸� "����Ʈ���" �ƴϸ� "����Ʈ ����� �ƴմϴ�"��� ����ϱ�
		//���ں��� int, ���׿����� �̿�
		int var1 = 50; //���ں����� 50 �Է�
		System.out.println((var1>=25)? "Eligible for point payment":"Ineligible for point payment");

		//����2. ������ ������ "�ڹ�"��� �Է��ϰ� �ڹٰ� �ƴϸ� "B����,C�����Դϴ�." �ڹ��̸� "A�����Դϴ�"��� ����ϱ�
		//������ ���� �Է�, ���׿����� �̿�, ����� ���
		String var="java";
		System.out.println(var.equals("java")? "A Class":"BnC Class");

		//����3. ���� 2���� �Է� �޾Ƽ� ū ���ڸ� ����ϱ� ���׿����� ����ϱ�
		//���ں��� int, Scanner Ŭ������ �ֿܼ� �Է�, ���׿����� �̿�
		int num1,num2; //���� ���� num1,num2 ����
		Scanner q3 = new Scanner(System.in); //�ֿܼ��� ���� �Է� ���� q3��ü ����
		
		System.out.println("write first number ");
		num1 = q3.nextInt(); //q3 ��ü�� �Է¹��� ���ڸ� num1�� ����
		System.out.println("write second number ");
		num2 = q3.nextInt();
		System.out.printf("%d ",(num1>num2)? num1:num2); //(���׿�����)%d(������)�� ��Ÿ����, num1>num2? ������ : ���� �� ���

		
		System.out.println(" "); //�̰� �׳� ����3�� ����4 �� �и��Ϸ��� ����
		
		
		//����4. ����3���� �Է¹޾Ƽ� ���� ���ڸ� ����ϱ� ���׿����� ����ϱ�
		//���ں��� int, *int result1�� �߰��� �����ؼ� �̿�*, ���׿�����
		int num3,num4,num5; //���� ���� ����
		int result1; //1�� ��
		
		Scanner q4 = new Scanner(System.in); //�ֿܼ��� ���� �Է� ���� sc��ü ����
		
		System.out.println("write first number ");
		num3 = q4.nextInt(); //sc ��ü�� �Է¹��� ���ڸ� num1�� ����
		System.out.println("write second number ");
		num4 = q4.nextInt();
		System.out.println("wirte third number ");
		num5 = q4.nextInt();

		result1 = (num3>num4)? num3:num4; //n3�� n4 �� �� ����
		int result2 = (num5>result1)? num5:result1; //result1�� num5 ��, ����
		System.out.println(result2); //��� ���
		

	}

}


/*
 ����� �Լ� ����
 
printf() : �Լ��� f�� formatted�� �����̸�, ����ȭ�� ����� �����Ѵٴ� �ǹ�
%d : �������� ������� decimal�� ���
*�⺻������ ��ü �����ϴ� ��� : Ŭ�����̸� ��ü�̸� = new Ŭ�����̸�()
**Scanner�� Ŭ�����̴�.
Scanner q3 = new Scanner(System.in); : q3�̶�� Scanner ��ü ����
String 000 = "~~" : ���ڿ� ���� �Է�
int 000 = "~~" : ���� ���� �Է�


���� ����

*/