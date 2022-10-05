package lab;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
		ArrayAnalysis analysis = new ArrayAnalysis();
		
		int[][] arr1 = analysis.createRandom(6, 3, -100, 100);
		
		int[][] arr2 = analysis.createRandom(6, 3, 0, 1000);
		
		//printing both arrays
		
		analysis.printArray(arr1);
		System.out.println();
		analysis.printArray(arr2);
		System.out.println();
		
		//method 3
		System.out.print("Arr1 Total: ");
		System.out.println(analysis.sumTotal(arr1));
		System.out.print("Arr2 Total: ");
		System.out.println(analysis.sumTotal(arr2));
		//method 4
		System.out.print("\nArr1 AVG: ");
		System.out.println(analysis.average(arr1));
		System.out.print("Arr2 AVG: ");
		System.out.println(analysis.average(arr2));
		//method 5
		System.out.print("\nArr1 Min: ");
		System.out.println(analysis.findMin(arr1));
		System.out.print("Arr2 Min: ");
		System.out.println(analysis.findMin(arr2));
		//method 6
		System.out.print("\nArr1 Max: ");
		System.out.println(analysis.findMax(arr1));
		System.out.print("Arr2 Max: ");
		System.out.println(analysis.findMax(arr2)+"\n");
		//method 7
		System.out.println("The diffence beetween the arrays:");
		analysis.printArray(analysis.diffArrays(arr1, arr2));
		// method 8
		analysis.printArray(analysis.transposeRow(arr1,getInt("How many rows to move?")));
			
		
		// mr hunter code
		int[][][] arr3D = new int[3][4][5];
		for (int i = 0; i < arr3D.length; i++) {
			arr3D[i] = analysis.createRandom(4, 5, -400, 400);
		}
		int x = 1;
		for (int[][] arr : arr3D) {
			System.out.println("\nLayer #" + x);
			analysis.printArray(arr);
			x++;
		}
		
		//benedict code
		System.out.println("\narr3D sum: " + analysis.sum3D(arr3D));
		// method 10 avrage
		System.out.println("\narr3D AVG: " + analysis.average3D(arr3D));
	}
	
	
	
	
	
	
	






	public static int getInt(String print){
		System.out.println("\n"+print);
		Scanner inKey = new Scanner(System.in);
		return inKey.nextInt();
	}
}
