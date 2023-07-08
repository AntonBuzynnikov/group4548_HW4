package org.example;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit>{
    private List<E> userList;
    private int weigth;

    public Box(){
        this.userList = new ArrayList<>();
    }

    public int getWeigth(){
        this.weigth = 0;
        for (E fruit: userList) {
            this.weigth += fruit.getWeight();
        }
        return this.weigth;
    }
    public void moveTo(Box<E> box){
        for (E fruit:userList) {
           box.add(fruit);
        }
        userList.clear();

    }
    public void add(E fruit){
        userList.add(fruit);
    }

}

