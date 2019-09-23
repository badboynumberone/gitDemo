package InterfaceDemo.Impl;


import InterfaceDemo.Interface.InkBoxInterface;
import InterfaceDemo.Interface.PaperInterface;

public class Printer {
    public void print(InkBoxInterface box, PaperInterface paper) {
        System.out.println(box.getColor());
        System.out.println(paper.getSize());
    }
}
