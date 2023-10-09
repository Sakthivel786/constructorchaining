package practise;
 class test {
	 test() {
		this("hi");
		System.out.println("i am from no argument constructor");
	}
	 test(String s) {
		this(5,2.5);
		System.out.println("i am from one parameter");
	}
	 test(int a, double b) {
		System.out.println("i am from 2 argument cons");
	 }
 }

