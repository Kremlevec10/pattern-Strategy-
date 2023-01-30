package sortedandserch.user;

import java.util.Arrays;

import sortedandserch.serch.TypeSerch;
import sortedandserch.sorted.TypeSorted;

public class RealUser extends AbstractUser {

	public RealUser(TypeSorted typeSorted, TypeSerch typeSerch) {
		this.typeSorted = typeSorted;
		this.typeSerch = typeSerch;
	}

	@Override
	public <U extends Number> void sorted(U[] array) {
		u = typeSorted.sort(array);
	}

	@Override
	public <T extends Number> int serchElement(T t) {
		int index = -1;
		if (u == null) {
			System.out.println("Отсортируйте массив для поиска элемента");
		} else {
			index = typeSerch.serchElement(u, t);
		}
		return index;
	}

}
