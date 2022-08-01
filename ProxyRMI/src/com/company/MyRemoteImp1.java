package com.company;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp1 extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImp1() throws RemoteException {}

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, hi";
    }
}
