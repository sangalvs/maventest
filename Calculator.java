package com.javahelps.calculator;

import java.util.Scanner;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Calculator {
	public static void main(String[] args) {
        System.out.println("This is a simple numeric expression calculator.");
        System.out.println("Please enter what operation you would like to complete. The format should be: ");
		System.out.println("'2 + 5 * 8'");
		
		Scanner sc = new Scanner(System.in);
		
		String exp = sc.nextLine();

        Expression expression = new ExpressionBuilder(exp).build();
        double ans = expression.evaluate();
        System.out.println(ans);
    }
}
