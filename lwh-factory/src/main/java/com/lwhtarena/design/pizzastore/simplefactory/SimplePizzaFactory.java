package com.lwhtarena.design.pizzastore.simplefactory;


import com.lwhtarena.design.pizzastore.pizza.CheesePizza;
import com.lwhtarena.design.pizzastore.pizza.GreekPizza;
import com.lwhtarena.design.pizzastore.pizza.PepperPizza;
import com.lwhtarena.design.pizzastore.pizza.Pizza;

public class SimplePizzaFactory {

	public Pizza CreatePizza(String ordertype) {
		Pizza pizza = null;

		if (ordertype.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (ordertype.equals("greek")) {
			pizza = new GreekPizza();
		} else if (ordertype.equals("pepper")) {
			pizza = new PepperPizza();
		}
		return pizza;

	}

}
