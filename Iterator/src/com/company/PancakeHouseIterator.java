package com.company;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator{
    ArrayList<MenuItem> items;
    int position;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.size()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return items.get(position++);
    }
}
