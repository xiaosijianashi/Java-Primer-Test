package cn.liyong.innerClass;

public class Client {
	public static void main(String[] args) {
		PersonDemo p=new PersonDemo();
		p.method(new Person(){
			public void doSomething() {
				System.out.println("×ö×÷Òµ");
			}
		});
	}

}
