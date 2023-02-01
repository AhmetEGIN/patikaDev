package patikaDev.projeKitapSiralama;

import java.util.Comparator;

public class OrderPageComparator implements Comparator<NBook> {

	@Override
	public int compare(NBook o1, NBook o2) {

		return o1.getPage() - o2.getPage();
	}

}
