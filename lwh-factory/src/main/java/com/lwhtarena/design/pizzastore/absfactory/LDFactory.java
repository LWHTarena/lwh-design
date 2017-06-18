package com.lwhtarena.design.pizzastore.absfactory;


import com.lwhtarena.design.pizzastore.pizza.LDCheesePizza;
import com.lwhtarena.design.pizzastore.pizza.LDPepperPizza;
import com.lwhtarena.design.pizzastore.pizza.Pizza;

public class LDFactory implements AbsFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;

	}

}
