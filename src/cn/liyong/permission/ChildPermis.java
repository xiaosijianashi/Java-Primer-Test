package cn.liyong.permission;

public class ChildPermis extends Permission {
	public void show1() {
		System.out.println(i_pro);
		System.out.println(i_def);
		//System.out.println(i_pri);
	}

}

class Others{
	Permission p=new Permission();
	public void show1() {
		System.out.println(p.i_pro);
		System.out.println(p.i_def);
		//System.out.println(i_pri);
	}
}