package JAVA8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListStream {

	public static void main(String[] args) {
		
		/*
		 * List list = new ArrayList(); for(int i = 1; i< 10; i++){ list.add(i); }
		 * Stream stream = list.stream(); stream.forEach(p -> System.out.println(p));
		 */
		
		int[] arr= {2,45,78,6,6,5,4,7,8,9,4,2};
		Arrays.parallelSort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j= arr[i];
			System.out.println(j);
			
		}
			
		}
		

	}


