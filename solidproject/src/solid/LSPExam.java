package solid;

public class LSPExam {
	
}

abstract class Bird {
    abstract void move();
}

class FlyingBird extends Bird {
	void move() { fly(); }
	void fly() { /* 비행 구현 */ }
}

class Penguin extends Bird {
	void move() { swim(); }
	void swim() { /* 수영 구현 */ }
}