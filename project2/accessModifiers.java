package com.project2;

public class accessModifiers {

	void defaultMethod() {
		System.out.println(" default method");
	}

	public void publicMethod() {
		System.out.println(" public method");
	}

	protected void protectedMethod() {
		System.out.println(" protected method");
	}

	private void privateMethod() {
		System.out.println(" private method");
	}

	public static void main(String[] args) {
		accessModifiers obj = new accessModifiers();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.privateMethod();
		obj.publicMethod();
	}

}
