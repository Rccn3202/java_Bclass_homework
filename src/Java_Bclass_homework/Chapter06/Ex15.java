package Java_Bclass_homework.Chapter06;

public class Ex15 {

	public static void main(String[] args) {
		//
		
		MemberService memberService=new MemberService();
		boolean result=memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id or passward wrong");
		}
	}

}
class MemberService{
	
	boolean login() {
		String id;
		String password;
		
		
	}
	
	void logout() {
		String id;
		
	}
	
}