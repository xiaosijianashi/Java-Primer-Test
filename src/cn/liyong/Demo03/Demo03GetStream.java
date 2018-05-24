package cn.liyong.Demo03;

import java.util.ArrayList;
import java.util.stream.Stream;

/*
 * Java 8中的“流”其实就是Stream接口的对象
 * JDK提供了一个流接口：java.util.stream.Stream<T>
 * 
 * 如何获取流：
 * 1.根据集合获取流:集合名.stream()
 * 
 * 2.根据数组获取流：Stream.of(数组名称)
 */
public class Demo03GetStream {
	
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList<>();
		arraylist.add("迪丽热巴,98");
		arraylist.add("古力娜扎,95");
		arraylist.add("科科迪瓦,89");
		
		Stream<String> stream=arraylist.stream();
		
		stream.map(s->s.split(",")[1]).map(Integer::parseInt).filter(n->n>90).forEach(System.out::println);
		System.out.println(stream);
		
		String[] str= {"迪丽热巴","古力娜扎","科科迪瓦"};
		Stream<String> stream2=Stream.of(str);		
		
	}

}
