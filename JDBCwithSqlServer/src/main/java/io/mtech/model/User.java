package io.mtech.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class User {
	
private int uid;
private String name;
private String email;
private String uName;
private String pass;



}
