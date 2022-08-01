package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu dinerMenu=new DinerMenu();
        Menu menu=new PancakeHouseMenu();
        Menu cafeMenu=new CafeMenu();
        ArrayList<Menu> menus=new ArrayList<>();
        menus.add(dinerMenu);
        menus.add(menu);
        Waitress waitress=new Waitress(menus);
        waitress.printMenu();
    }
}
