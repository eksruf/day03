package day03;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
	
	/*
문제1
합창을 위해 키순으로 사람들을 줄을 나누려고 한다
170이상은 4번째줄 160이상은 3번째 줄 150이상은 2번째 줄150미만은 1번째 줄로 출력하세요

*/
/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("키를 입력하세요: ");
	
	double height = input.nextDouble();
	
	if (height>=170) {
		System.out.println("4번째 줄");
	}else if (height>=160) {
		System.out.println("3번째 줄");
	}else if(height>=150) {
		System.out.println("2번째 줄");
	}else {
		System.out.println("1번째 줄");
	}
	

	
	*/
	
	/*
	문제2
	국어 영어 수학 점수를 입력하여 평균 90이상이면 A 80이상이면 B 70이상이면C
	그 이외에는 D를 출력하세요
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	int kor, eng, math;
	
	System.out.println("국어 점수를 입력하세요: ");
	kor=input.nextInt();
	
	System.out.println("영어 점수를 입력하세요: ");
	eng=input.nextInt();
	
	System.out.println("수학 점수를 입력하세요: ");
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
	 언니문제1
	 국어 영어 수학 점수를 입력받고 평균이 80점 이상이면 합격을 출력하세요
	 -단 한 과목이라도 60점 미만일 시 불합격을 출력하세요
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	int kor, eng, math;
	
	System.out.println("국어 점수를 입력하세요: ");
	kor= input.nextInt();
	System.out.println("영어 점수를 입력하세요: ");
	eng = input.nextInt();
	System.out.println("수학 점수를 입력하세요: ");
	math = input.nextInt();
	
	double avg = (kor+eng+math)/3;
	
	if(avg<80) {
		System.out.println("불합격");
	}else if(avg>=80) {
		if(kor>=60 && eng>=60 && math>=60) {
			System.out.println("합격");
			}else if(kor<60) {
		System.out.println("불합격");
		}else if(eng<60) {
		System.out.println("불합격");
		}else if(math<60) {
		System.out.println("불합격");
		}
	}
	*/
	
	/*
	 언니 문제2
	 나이를 입력받아서 성인과 미성년자로 구분하세요
	 -성인인 경우 20 ~39 청년, 이 이상이면 중장년으로 구분한다.
	 -미성년인 경우에는 14~19세는 청소년, 14세 미만은 어린이로 구분한다
	 */
	
	/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("나이를 입력해 주세요: ");
	
	int age = input.nextInt();
	
	if (age>=20) {
		if(age>=40) {
			System.out.println("중장년입니다.");
		}else if(age>=20) {
			System.out.println("청년입니다.");
		}
	}else
	{
		if(age>=14) {
			System.out.println("청소년입니다.");
		}else {
			System.out.println("어린이입니다.");
		}
	}
	
	*/
	
	/*
	 오빠문제1
	 한 학교에 반이 6개가 있다. 총 학생 수를 입력하면, 반 당 최대 인원수를 출력하고,
	  남은 학생 없이 다 채워졌다면 "학기 시작"
	  다 채워지지 못했다면 "학급이 부족합니다. 남은 학생은 n명입니다"라고 출력해주는 프로그램을 작성하시오
	  -모든 반의 인원 수는 같아야 한다.
	 */
	/*
	Scanner input = new Scanner(System.in);
	
	System.out.println("총 학생수를 입력해주세요: ");
	int all= input.nextInt();
	int max = all/6;
	
	if(all%6==0) {
		System.out.println("학급의 최대 인원수:"+max+", 학기 시작");
	}else if(all%6!=0){
		System.out.println("학급의 최대 인원수: "+max);
		System.out.println("학급이 부족합니다.");
		System.out.println("남은 학생은"+all%6+"입니다.");
	}
	System.out.println("");
	*/
	
	/*
	 오빠문제2
	 시험 평균 점수가 70점 이하라면 보충 수업을 들어야 한다.
	 시험 점수 2개를 입력하고 3번째 시험을 몇 점 이상을 받아야 보충 수업을 듣지 않을지 
	 출력해 주는 프로그램을 작성하시오.
	 -3번째 시험 결과가 100점이 넘어야 평균 점수가 70점 초과일 경우 "보충 수업 확정"을 출력하시오
	 */
	
	/*
	 Scanner input= new Scanner(System.in);
	 
	 System.out.println("시험 점수 2개를 입력해 주세요");
	 
	 int test1, test2, test3;
	 test1= input.nextInt();
	 test2= input.nextInt();
	 
	 test3=0;
	 
	 int total = test1+test2+test3;
	 test3=210-total;
	 
	 if(test3>100) {
		 System.out.println("보충수업 확정입니다.");
	 }else 
	 {
		 System.out.println(test3+"점 이상이어야 합니다.");
	 }
	 
	
	*/
	/*
	 5조 문제1
	 k전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하세 만드는 인공지능 오븐을 개발하려고 한다.
	 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
	 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
	 또한 k전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려주는 디지털 시계가 있다.
	 훈제오리구이를 시작하는 시각과 오븐구이를 하는데 필요한 시간이 분단위로 주어졌을 때,
	 오븐 구이가 끝나느 시각을 계산ㄴ하는 프로그램을 작성하시오.
	 
	입력
	A현재시간(시)
	B현재시간(분)
	time요리에 필요한 시간(분)
	
	 */
	/*
	Scanner input =new Scanner (System.in);
	 System.out.println("현재 시각을 적어주세요");
	 System.out.print("시: ");
	 int a = input.nextInt();
	 System.out.print("분: ");
	 int b = input.nextInt();
	 
	 System.out.println("요리에 필요한 시간(분)을 적어주세요: ");
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
	
	
	System.out.println("끝나는 시각은"+a+"시"+b+"분");
	
	*/
	
	/*
	 5조 문제 2
	 1에서부터 6개까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
	 
	 같은 눈이 3개가 나오면 10,000원 +(같은눈)*1,000원의 상금을 받게 된다.
	 같은 눈이 2개만 나오는 경우에는 1,000원+(같은눈)*100원의 상금을 받게 된다.
	 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)*100원의 상금을 받게 된다.
	 예를 들어 , 3개의 눈이 3,3,6이 주어지면 상금은 1,000원+3*100으로 계산되어 1,300원을 받게된다.
	 또 3개의 눈이 2,2,2로 주어지면 10,000+2*1,000으로 계산되어 12,000원을 받게 된다.
	 3개의 눈이 6,2,5로 주어지면 그 중 가장 큰 값이 6이므로 6*100으로 계산되어 600원을 상금으로 받게된다.
	 
	 3개의 주사위의 나온 눈이 주어질때 , 상금을 계산하는 프로그램을 작성하시오
	 */
	
	/*
	
	Scanner input =new Scanner(System.in);
	
	System.out.println("나온 주사위의 눈을 입력해주세요:");
	int a = input.nextInt();
	
	System.out.println("나온 주사위의 눈을 입력해주세요:");
	int b = input.nextInt();
	
	System.out.println("나온 주사위의 눈을 입력해주세요:");
	int c = input.nextInt();
	
	if (a==c) {
		if (a==b) {
			System.out.println("상금은"+(10000+a*1000));
		}else {
			System.out.println("상금은"+(1000+a*100));
		}
	}else {
		if(a!=b) {
			if(b!=c) {
				if(a<b) {
					a=b;
				}if(b<c){
					b=c;
				}
			System.out.println("상금은"+(b*100));
			}
		}else {
			System.out.println("상금은"+(1000+a*100));
		
		}
	}
	
	
	//111 112 121 122 123
	
	
	*/
	
	
	
	
	
	/*
	 5조 문제3
	 국어 영어 수학 점수를 입력하고
	 평균이 90이상 a 80이상 b 70이상 c 70미만 f
	 
	 */
	/*
	Scanner input = new Scanner (System.in);
	
	System.out.println("국어, 영어, 수학 점수를 차례로 입력하세요");
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
	 5조 문제4
	 월을 입력받아 봄, 여름,가을, 겨울 출력
	 */
	/*
	Scanner input= new Scanner(System.in);
	System.out.println("월을 입력: ");
	int m = input.nextInt();
	 
	if(m>=3 && m<=5) {
		System.out.println("봄");
	}else if(m>5 && m<=8) {
		System.out.println("여름");
	}else if(m>8 && m<=11) {
		System.out.println("가을");
		
	}else
		System.out.println("겨울");
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
