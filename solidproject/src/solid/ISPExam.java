package solid;

import javax.swing.text.Document;

public class ISPExam {

}

interface Printer {
    void print(Document d);
}

interface Scanner {
    void scan(Document d);
}

class MultiFunctionMachine implements Printer, Scanner {
    public void print(Document d) { /* 출력 */ }
    public void scan(Document d) { /* 스캔 */ }
}