package cn.liyong.innerClass;

public class Outer {
	public class inner {
		void method() {
			System.out.println("这是一个内部类的方法！");
		}
	}

	public static void main(String[] args) {
		Outer.inner in = new Outer().new inner();
		in.method();
	}

}
