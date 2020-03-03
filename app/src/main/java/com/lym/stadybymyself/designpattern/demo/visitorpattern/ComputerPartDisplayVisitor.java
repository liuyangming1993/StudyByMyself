package com.lym.stadybymyself.designpattern.demo.visitorpattern;

import com.lym.stadybymyself.designpattern.LogUtil;

/**
 * Created by liuyangming on 17-11-16.
 * Description:
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Computer computer) {
        LogUtil.i("visit: Computer");
    }

    @Override
    public void visit(Mouse mouse) {
        LogUtil.i("visit: Mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        LogUtil.i("visit: Keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        LogUtil.i("visit: Monitor");
    }
}
