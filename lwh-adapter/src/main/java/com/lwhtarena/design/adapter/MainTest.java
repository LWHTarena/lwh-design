package com.lwhtarena.design.adapter;


import com.lwhtarena.design.adapter.adapter.TurkeyAdapter2;
import com.lwhtarena.design.adapter.duck.Duck;
import com.lwhtarena.design.adapter.duck.GreenHeadDuck;
import com.lwhtarena.design.adapter.turkey.WildTurkey;

public class MainTest {
	public static void main(String[] args) {
		GreenHeadDuck duck=new GreenHeadDuck();
		
		WildTurkey turkey=new WildTurkey();
		
		Duck duck2turkeyAdapter=new TurkeyAdapter2();
		turkey.gobble();
		turkey.fly();
		duck.quack();
		duck.fly();
		duck2turkeyAdapter.quack();
		duck2turkeyAdapter.fly();
		
	
	}
}
