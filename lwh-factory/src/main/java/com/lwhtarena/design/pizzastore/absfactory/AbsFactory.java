package com.lwhtarena.design.pizzastore.absfactory;


import com.lwhtarena.design.pizzastore.pizza.Pizza;

public interface AbsFactory {
	public Pizza CreatePizza(String ordertype) ;
}
