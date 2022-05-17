package day03;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	/*
	int num =10;
	
	if (num%2 ==0) {
		//조건이 참이면 종속 문장 실행
	System.out.println("짝수");	}
	else {
		//if 조건이 거짓이면 else 실행
		System.out.println("홀수");
	}
	System.out.println("다음 문장들 실행");
	
	
	
	//수를 입력 받아 5의 배수인지 아닌지 구분
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("수를 입력해주세요: ");
	
	int su = input.nextInt();
	
	if (su%5==0)
	{
		System.out.println("5의 배수입니다.");
	}
	else 
	{
		System.out.println("5의 배수가 아닙니다.");
	}
	
	
	//수를 입력받아 0보다 크고 100보다 작으면 정상,
	//아니면 비정상으로 출력
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("수를 입력하세요: ");
	 
	int a = sc.nextInt();
	
	if(a>0 && a<100 )
	{
		System.out.println("정상입니다.");
	}
	else
	{
		System.out.println("비정상입니다");
	}
		
	
	//수를 입력받아 짝수이면서 3의 배수이면 출력, 아님
	
	Scanner in =new Scanner(System.in);
	System.out.println("수를 입력하세요: ");
	
	su = input.nextInt();
	
	if (su%3==0 && su%2==0) //su%6==0 or su%(2*3)==0
	{
System.out.println("3의 배수이면서 짝수");		
}
	else
	{
		System.out.println("아니다");
	}
	*/
	
	
	//수를 입력받아 짝수이면서 3의 배수이면 출력, 아님
	//3의 배수가 아니며,짝수만 해당하면 짝수, 또는 홀수
	//짝수가 아니며, 3의 배수에만 해당하면 3의 배수, 아님
	//해당되지 않으면 해당되지 않음
	Scanner input =new Scanner(System.in);
	System.out.println("수를 입력: ");
	int num = input.nextInt();
	if(num%6==0)
	{
		System.out.println("짝수이며 3의 배수");
	}
	else
	{
		if (num%3==0) {
			System.out.println("3의 배수");
		}else {
			if(num%2==0) {
				System.out.println("짝수");
			}else {System.out.println("벗어낫다");}
			
		}
		
		/*if(num%2==0)
		{
			System.out.println("짝수이며 3의 배수가 아니다");
		}
		if(num%3==0)
		{
			System.out.println("홀수이며 3의 배수가 이다");
		}
		else
		{
			System.out.println("해당되지 않는다");*/
		}
	}
	
	
	
	
	
	
	

}
