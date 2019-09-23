package InterfaceDemo.Impl;

import InterfaceDemo.Interface.InkBoxInterface;

public class InkBoxImpl implements InkBoxInterface {
    @Override
    public String getColor() {
        return "我爱你，傻逼";
    }
}
