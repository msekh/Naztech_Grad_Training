package io.natech.DIwithPrimitiveAndObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String streetNo;
	private String city;
	private String country;
}
