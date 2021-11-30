import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int [] numbers = {5, 1, 3, 4, 10, 6};
		//System.out.println(Arrays.toString(numbers));
		//insertionSort(numbers);
		//System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(numbers));
		selectionSort(numbers);
		System.out.println(Arrays.toString(numbers));

	}
	public static void bubbleSort(int [] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
				//swap
					/*int temp = arr[j];
					arr[j] = arr[j +1];
					arr[j+1] = temp;
					*/
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}
	//Implement for homework
	public static void insertionSort(int [] arr) {
		int n = arr.length;
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i -1;
			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	//Implement for homework
	public static void selectionSort(int [] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			int smallerNum = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNum;
		}
	}
}
