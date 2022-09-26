package demo;

import java.util.Scanner;

public class Problem3{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int j =1;
		for (int i=1;i<=a;i++){
			if(i==1){
				System.out.println(j);
				
			}else if(i%2==0){
			
			}else{
			j=j+2;
			System.out.println(j);
			j=j+2;
			System.out.println(j);
			}
			}
	}
