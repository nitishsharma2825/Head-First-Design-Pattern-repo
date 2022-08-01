package com.company;
public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items=items;
        position=0;
    }

    @Override
    public boolean hasNext() {
        if(position>=items.length || items[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return items[position++];
        }
        return null;
    }
}
