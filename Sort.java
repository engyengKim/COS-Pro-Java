import java.util.*;

public class Solution {

	public int[] answer(int[] arr) {
		// 삽입정렬
		/*
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		*/
		
		//선택정렬
		/*
		for(int i=0; i<arr.length-1; i++) {
			int min = arr[i];
			int min_idx = i;
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < min) {
					min_idx = j;
					min = arr[j];
				}
			}
			arr[min_idx] = arr[i];
			arr[i] = min;
		}
		*/
		
		//버블정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	
	public static void main(String args[]) {
		Solution solution = new Solution();
		
		int arr[] = {1,3,2,6,5,7,0}; // 0,1,2,3,5,6,7
		System.out.println(Arrays.toString(solution.answer(arr)));
		
	}
}



