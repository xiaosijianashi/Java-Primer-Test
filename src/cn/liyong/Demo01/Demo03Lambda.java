package cn.liyong.Demo01;

/*
 * �������ã����Lambda����ʽ��ʵ�ַ���������һ�������Ѿ���������ô�Ϳ���ֱ���ù����滻Lambda
 * �������õ�д����
 * 1.ͨ���������������þ�̬��������
 * ����������̬����
 * 
 * 2.S
 */
public class Demo03Lambda {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		hireSitter(food->System.out.println("��"+food+"���ɲ�"));
		
		hireSitter(Cook::makeFood);
		
		Sitter sitter=s->System.out.println("��"+s+"���ɲ�");
		sitter.work("���");
		Sitter sitter2=Cook::makeFood;
		sitter2.work("����");
		Cook cook=new Cook();
		Sitter sitter3=cook::makeFood2;
		sitter3.work("�Ϲ�");

	}
	
	public static void hireSitter(Sitter sitter) {
		sitter.work("�ײ�");
	}

}


