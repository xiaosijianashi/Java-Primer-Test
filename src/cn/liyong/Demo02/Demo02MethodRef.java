package cn.liyong.Demo02;

public class Demo02MethodRef {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Cook cook=new Cook();
		method(cook::makeFood);

	}
	
	public static void method(Sitter sitter) {
		sitter.work("�ײ�");
	}

}