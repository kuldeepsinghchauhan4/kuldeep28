import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Problem4 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> number;
		
		list.add(1);	list.add(2);	list.add(49);	list.add(50);
		
		number = getSquares(list);
		System.out.println(number);
	}

	private static HashMap<Integer, Integer> getSquares(List<Integer> list) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			
			int n = itr.next();
			hm.put(n, n*n);
		}
		return hm;
	}
}
