package com;

import java.util.Scanner;

class arithematiccal {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First number");
	int n1 = sc.nextInt();
	System.out.println("Enter the Second number");
	int n2=sc.nextInt();
	System.out.println(add(5,3));
	System.out.println(sub(5,3));
	System.out.println(mul(5,3));
	System.out.println(div(5,3));
	
	}
	 static int add(int a,int b) {
		
		return (a+b);
	}
static int sub(int a,int b) {
		
		return (a-b);
	}
static int mul(int a,int b) {
	
	return (a*b);
}
static double div(int a,int b) {
	
	return (a/b);
}
}