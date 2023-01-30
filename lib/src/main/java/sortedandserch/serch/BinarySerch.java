package sortedandserch.serch;

import java.util.Iterator;

public class BinarySerch implements TypeSerch {

	@Override
	public <T extends Number> int serchElement(T[] array, T t) {
		int middle = array.length/2;
		int left = 0, right = array.length;
		boolean isCheck = left < right;
		while (isCheck) {
			if (t.doubleValue() < array[middle].doubleValue()) {
				right = middle;
				middle = middle/2;
			} else if (t.doubleValue() > array[middle].doubleValue()) {
				left = middle;
				middle = (left + right)/2;
			} if (t.doubleValue() == array[middle].doubleValue()) {
				return middle;
			} else if (left == right) {
				break;
			} 			
		}
		return -1;
	}

}
