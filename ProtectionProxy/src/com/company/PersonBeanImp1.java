package com.company;

public class PersonBeanImp1 implements PersonBean{
    String name;
    String gender;
    String interests;
    int rating;
    int ratingCount=0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount==0){
            return 0;
        }
        return rating/ratingCount;
    }

    @Override
    public void setName(String s) {
        this.name = s;
    }

    @Override
    public void setGender(String s) {
        this.gender= s;
    }

    @Override
    public void setInterests(String s) {
        this.interests=s;
    }

    @Override
    public void setHotOrNotRating(int s) {
        this.rating+=s;
        ratingCount++;
    }
}
