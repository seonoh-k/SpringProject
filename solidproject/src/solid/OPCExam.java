package solid;

public class OPCExam {

}

interface PaymentGateway {
	void payProcess();
}

class CreateCardPayment implements PaymentGateway {
	
	@Override
	public void payProcess() {
		
	}
}

class CryptoPayment implements PaymentGateway {
	
	@Override
	public void payProcess() {
		
	}
}

// 이 클래스가 왜 OCP를 위반했는가를 설명하고
// OCP를 준수하는 방향으로 코드를 재구성하시오.

class ShapeCalculator {
	public double calculateArea(String shape, double width, double height) {
		if(shape.equals("rectangle")) {
			return width * height;
		}else if(shape.equals("circle")) {
			return Math.PI * width * width;
		}
	// 다른 도형 추가시 if-else 구문 수정 필요
		return 0;
	}
}