package com.practice.test.test;

import java.util.Scanner;

public class Bracket {
	public static void main(String[] args) {
		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String result = "NO";
		int length = inputString.length() / 2;
		if (inputString.length() % 2 == 1) {
			System.out.println(result);
		} else {
			String forward = inputString.substring(0, length);
			StringBuffer sb = new StringBuffer();
			sb.append(inputString);
			String backward = sb.reverse().substring(0, length);
			for (int i = 0; i < length; i++) {
				String str1 = Character.toString(forward.charAt(i));
				String str2 = Character.toString(backward.charAt(i));
				if (str1.equals("(") & str2.equals(")")) {
					result = "YES";
				} else if (str1.equals("{") & str2.equals("}")) {
					result = "YES";
				} else if (str1.equals("[") & str2.equals("]")) {
					result = "YES";
				} else {
					result = "NO";
				}
			}
			System.out.println(result);
		}
	}
}
