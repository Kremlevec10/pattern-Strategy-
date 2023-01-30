package sortedandserch.sorted;

public class ChoiceSorted implements TypeSorted{

	@Override
	public <T extends Number> T[] sort(T[] array) {
		for (int left = 0; left < array.length; left++) {
			int min = left;
			for (int i = left; i < array.length; i++) {
				if (array[i].doubleValue() < array[min].doubleValue()) {
					min = i;
				}
			}
			Number var = array[left];
			array[left] = array[min];
			array[min] = (T)var;
		}
		return (T[])array;
	}

}
