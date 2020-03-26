package com.practice.test.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Bracket3 {
	public static String solution(String inputString) {

		Stack<String> stack = new Stack<>();
		String result = "NO";
		int cnt = 0;

		for (int i = 0; i < inputString.length(); i++) {

			// if (Character.toString(inputString.charAt(i)).equals("(")) {
			if (inputString.charAt(i) == '(') {
				cnt++;
				stack.push(")");
			} else if (Character.toString(inputString.charAt(i)).equals("{")) {
				cnt++;
				stack.push("}");
			} else if (Character.toString(inputString.charAt(i)).equals("[")) {
				cnt++;
				stack.push("]");
			} else if (Character.toString(inputString.charAt(i)).equals(stack.peek())) {
				
				stack.pop();
				cnt--;
			} else {
				cnt++;
			}
			if (cnt == 0) {
				result = "YES";
			}
		}
		return result;

	}

	public static void main(String[] args) {

		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();

		System.out.println(solution(inputString));
	}
}
