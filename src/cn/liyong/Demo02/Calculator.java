package cn.liyong.Demo02;

/*
 * 计算器的函数式接口
 */
@FunctionalInterface
public interface Calculator {
	
	//求绝对值
	int getAbs(int num);

}
