package InterfaceDemo;

import InterfaceDemo.Impl.InkBoxImpl;
import InterfaceDemo.Impl.PaperImpl;
import InterfaceDemo.Impl.Printer;
import InterfaceDemo.Interface.InkBoxInterface;
import InterfaceDemo.Interface.PaperInterface;


public class Test {
    public static void main(String[] args) {
        InkBoxInterface box = new InkBoxImpl();

        PaperInterface paper = new PaperImpl();

        new Printer().print(box, paper);

    }
}
