package testing;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ArrayBigSmall {
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Size of the array :"+ arr.length);
		for(int i=0;i<arr.length;i++){
			int count=i+1;
			System.out.println("enter the array "+count+ " value");
			arr[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<arr.length;i++){
			System.out.println("values of the array"+arr[i]);
			
			
		}
//		for each loop(for(declaration:array or collection))
		for(int d:arr){
			System.out.println(d +"\n");
		}
		int big=arr[0];
		int small=arr[0];
		for(int i=0;i<arr.length;i++){
		if(arr[i]>big){
			big=arr[i];
		}
	if(arr[i]<small){
		small=arr[i];
	}
		
		
		}
		System.out.println("big value in the array :"+big+"\n small value in the array :"+small);
	}

}
