package testing;
import java.io.*;

public class ArrayMatrix {
public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int arr[][]=new int[3][3];
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			
		arr[i][j]=Integer.parseInt(br.readLine());
		}
	}
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.println(arr[i][j]+"");
		}
		System.out.println();
	}
//	addition of arraysaddition
	
	//Transpose
	System.out.println("Transpose Matrix :");
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.println(arr[j][i]+"");
		}
		System.out.println();
	}
}
}
