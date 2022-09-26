package demo;
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
  System.out.println("Enter array length");
	int arr[]=new int [sc.nextInt()];
  System.out.println("Enter array elements");
	for(int i=0;i<=arr.length-1;i++){
		arr[i]=sc.nextInt();
		
	}
	int a=0;
	int b=0;	
	int c=0;
	int d=0;
	int e=0;
	int f=0;
	int g=0;
	int h=0;
	int k=0;
	for(int j=0;j<=arr.length-1;j++){
		if(arr[j]%1==0){
			 a=a+1;
		}
		if(arr[j]%2==0){
			 b=b+1;
		}
		if(arr[j]%3==0){
			 c=c+1;
		}
		if(arr[j]%4==0){
			 d=d+1;
		}
		if(arr[j]%5==0){
			 e=e+1;
		}
		if(arr[j]%6==0){
			 f=f+1;
		}
		if(arr[j]%7==0){
			 g=g+1;
		}
		if(arr[j]%8==0){
			 h=h+1;
		}
		if(arr[j]%9==0){
			 k=k+1;
		}
	}
	System.out.println("{1:"+a+",2:"+b+",3:"+c+",4:"+d+",5:"+e+",6:"+f+",7:"+g+",8:"+h+",9:"+k+"}");
	}

}
