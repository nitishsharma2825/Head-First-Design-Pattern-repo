package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ChocoFactory1 factory=ChocoFactory1.getInstance();
        System.out.println(factory.isEmpty());
        factory.fill();
        System.out.println(factory.isEmpty());

        //
        ChocoFactory_withsync factory2=ChocoFactory_withsync.getInstance();
        System.out.println(factory2.isEmpty());
        factory2.fill();
        System.out.println(factory2.isEmpty());

        //

        ChocoFactory_withdoublecheckedlocking factory3=ChocoFactory_withdoublecheckedlocking.getInstance();
        System.out.println(factory3.isEmpty());
        factory3.fill();
        System.out.println(factory3.isEmpty());
    }
}
