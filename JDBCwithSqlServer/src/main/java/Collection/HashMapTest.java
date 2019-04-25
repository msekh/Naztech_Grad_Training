package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {   
	public static void main(String[] args) {

		Map<String, String> data = new HashMap<String, String>();
		String [] x= {"Maenul", "Elias", "Imtias"};

		for(int i=0; i<x.length; i++) {
			data.put(String.valueOf(i),x[i]);
		}
		
		/*
		 * data.put(x[0], "Python"); // put example data.put("B", "C++"); data.put("C",
		 * "Java"); data.put("D", null); // null value data.put(null, "JavaScript"); //
		 * null key
		 */
		String value = data.get("0"); // get example
		System.out.println(value);
		System.out.println("Key = 0, Value = " + value);

		value = data.getOrDefault("2", "Default Value");
		System.out.println("Key = 2, Value=" + value);

		boolean keyExists = data.containsKey(null);
		boolean valueExists = data.containsValue("JavaScript");

		System.out.println("keyExists= " + keyExists + ", valueExists= " + valueExists);

		Set<Entry<String, String>> entrySet = data.entrySet();
		System.out.println(entrySet);

		System.out.println("data map size=" + data.size());

		Map<String, String> data1 = new HashMap<String, String>();
		data1.putAll(data);
		System.out.println("data1 mappings= " + data1);

		String nullKeyValue = data1.remove(null);
		System.out.println("data1 null key value = " + nullKeyValue);
		System.out.println("data1 after removing null key = " + data1);

		Set<String> keySet = data.keySet();
		System.out.println("data map keys = " + keySet);

		Collection<String> values = data.values();
		System.out.println("data map values = " + values);

		data.clear();
		System.out.println("data map is empty =" + data.isEmpty());

	}

	}