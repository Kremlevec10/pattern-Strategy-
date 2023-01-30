package sortedandserch.user;

import java.util.Arrays;

import sortedandserch.serch.TypeSerch;
import sortedandserch.sorted.TypeSorted;

public abstract class AbstractUser<U extends Number> implements InterfaceUser {

	TypeSerch typeSerch;
	TypeSorted typeSorted;
	U[] u;

	public void printArray() {
			System.out.println(Arrays.toString(u));
	}
}
