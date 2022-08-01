package com.company;

import java.rmi.Naming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            MyRemote service=new MyRemoteImp1();
            Naming.rebind("RemoteHello",service);
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
