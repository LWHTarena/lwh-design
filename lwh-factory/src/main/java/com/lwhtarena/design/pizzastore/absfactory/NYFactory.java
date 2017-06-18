package com.lwhtarena.design.pizzastore.absfactory;


import com.lwhtarena.design.pizzastore.pizza.NYCheesePizza;
import com.lwhtarena.design.pizzastore.pizza.NYPepperPizza;
import com.lwhtarena.design.pizzastore.pizza.Pizza;

public class NYFactory implements AbsFactory {

	
	@Override
	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new NYCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new NYPepperPizza();
		}
		return pizza;

	}

}
