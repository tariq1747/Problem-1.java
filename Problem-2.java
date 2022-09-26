package demo;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int a = sc.nextInt();
int j =1;
for (int i=1;i<=a;i++){
	if(i==1){
		System.out.println(j);
		
	}else{
	j=j+2;
	System.out.println(j);
	}
	}
   }
}
