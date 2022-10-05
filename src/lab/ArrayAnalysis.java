package lab;

import java.util.Arrays;
import java.util.Scanner;

/*
 * See the link for lab explanation
 * https://docs.google.com/document/d/1QGhcNy-QOFT-J1rOHgeXKv81b5yz0LfEpL_Dl3PPff8/edit#
 * 
 * 
 */

public class ArrayAnalysis {

	
	//#1
	public static int[][] createRandom(int row, int column, int min, int max){
		int [][] randA = new int [row][column];
		//creating a loop that will fill all with random numbers it will be a nested loop
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column;j++){
				randA [i][j] = (int)(Math.random()*(max-min)+min);
				
				
			}
		}
		return randA;
	}
	
	
	//#2
	public void printArray(int[][] arr)  {
		for (int i = 0;i < arr.length;i++) {
			for (int j = 0;j < arr[0].length;j++) {
				System.out.printf("%4d ", arr[i][j]);
			}
			System.out.println();
		}
		
	
	}
	
	
	//#3
	public static int sumTotal(int[][] arr) {
		//for the length and the width to cycle through
		int total = 0;
		for(int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[i].length;j++) {
				total += arr[i][j];
			}
			
		}
		
		return total;
	}
	
	
	//#4
	public static double average(int[][] arr) {
	//same as last but with avraging at end
		
		
		
		return (double) sumTotal(arr) / (arr.length * arr[0].length);
	}
	
	
	//#5
	public static int findMin(int[][] arr) {
		int min = 999999999;
		
		for(int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[0].length;j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		
		return min;
	}
	
	
	//#6
	public static int findMax(int[][] arr) {
		int max = -999999999;
		
		for(int i = 0; i < arr.length;i++) {
			for (int j = 0; j < arr[0].length;j++) {
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		
		return max;
		
		
	}
	
	
	//#7
	public static int[][] diffArrays(int[][] arr1, int[][] arr2){
		//checking parameters
		if (arr1.length != arr2.length) {
			return null;
		}
		if (arr1[0].length != arr2[0].length) {
			return null;
		}
		//making it loop through each value and find the corosponding valuye and subtract.
		int [][] arr3 = new int [arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length;i++) {
			for (int j = 0; j < arr1[0].length;j++) {
				arr3[i][j] = arr1[i][j]-arr2[i][j];
			}
		}
		return arr3;
	}
	
	
	//#8
	public static int[][] transposeRow(int[][] arr1, int dist){
		//making a save row
	int[] save = new int[arr1[0].length];
	
		//for the times to move
		
		for (int i = 0; i < dist; i++) {
			//save first than move down
			save = arr1[arr1.length-1];
			for (int j = arr1.length-1; j > 0; j--) {
				
				arr1[j]=arr1[j-1];
				
			}
			arr1[0] = save;
		
	
		}
		
		//arr1[0] = save;
		return arr1;
	}
	
	
	//#9
	public static int sum3D(int[][][] arr) {
		int total = 0;
		for (int i = 0; i < arr.length;i++ ) {
			total += sumTotal(arr[i]);
		}
		
		return total;
	}
	
	
	//#10
	public static double average3D(int[][][] arr) {
		double avg = (int)sum3D(arr)/(arr.length* arr[0].length*arr[0][0].length);
		
		
		return avg;
	}
	
	
	
	
	
	
}
