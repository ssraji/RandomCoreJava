package com.raji.ems.employee;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="{()}{}";
		
		Stack<Character> stk = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			
			
			if((str.charAt(i) == '{') || (str.charAt(i) == '(')||(str.charAt(i) == '[')) {
				
				stk.push(str.charAt(i));
				
			}else if((str.charAt(i) != ' ') &&
					(str.charAt(i) == '}')&& (stk.peek()=='{') ||
					(str.charAt(i) == ']')&& (stk.peek()=='[') ||
					(str.charAt(i) == ')')&& (stk.peek()=='(') 
					) {
				
				stk.pop();
				
			}else {
				
				stk.push(str.charAt(i));
				
			}
			
		}// for ends
	
		
		if(stk.empty()) {
			
			System.out.println("It is Balanced");
			
		}else {
			
			System.out.println("It is not Balanced");

			
		}
		

	}

}
