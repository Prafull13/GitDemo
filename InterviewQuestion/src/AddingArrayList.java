import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingArrayList {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		Integer[] otherList = new Integer[] {1, 2, 3, 4, 5};
		Collections.addAll(list, otherList);
		System.out.println(Collections.addAll(list, otherList));
	}

}


