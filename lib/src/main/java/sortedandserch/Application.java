package sortedandserch;

import java.util.Arrays;

import sortedandserch.serch.BinarySerch;
import sortedandserch.serch.NormalSerch;
import sortedandserch.serch.TypeSerch;
import sortedandserch.sorted.BubbleSort;
import sortedandserch.sorted.ChoiceSorted;
import sortedandserch.sorted.TypeSorted;
import sortedandserch.user.InterfaceUser;
import sortedandserch.user.RealUser;

public class Application {

	public static void main(String[] args) {
		Integer[] array = {9, 1, 3, 23, 4};
		Double[] array2 = {3.0 , 2.9, 4.7, 5.7, 6.0};
		Long[] array3 = {90L, 1L, 34L, 54L, 1L};
		
		InterfaceUser realUser = new RealUser(new BubbleSort(), new NormalSerch());
		System.out.println(realUser.serchElement(23));
	}

}
