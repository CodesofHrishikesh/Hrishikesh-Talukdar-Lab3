package com.Driver;

import com.Services.BalancingBrackets;

public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	           String bracketExpression = "([[{}]])";
	           boolean isBalanced = BalancingBrackets.BalancingBrackets(bracketExpression);
	           if(isBalanced) {
	        	   System.out.println("The entered String has Balanced Brackets");
	           }
	           else {
	        	   System.out.println("The entered string has unbalanced brackets");
	           }
		}

	}


