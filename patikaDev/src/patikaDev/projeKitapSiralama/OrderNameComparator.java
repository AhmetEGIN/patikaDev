package patikaDev.projeKitapSiralama;

import java.util.Comparator;

public class OrderNameComparator implements Comparator<NBook> {

	@Override
	public int compare(NBook o1, NBook o2) {

		return o1.getBookName().compareTo(o2.getBookName());
	}

}
