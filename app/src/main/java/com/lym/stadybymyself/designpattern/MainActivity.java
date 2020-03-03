package com.lym.stadybymyself.designpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lym.stadybymyself.R;
import com.lym.stadybymyself.designpattern.demo.statepattern.StatePatternTest;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        FactoryPatternTest.test();
//        AbstractFactoryPatternTest.test();
//        BuilderPatternTest.test();
//        PrototypePatternTest.test();
//        AdapterPatternTest.test();
//        BridgePatternTest.test();
//        FilterPatternTest.test();
//        ConpositePatternTest.test();
//        DecoratorPatternTest.test();
//        FacadePatternTest.test();
//        FlyweightPatternTest.test();
//        ProxyPatternTest.test();
//        ChainOfResponsibilityPatternTest.test();
//        CommandPatternTest.test();
//        InterpreterPatternTest.test();
//        IteratorPatternTest.test();
//        MediatorPatternTest.test();
//        MementoPatternTest.test();
        StatePatternTest.test();
//        NullObjectPatternTest.test();
//        StrategyPatternTest.test();
//        TemplatePatternTest.test();
//        VisitorPatternTest.test();
    }
}
