package io.naztech.MethodRef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstanceMethodReferenceOfArbitraryObject {

	public void instanceMethodReferenceOfArbitraryObject() {
		Comparator<String> stringIgnoreCase = String::compareToIgnoreCase;
		// this is equivalent to below
		//Comparator<String> stringIgnoreCase2 = (first, second) -> first.compareToIgnoreCase(second);

		Comparator<String> reverseOrder = stringIgnoreCase.reversed();

		List<String> values = Arrays.asList("Sekh", "Mahadi", "Arisha", "Ariba", "Rupon");
		System.out.println(values);
		Collections.sort(values, reverseOrder);
		System.out.println(values);
	}
}
