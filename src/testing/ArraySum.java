package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArraySum {
	public static void main (String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int a=sc.nextInt();
		int inp[]=new int[a];
		System.out.println("Lenght of an array :"+inp.length);
		for(int i=0;i<inp.length;i++){
			int count=i+1;
			System.out.println("enter the array "+count+ " value");
			inp[i]=Integer.parseInt(br.readLine());
			
			
		}
		int sum=0;
		for(int i=0;i<inp.length;i++){
			int count=i+1;
			System.out.println("value"+count+" : "+inp[i]);
			sum=sum+inp[i];
			
		}
		System.out.println("sum is : "+sum);
	}

}
