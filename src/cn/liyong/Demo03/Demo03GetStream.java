package cn.liyong.Demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * Java 8�еġ�������ʵ����Stream�ӿڵĶ���
 * JDK�ṩ��һ�����ӿڣ�java.util.stream.Stream<T>
 * 
 * ��λ�ȡ����
 * 1.���ݼ��ϻ�ȡ��:������.stream()
 * 
 * 2.���������ȡ����Stream.of(��������)
 */
public class Demo03GetStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("�����Ȱ�,98");
		arraylist.add("��������,95");
		arraylist.add("�ƿƵ���,89");
		
		Stream<String> stream=arraylist.stream();
		
		stream.map(s->s.split(",")[1]).map(Integer::parseInt).filter(n->n>90).forEach(System.out::println);
		System.out.println(stream);
		
		String[] str= {"�����Ȱ�","��������","�ƿƵ���"};
		Stream<String> stream2=Stream.of(str);		
		
	}

}