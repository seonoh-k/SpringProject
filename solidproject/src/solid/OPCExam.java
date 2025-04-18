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
// 다른 클래스에서 이 클래스를 활용할 여지가 적고, 조건이 추가됨에 따라 수정해야함.
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






// 인터페이스를 작성하는 것으로 개방성과 폐쇄성을 확보할 수 있다.

interface Shape{
   double calculateArea(String shape, double width, double height);
}

class Rectangle implements Shape{

   @Override
   public double calculateArea(String shape, double width, double height) {
      // TODO Auto-generated method stub
      return width * height;
   }
}

class Circle implements Shape{

   @Override
   public double calculateArea(String shape, double width, double height) {
      // TODO Auto-generated method stub
      return Math.PI * width * width;
   }
}

class Sadariggoal implements Shape{

   @Override
   public double calculateArea(String shape, double width, double height) {
      // TODO Auto-generated method stub
      return 0;
   }
   
}
