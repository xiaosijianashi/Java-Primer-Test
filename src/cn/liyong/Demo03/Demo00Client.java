package cn.liyong.Demo03;

import java.util.Random;
/*
 * 给一个函数，返回 0 和 1，概率为 p 和 1-p，请你实现一个函数，使得返回 01 概率一样。
 */
public class Demo00Client {
	
	public static void main(String[] args) {
		int NUM=0;
		for(int i=0;i<1000000;i++) {
			if(getRandomByEqual()==0)
				NUM++;
		}
		System.out.println(NUM);
		
	}
    
	/*
	 * 定义一个方法，以一定的概率返回0
	 * 返回值：int
	 * 方法名称：getRandom
	 * 参数列表：void
	 */
	public static int getRandom(double d) {
		//保留三位小数
		double dou=(double)Math.round(d*1000)/1000;
		Random r=new Random();
		int random=r.nextInt(1000);
		if((random>=0)&&(random<(int)(dou*1000)))
			return 0;
		else 
			return 1;

	}
	
	/*
	 * 定义一个方法，利用getRandom,等概率的返回0和1
	 * 返回值：int
	 * 方法名称：getRandomByEqual
	 * 参数列表：void
	 */
	public static int getRandomByEqual() {
		
		int result=0;
		while(true) {
			int i=getRandom(0.7);
			int j=getRandom(0.7);
			if(i==0&&j==1) {
				result=0;
				break;
			}
			else if(i==1&&j==0){
				result=1;
				break;
			}
			else {
				continue;
			}
		}
		
		return result;
	}
}
