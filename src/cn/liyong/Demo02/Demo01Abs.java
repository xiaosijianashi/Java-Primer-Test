package cn.liyong.Demo02;

import java.lang.Math;
/*
 * JDK��java.lang.Math���ھ���ֵ�÷���
 */
public class Demo01Abs {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		method(x->{
			if(x>=0)
				return x;
			else
				return -x;
		});
		
		method(Math::abs);

	}
	
	public static void method(Calculator calculator) {
		int result=calculator.getAbs(-30);
		System.out.println("����ǣ�"+result);
		
	}

}