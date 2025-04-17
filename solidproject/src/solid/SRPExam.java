package solid;

public class SRPExam {
	public static void main(String[] args) {
		
	// SRP의 위반 사례와 개선 방안
		
	}
}

// 하나의 클래스가 두개의 기능을 가지기 때문에 SRP 위반
//class UserController {
//	public void username() {
//		System.out.println("유저 어쩌구 저쩌구 나가세요");
//	}
//
//	public void sendMail() {
//		System.out.println("느그느그느그느그 느금마");
//	}
//}

// SRP를 위해 위의 코드를 변경한 사례
// 1. 책임을 분리한다 = 코드를 업무 단위(기능)별로 구분한다. 
// - 유지보수성 측면에서 유리하다
// - 결합도를 낮출 수 있다
// 2. SRP를 준수하면 클래스가 하는 일이 적어진다 (필요한 기능만 사용)
//class UserController {
//	public void username() {
//		System.out.println("유저 어쩌구 저쩌구 나가세요");
//	}
//}

//class EmailController() {
//	public void sendMail() {
//		System.out.println("느그느그느그느그 느금마");
//	}
//}