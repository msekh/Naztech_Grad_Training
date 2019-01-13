package io.mtech.model;



import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import lombok.NonNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
private int uid;
@NonNull private String name;
@NonNull private String emial;
@NonNull private String phone;


}
