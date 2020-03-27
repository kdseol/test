package com.practice.test.test;

import java.util.Scanner;
import java.util.Stack;

public class Bracket3 {
	public static String solution(String inputString) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return "false";
				}
				
				char lastC = stack.pop();
				
				if (c==')' && lastC != '(') {
					return "false";
				}
				if (c=='}' && lastC != '{') {
					return "false";
				}
				if (c==']' && lastC != '[') {
					return "false";
				}
			}
		}
		if(!stack.isEmpty()) {
			return "false";
		}
		return "true";

	}

	public static void main(String[] args) {

		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();

		System.out.println(solution(inputString));
	}
}
