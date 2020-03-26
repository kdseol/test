package com.practice.test.test;

import java.util.Scanner;

public class SolveWeek {

	public static int getDate(int month, int day) {
		int[] calander = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < calander.length; i++) {
			if (month == (i + 1) && day <= calander[i] && 0 < day) {
				int sum = 0;
				for (int j = 1; j < month; j++) {
					sum = sum + calander[j];
				}
				System.out.println("입력한 월 : " + month + " 입력한 일 : " + day);
				day = sum + day;
				return day;
			}
		}
		return -1;
	}

	public static String calcWeek(int day) {
		String week;
		switch (day % 7) {
		case 1:
			week = "MON";
			break;
		case 2:
			week = "TUE";
			break;
		case 3:
			week = "WED";
			break;
		case 4:
			week = "THU";
			break;
		case 5:
			week = "FRI";
			break;
		case 6:
			week = "SAT";
			break;
		default:
			week = "SUN";
			break;
		}

		return week;
	}

	public static void main(String[] args) {
		int date = -1;
		while (date < 0) {
			System.out.println("요일을 알고싶은 날자를 입력하세요.");
			System.out.println("ex) 1월 1일 인 경우 > 01 01");
			Scanner sc = new Scanner(System.in);
//			while (!sc.hasNextInt()||!sc.hasNextInt()) {
//				sc.next();
//				sc.next();
//				System.err.print("에러! 숫자가 아닙니다. \n재 선택 : ");
//			}
			int input1 = sc.nextInt();
			int input2 = sc.nextInt();

			date = getDate(input1, input2);
			if (date == -1) {
				System.out.println("잘못 입력하였습니다.");
			}
		};

		String week = calcWeek(date);
		System.out.println("요일 : " + week);

	}
}
