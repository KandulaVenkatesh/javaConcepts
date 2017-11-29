package testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArraysAddandSubt {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arrAdd[][]=new int[3][3];
		int arrSub[][]=new int[3][3];
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				
			arr1[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("first Matrix");
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr1[i].length;j++){
				
				System.out.println(arr1[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("Second Matrix");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				
				
			arr2[i][j]=Integer.parseInt(br.readLine());
			}
		}
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				System.out.println(arr2[i][j]+"");
			}
			System.out.println();
		}
//		addition and subtraction of  two matrices
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				
				
			arrAdd[i][j]=arr1[i][j]+arr2[i][j];
			arrSub[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		System.out.println("Addition of two matrices");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				
				System.out.println(arrAdd[i][j]+"");
			}
			System.out.println();
		}
		System.out.println("subtraction of two matrices");
		for(int i=0;i<arr2.length;i++){
			for(int j=0;j<arr2[i].length;j++){
				
				System.out.println(arrSub[i][j]+"");
			}
			System.out.println();
		}

	}

}
