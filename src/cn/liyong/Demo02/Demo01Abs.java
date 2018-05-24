package cn.liyong.Demo02;

import java.lang.Math;
/*
 * JDK中java.lang.Math存在绝对值得方法
 */
public class Demo01Abs {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
		System.out.println("结果是："+result);
		
	}

}
