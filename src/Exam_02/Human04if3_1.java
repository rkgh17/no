package Exam_02;

import java.util.Scanner;

public class Human04if3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int score;
		System.out.print("점수를 입력 : ");
		score = sc.nextInt();
		score = 91;
		
		if (score >= 90)
			System.out.println("당신의 점수는 A학점입니다."); // 90<= score <100
		if (80<= score && score <90)
			System.out.println("당신의 점수는 B학점입니다."); // 80<= score <90
		if (70<= score && score <80)
			System.out.println("당신의 점수는 C학점입니다."); // 70<= score <80
		if (60<= score && score <70)
			System.out.println("당신의 점수는 D학점입니다."); // 60<= score <70
		if (score < 60)
			System.out.println("당신의 점수는 F학점입니다."); // score < 60

	}

}
