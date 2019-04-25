package Collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortedByLambda {
public static void main(String[] args) {
	Map<Integer, String> random=new HashMap<Integer, String>();
	for (int i = 0; i <10; i++) {
		random.put((int)(Math.random()*100), String.valueOf((int) (Math.random() * 100)));
	}
	System.out.println("Initial Map: " + Arrays.toString(random.entrySet().toArray()));
	
}
}
