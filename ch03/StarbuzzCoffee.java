// -*- mode: java; coding: utf-8 -*-
// file: StarbuzzCoffee.java
//     Created:       <2019/11/18 13:01:07>
//     Last Modified: <2019/11/20 11:45:35>

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                           + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                           + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                           + " $" + beverage3.cost());
        System.out.println(beverage3.getDescription()
                           + " $" + String.format("%.2f", beverage3.cost()));
    }
}
