import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Product G");	list.add("Product M");	list.add("Product Q");	list.add("Product F");	
		list.add("Product A");	list.add("Product B");	list.add("Product C");	list.add("Product D");
		
		Collections.sort(list);
		
		for(String product: list) {
			System.out.println(product);
		}
		
	}
}
