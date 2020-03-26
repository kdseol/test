package com.practice.test.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operation {
	// 2진수를 10진수로 변경

	// 메인메소드
	public static void main(String[] args) {
		String s = receiveUserInput();
		while (!isBinary(s)) {
			System.out.println("2진수 정수가 아닙니다. 다시 입력하세요.");
			s = receiveUserInput();
		}
		int v = convertBinaryToDecimal(s);
		int count = 0;
		count = selfRecursion(v, count);
		// count = calculateCount(v, count);

		System.out.println(count);
	}

	private static int convertBinaryToDecimal(String s) {
		// int decimalNum = Integer.parseInt(s, 2);
		// return decimalNum;

		int decimalNum = 0;
		int exponent = 1;
		for (int i = s.length(); i > 0; i--) {
			decimalNum = decimalNum + (exponent * Integer.parseInt(s.substring(i - 1, i)));
			exponent = exponent * 2;
		}
		return decimalNum;
	}

	private static int calculateCount(int decimalNum, int count) {
		while (decimalNum != 0) {
			if (decimalNum % 2 == 1) {
				decimalNum--;
				count++;

			} else if (decimalNum % 2 == 0) {
				decimalNum = decimalNum / 2;
				count++;
			}
		}

		return count;
	}

	private static int selfRecursion(int decimalNum, int count) {
		if (decimalNum == 0) {
			return count;
		} else if (decimalNum % 2 == 1) {
			decimalNum--;
			count++;

		} else if (decimalNum % 2 == 0) {
			decimalNum = decimalNum / 2;
			count++;
		}
		return selfRecursion(decimalNum, count);
	}

	private static Boolean isBinary(String str) {

		Pattern p = Pattern.compile("^[0-1]*$");
		Matcher m = p.matcher(str);
		return m.find();
	}

	private static String receiveUserInput() {
		System.out.println("음수가 아닌 2진수 정수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String userInputNum = sc.nextLine();
		System.out.println("사용자입력 : " + userInputNum);
		return userInputNum;
	}
}
