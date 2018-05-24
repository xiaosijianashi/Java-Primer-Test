package cn.liyong.Demo03;

import java.util.Random;
/*
 * ��һ������������ 0 �� 1������Ϊ p �� 1-p������ʵ��һ��������ʹ�÷��� 01 ����һ����
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
	 * ����һ����������һ���ĸ��ʷ���0
	 * ����ֵ��int
	 * �������ƣ�getRandom
	 * �����б���void
	 */
	public static int getRandom(double d) {
		//������λС��
		double dou=(double)Math.round(d*1000)/1000;
		Random r=new Random();
		int random=r.nextInt(1000);
		if((random>=0)&&(random<(int)(dou*1000)))
			return 0;
		else 
			return 1;

	}
	
	/*
	 * ����һ������������getRandom,�ȸ��ʵķ���0��1
	 * ����ֵ��int
	 * �������ƣ�getRandomByEqual
	 * �����б���void
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