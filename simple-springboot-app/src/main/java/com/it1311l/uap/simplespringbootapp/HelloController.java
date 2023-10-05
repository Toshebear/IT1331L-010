package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello World";
	}
	
	@GetMapping("/sort")
	public int[] sortInteger() {
		int[] arr = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};
		bubbleSort(arr); //calling the private method in order to sort the array from highest to lowest
		return arr;
	}

	private void bubbleSort(int[] arr) {
		int n = arr.length;
		boolean swapped; //boolean swapped is added in order to make sure that the algo continues to the next iteration to make sure that the array is fully sorted from highest to lowest.
		do { //created a do-while loop in order to check and swap the order of the numbers in the array.
			swapped = false; //swapped is set to false at the start to indicate that no swaps have been done yet.
			for (int i = 1; i < n; i++) {
				if (arr[i - 1] < arr[i]) { //an if statement to compare the numbers and swap them if one is lower than the other.
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swapped = true; //swapped is now set to true which will indicate that at least one swap has been done during the iteration.
				}
			}
			n--;
		} while (swapped);
	}
}
