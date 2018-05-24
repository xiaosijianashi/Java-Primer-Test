package cn.liyong.Demo01;

/*
 * 方法引用：如果Lambda表达式的实现方法，在另一个类中已经做过，那么就可以直接拿过来替换Lambda
 * 方法引用的写法：
 * 1.通过类名称引用引用静态方法名：
 * 类名：：静态方法
 * 
 * 2.S
 */
public class Demo03Lambda {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		hireSitter(food->System.out.println("将"+food+"做成菜"));
		
		hireSitter(Cook::makeFood);
		
		Sitter sitter=s->System.out.println("将"+s+"做成菜");
		sitter.work("青瓜");
		Sitter sitter2=Cook::makeFood;
		sitter2.work("冬瓜");
		Cook cook=new Cook();
		Sitter sitter3=cook::makeFood2;
		sitter3.work("南瓜");

	}
	
	public static void hireSitter(Sitter sitter) {
		sitter.work("白菜");
	}

}



