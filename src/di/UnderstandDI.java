package di;

import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		//��¥�� ���ϱ� ���ؼ� Date Ŭ������ �����ؾ��Ѵ�.
		//���� ����
		Date date = new Date();
		System.out.println(date);
	}
	
	public static void getDate(Date d) {
		//���� ����
		Date date = d;
		System.out.println(date);
	}

	public static void memberUse1() {
		// ���� ���� : ���� ����
		Member m1 = new Member();
	}
	
	public static void memberUse2(Member m) {
		// ���� ���� : ������ ���� ���� ���� -> ���� ����(Dependency Injection)
		Member m2 = m;
	}
	
}

//Member�� ����Ѵ� --> Member�� ��ɿ� �����Ѵ� ��� �ǹ�
class Member{
	String name;
	String nickName;
	
	public Member() {} 
	/* 
	 * public -> private���� �����ϸ� ���Ѱ����� ��� ������ �߻�
	 * ���� ������ ������ �߻����� ���� 
	 * ( �̹� ������� �ִ� ���� ���� �޴� ���̱� ������ ��������� �ȸ�������� �������� �ʾƵ� �Ǳ� ����)
	 * ���� ������ ����ϴ� ���α׷����� �ٸ� Ŭ������ ����� �� �����ϰ� �����ϰ� ��ó�� �� �ִ�.
	*/ 
	
}