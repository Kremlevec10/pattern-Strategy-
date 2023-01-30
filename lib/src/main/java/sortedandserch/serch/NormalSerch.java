package sortedandserch.serch;

public class NormalSerch implements TypeSerch {

	@Override
	public <T extends Number> int serchElement(T[] array, T t) {
		int serchIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].doubleValue() == t.doubleValue()) {
				serchIndex = i;
				return serchIndex;
			}
		}
		return -1;
	}

}
