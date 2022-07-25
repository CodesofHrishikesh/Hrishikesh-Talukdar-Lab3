package com.Services;

import java.util.Stack;

public class BalancingBrackets {

	       	 public static boolean BalancingBrackets(String expression) {
			   Stack<Character> Bracketstack = new Stack<Character>();
			   for (int i=0; i<expression.length();i++){
				   char character = expression.charAt(i);
				   
				   if(character=='('||character == '[' || character=='{' ) {
					   Bracketstack.push(character);
				   continue;
			   }
				   if (Bracketstack.isEmpty()) {
					   return false;
				   
			   }
				   char TopOfTheStack = Bracketstack.pop();
				   switch(character) {
				   case ')':
		                if (TopOfTheStack!='(') {
		                    return false;
		                }
		                break;
		  
		            case '}':
		                if (TopOfTheStack!='{') {
		                    return false;
		                }
		                break;
		  
		            case ']':
		                
		                if (TopOfTheStack!='[') {
		                    return false;
		                }
		                break;
		                default : return false;
		            }
			   }
				   
				 return Bracketstack.isEmpty();
			   }
	}
		  

