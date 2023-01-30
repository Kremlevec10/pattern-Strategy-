package sortedandserch.sorted;

import java.util.Arrays;

public class BubbleSort implements TypeSorted {

	public <T extends Number> T[] sort(T[] array) {
		boolean isCheck = true;
		while (isCheck) {
			isCheck = false;
			for (int i = 0; i < array.length-1; i++) {
				if (array[i].doubleValue() > array[i+1].doubleValue()) {
					Number var = array[i];
					array[i] = array[i+1];
					array[i+1] = (T)var;
					isCheck = true;
				}
			}
		}
		return (T[])array;
	}
}
