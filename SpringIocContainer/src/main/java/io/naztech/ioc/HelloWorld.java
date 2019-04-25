package io.naztech.ioc;

public class HelloWorld {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void getMsg() {
		System.out.println("My Message : " + msg);
	}
}
