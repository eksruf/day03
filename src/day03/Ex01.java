package day03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	/*
	int num =10;
	
	if (num%2 ==0) {
		//������ ���̸� ���� ���� ����
	System.out.println("¦��");	}
	else {
		//if ������ �����̸� else ����
		System.out.println("Ȧ��");
	}
	System.out.println("���� ����� ����");
	
	
	
	//���� �Է� �޾� 5�� ������� �ƴ��� ����
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("���� �Է����ּ���: ");
	
	int su = input.nextInt();
	
	if (su%5==0)
	{
		System.out.println("5�� ����Դϴ�.");
	}
	else 
	{
		System.out.println("5�� ����� �ƴմϴ�.");
	}
	
	
	//���� �Է¹޾� 0���� ũ�� 100���� ������ ����,
	//�ƴϸ� ���������� ���
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("���� �Է��ϼ���: ");
	 
	int a = sc.nextInt();
	
	if(a>0 && a<100 )
	{
		System.out.println("�����Դϴ�.");
	}
	else
	{
		System.out.println("�������Դϴ�");
	}
		
	
	//���� �Է¹޾� ¦���̸鼭 3�� ����̸� ���, �ƴ�
	
	Scanner in =new Scanner(System.in);
	System.out.println("���� �Է��ϼ���: ");
	
	su = input.nextInt();
	
	if (su%3==0 && su%2==0) //su%6==0 or su%(2*3)==0
	{
System.out.println("3�� ����̸鼭 ¦��");		
}
	else
	{
		System.out.println("�ƴϴ�");
	}
	*/
	
	
	//���� �Է¹޾� ¦���̸鼭 3�� ����̸� ���, �ƴ�
	//3�� ����� �ƴϸ�,¦���� �ش��ϸ� ¦��, �Ǵ� Ȧ��
	//¦���� �ƴϸ�, 3�� ������� �ش��ϸ� 3�� ���, �ƴ�
	//�ش���� ������ �ش���� ����
	Scanner input =new Scanner(System.in);
	System.out.println("���� �Է�: ");
	int num = input.nextInt();
	if(num%6==0)
	{
		System.out.println("¦���̸� 3�� ���");
	}
	else
	{
		if (num%3==0) {
			System.out.println("3�� ���");
		}else {
			if(num%2==0) {
				System.out.println("¦��");
			}else {System.out.println("�����");}
			
		}
		
		/*if(num%2==0)
		{
			System.out.println("¦���̸� 3�� ����� �ƴϴ�");
		}
		if(num%3==0)
		{
			System.out.println("Ȧ���̸� 3�� ����� �̴�");
		}
		else
		{
			System.out.println("�ش���� �ʴ´�");*/
		}
	}
	
	
	
	
	
	
	

}
