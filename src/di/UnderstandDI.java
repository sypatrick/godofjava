package di;

import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		//날짜를 구하기 위해서 Date 클래스에 의존해야한다.
		//강한 결합
		Date date = new Date();
		System.out.println(date);
	}
	
	public static void getDate(Date d) {
		//약한 결합
		Date date = d;
		System.out.println(date);
	}

	public static void memberUse1() {
		// 강한 결합 : 직접 생성
		Member m1 = new Member();
	}
	
	public static void memberUse2(Member m) {
		// 약한 결합 : 생성된 것을 주입 받음 -> 의존 주입(Dependency Injection)
		Member m2 = m;
	}
	
}

//Member를 사용한다 --> Member의 기능에 의존한다 라는 의미
class Member{
	String name;
	String nickName;
	
	public Member() {} 
	/* 
	 * public -> private으로 변경하면 강한결합의 경우 에러가 발생
	 * 약한 결합은 에러가 발생하지 않음 
	 * ( 이미 만들어져 있는 것을 주입 받는 것이기 때문에 만들어질지 안만들어질지 생각하지 않아도 되기 때문)
	 * 약한 결합을 사용하는 프로그래밍은 다른 클래스를 사용할 때 안전하고 유연하게 대처할 수 있다.
	*/ 
	
}