package InterfaceDemo.Impl;

import InterfaceDemo.Interface.PaperInterface;

public class PaperImpl implements PaperInterface {
    @Override
    public String getSize() {
        return "some thing";
    }
}
