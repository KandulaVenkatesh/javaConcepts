package testing;
import java.util.Scanner;

public class MulDimArra1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int arr[][]=new int[x][y],k=1;
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<y;j++){
				arr[i][j]=k++;
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<y;j++){
				System.out.println(arr[i][j]);
			}
	}
		
//		Second code
		System.out.println("Second code");
		
	int arr1[][]=new int[3][],l=1;
	arr1[0]=new int[5];
	arr1[1]=new int[2];
	arr1[2]=new int[4];
	
	for(int m=0;m<arr1.length;m++){
		for(int n=0;n<arr1[m].length;n++){
			arr1[m][n]=l++;
		}
		}

	for(int m=0;m<arr1.length;m++){
		for(int n=0;n<arr1[m].length;n++){
			System.out.println(arr1[m][n]);
		}
	}
	
//	ThreeDimensional
	System.out.println("\n Three Dimensional Array");

	int arr3[][][]=new int[2][1][],z=1;
	arr3[0][0]=new int[4];
	arr3[1][0]=new int[5];
	for(int p=0;p<arr3.length;p++){
		for(int q=0;q<arr3[p].length;q++){
			for(int r=0;r<arr3[p][q].length;r++){
				arr3[p][q][r]=z++;
			}
		}
	}
	for(int p=0;p<arr3.length;p++){
		for(int q=0;q<arr3[p].length;q++){
			for(int r=0;r<arr3[p][q].length;r++){
				System.out.println(arr3[p][q][r]+"");
			}
			System.out.println();}}
	
	
	}
	}
	