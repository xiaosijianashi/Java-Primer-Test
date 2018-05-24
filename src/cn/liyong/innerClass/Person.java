package cn.liyong.innerClass;

public abstract class Person {
	public abstract void doSomething();

}



class PersonDemo{
	public void method(Person p){
		p.doSomething();
	}
}