package org.ConditionalOperators;

public class ElseIfLadder {
	public static void main(String[] args) {
		int a= 10, b=20, c=30;
		
		if(a<b && a>c) {
			System.out.println("A value is lesser than B and C value is not lesssser than A");
		}
		else if (b<a || b<=c) {
			System.out.println("B is greater than A ");
		}
		else {
			System.out.println("C is greater");
		}
	}

}
