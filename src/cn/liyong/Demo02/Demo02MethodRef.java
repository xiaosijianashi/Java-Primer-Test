package cn.liyong.Demo02;

public class Demo02MethodRef {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Cook cook=new Cook();
		method(cook::makeFood);

	}
	
	public static void method(Sitter sitter) {
		sitter.work("白菜");
	}

}
