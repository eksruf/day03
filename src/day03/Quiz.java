package day03;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	
	/*
����1
��â�� ���� Ű������ ������� ���� �������� �Ѵ�
170�̻��� 4��°�� 160�̻��� 3��° �� 150�̻��� 2��° ��150�̸��� 1��° �ٷ� ����ϼ���

*/
/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("Ű�� �Է��ϼ���: ");
	
	double height = input.nextDouble();
	
	if (height>=170) {
		System.out.println("4��° ��");
	}else if (height>=160) {
		System.out.println("3��° ��");
	}else if(height>=150) {
		System.out.println("2��° ��");
	}else {
		System.out.println("1��° ��");
	}
	

	
	*/
	
	/*
	����2
	���� ���� ���� ������ �Է��Ͽ� ��� 90�̻��̸� A 80�̻��̸� B 70�̻��̸�C
	�� �̿ܿ��� D�� ����ϼ���
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	int kor, eng, math;
	
	System.out.println("���� ������ �Է��ϼ���: ");
	kor=input.nextInt();
	
	System.out.println("���� ������ �Է��ϼ���: ");
	eng=input.nextInt();
	
	System.out.println("���� ������ �Է��ϼ���: ");
	math=input.nextInt();
	
	double avg = (kor+eng+math)/3;
	
	if(avg>=90) {
		System.out.println("A");
	}else if (avg>=80) {
		System.out.println("B");
	}else if (avg>=70) {
		System.out.println("C");
	}else {
		System.out.println("D");
	}
	
	*/
	
	/*
	 ��Ϲ���1
	 ���� ���� ���� ������ �Է¹ް� ����� 80�� �̻��̸� �հ��� ����ϼ���
	 -�� �� �����̶� 60�� �̸��� �� ���հ��� ����ϼ���
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	int kor, eng, math;
	
	System.out.println("���� ������ �Է��ϼ���: ");
	kor= input.nextInt();
	System.out.println("���� ������ �Է��ϼ���: ");
	eng = input.nextInt();
	System.out.println("���� ������ �Է��ϼ���: ");
	math = input.nextInt();
	
	double avg = (kor+eng+math)/3;
	
	if(avg<80) {
		System.out.println("���հ�");
	}else if(avg>=80) {
		if(kor>=60 && eng>=60 && math>=60) {
			System.out.println("�հ�");
			}else if(kor<60) {
		System.out.println("���հ�");
		}else if(eng<60) {
		System.out.println("���հ�");
		}else if(math<60) {
		System.out.println("���հ�");
		}
	}
	*/
	
	/*
	 ��� ����2
	 ���̸� �Է¹޾Ƽ� ���ΰ� �̼����ڷ� �����ϼ���
	 -������ ��� 20 ~39 û��, �� �̻��̸� ��������� �����Ѵ�.
	 -�̼����� ��쿡�� 14~19���� û�ҳ�, 14�� �̸��� ��̷� �����Ѵ�
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("���̸� �Է��� �ּ���: ");
	
	int age = input.nextInt();
	
	if (age>=20) {
		if(age>=40) {
			System.out.println("������Դϴ�.");
		}else if(age>=20) {
			System.out.println("û���Դϴ�.");
		}
	}else
	{
		if(age>=14) {
			System.out.println("û�ҳ��Դϴ�.");
		}else {
			System.out.println("����Դϴ�.");
		}
	}
	
	*/
	
	/*
	 ��������1
	 �� �б��� ���� 6���� �ִ�. �� �л� ���� �Է��ϸ�, �� �� �ִ� �ο����� ����ϰ�,
	  ���� �л� ���� �� ä�����ٸ� "�б� ����"
	  �� ä������ ���ߴٸ� "�б��� �����մϴ�. ���� �л��� n���Դϴ�"��� ������ִ� ���α׷��� �ۼ��Ͻÿ�
	  -��� ���� �ο� ���� ���ƾ� �Ѵ�.
	 */
	/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("�� �л����� �Է����ּ���: ");
	int all= input.nextInt();
	int max = all/6;
	
	if(all%6==0) {
		System.out.println("�б��� �ִ� �ο���:"+max+", �б� ����");
	}else if(all%6!=0){
		System.out.println("�б��� �ִ� �ο���: "+max);
		System.out.println("�б��� �����մϴ�.");
		System.out.println("���� �л���"+all%6+"�Դϴ�.");
	}
	System.out.println("");
	*/
	
	/*
	 ��������2
	 ���� ��� ������ 70�� ���϶�� ���� ������ ���� �Ѵ�.
	 ���� ���� 2���� �Է��ϰ� 3��° ������ �� �� �̻��� �޾ƾ� ���� ������ ���� ������ 
	 ����� �ִ� ���α׷��� �ۼ��Ͻÿ�.
	 -3��° ���� ����� 100���� �Ѿ�� ��� ������ 70�� �ʰ��� ��� "���� ���� Ȯ��"�� ����Ͻÿ�
	 */
	
	/*
	 Scanner input= new Scanner(System.in);
	 
	 System.out.println("���� ���� 2���� �Է��� �ּ���");
	 
	 int test1, test2, test3;
	 test1= input.nextInt();
	 test2= input.nextInt();
	 
	 test3=0;
	 
	 int total = test1+test2+test3;
	 test3=210-total;
	 
	 if(test3>100) {
		 System.out.println("������� Ȯ���Դϴ�.");
	 }else 
	 {
		 System.out.println(test3+"�� �̻��̾�� �մϴ�.");
	 }
	 
	
	*/
	/*
	 5�� ����1
	 k���ڿ����� �ǰ��� ���� ���ִ� ������������ �丮�� �����ϼ� ����� �ΰ����� ������ �����Ϸ��� �Ѵ�.
	 �ΰ����� ������ ����ϴ� ����� ������ ���� ���� ���� ��Ḧ �ΰ����� ���쿡 ������ �ȴ�.
	 �׷��� �ΰ����� ������ ���챸�̰� ������ �ð��� �� ������ �ڵ������� ����Ѵ�.
	 ���� k������ �ΰ����� ���� �ո鿡�� ����ڿ��� ������������ �丮�� ������ �ð��� �˷��ִ� ������ �ð谡 �ִ�.
	 �����������̸� �����ϴ� �ð��� ���챸�̸� �ϴµ� �ʿ��� �ð��� �д����� �־����� ��,
	 ���� ���̰� ������ �ð��� ��ꤤ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 
	�Է�
	A����ð�(��)
	B����ð�(��)
	time�丮�� �ʿ��� �ð�(��)
	
	 */
	/*
	Scanner input =new Scanner (System.in);
	 System.out.println("���� �ð��� �����ּ���");
	 System.out.print("��: ");
	 int a = input.nextInt();
	 System.out.print("��: ");
	 int b = input.nextInt();
	 
	 System.out.println("�丮�� �ʿ��� �ð�(��)�� �����ּ���: ");
	 int time =input.nextInt();
	 
	 int time_a=time/60;
	 int time_b=time%60;
	 
	 if(a+time_a>=24) {
		 a=(a+time_a)-24;
	 }else {
		 a=a+time_a ;
	 }
	if(b+time_b>=60) {
		a++;
		b=(b+time_b)-60;
	}else {
		b+=time_b;
	}
	
	
	System.out.println("������ �ð���"+a+"��"+b+"��");
	
	*/
	
	/*
	 5�� ���� 2
	 1�������� 6�������� ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.
	 
	 ���� ���� 3���� ������ 10,000�� +(������)*1,000���� ����� �ް� �ȴ�.
	 ���� ���� 2���� ������ ��쿡�� 1,000��+(������)*100���� ����� �ް� �ȴ�.
	 ��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)*100���� ����� �ް� �ȴ�.
	 ���� ��� , 3���� ���� 3,3,6�� �־����� ����� 1,000��+3*100���� ���Ǿ� 1,300���� �ްԵȴ�.
	 �� 3���� ���� 2,2,2�� �־����� 10,000+2*1,000���� ���Ǿ� 12,000���� �ް� �ȴ�.
	 3���� ���� 6,2,5�� �־����� �� �� ���� ū ���� 6�̹Ƿ� 6*100���� ���Ǿ� 600���� ������� �ްԵȴ�.
	 
	 3���� �ֻ����� ���� ���� �־����� , ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
	 */
	
	/*
	
	Scanner input =new Scanner(System.in);
	
	System.out.println("���� �ֻ����� ���� �Է����ּ���:");
	int a = input.nextInt();
	
	System.out.println("���� �ֻ����� ���� �Է����ּ���:");
	int b = input.nextInt();
	
	System.out.println("���� �ֻ����� ���� �Է����ּ���:");
	int c = input.nextInt();
	
	if (a==c) {
		if (a==b) {
			System.out.println("�����"+(10000+a*1000));
		}else {
			System.out.println("�����"+(1000+a*100));
		}
	}else {
		if(a!=b) {
			if(b!=c) {
				if(a<b) {
					a=b;
				}if(b<c){
					b=c;
				}
			System.out.println("�����"+(b*100));
			}
		}else {
			System.out.println("�����"+(1000+a*100));
		
		}
	}
	
	
	//111 112 121 122 123
	
	
	*/
	
	
	
	
	
	/*
	 5�� ����3
	 ���� ���� ���� ������ �Է��ϰ�
	 ����� 90�̻� a 80�̻� b 70�̻� c 70�̸� f
	 
	 */
	/*
	Scanner input = new Scanner (System.in);
	
	System.out.println("����, ����, ���� ������ ���ʷ� �Է��ϼ���");
	int kor, eng, math;
	
	kor=input.nextInt();
	eng=input.nextInt();
	math=input.nextInt();
	
	double avg = (kor+eng+math)/3;
	
	if (avg>=90) {
		System.out.println("A");
	}else if (avg>=80) {
		System.out.println("B");
	}else if (avg>=70) {
		System.out.println("C");
	}else {
		System.out.println("F");
	}
	
	*/
	
	/*
	 5�� ����4
	 ���� �Է¹޾� ��, ����,����, �ܿ� ���
	 */
	/*
	Scanner input= new Scanner(System.in);
	System.out.println("���� �Է�: ");
	int m = input.nextInt();
	 
	if(m>=3 && m<=5) {
		System.out.println("��");
	}else if(m>5 && m<=8) {
		System.out.println("����");
	}else if(m>8 && m<=11) {
		System.out.println("����");
		
	}else
		System.out.println("�ܿ�");
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
