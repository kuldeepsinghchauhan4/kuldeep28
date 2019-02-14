import java.util.ArrayList;
import java.util.List;

public class Problem3 {
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		list1.add("Yanshu");	list1.add("Gupta");	list1.add("yoyo");	list1.add("Indian");
		list2.add("Gupta");	list2.add("yoyo");
		
		List<String> list = removeElements(list1, list2);
		System.out.println(list);
	}

	private static List<String> removeElements(List<String> list1, List<String> list2) {
		
		list1.removeAll(list2);
		return list1;
	}
}
