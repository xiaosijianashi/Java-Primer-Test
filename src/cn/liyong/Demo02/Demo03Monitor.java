package cn.liyong.Demo02;

public class Demo03Monitor {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		useMonitor(s->System.out.println(s));
		useMonitor(System.out::println);
		
		Monitor monitor=s->System.out.println(s);
		monitor.show("Hello,World");
		
		Monitor monitor2=System.out::println;
		monitor2.show("Hello,World");
		
		

	}
	
	public static void useMonitor(Monitor monitor) {
		monitor.show("Hello,World");
	}

}
