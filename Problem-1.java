package demo;
public class ProblemClass {
double calculator(String s,double x,double y){
	switch(s){
	case "+": return x+y;
	case "-":return x-y;
	case "*":return x*y;
	case "/":return x/y;
	default : return 0;
	}
}

import java.util.*;
public class ProblemI {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter values");
double a=sc.nextDouble();
double b=sc.nextDouble();
System.out.println("Enter oprator");
String op=sc.next();
ProblemClass p=new ProblemClass();
double ret=p.calculator(op,a,b);
System.out.print(ret);
	}

}
