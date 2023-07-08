package org.example;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        orangeBox.add(new Orange(1));
        orangeBox.add(new Orange(2));
        //orangeBox.add(new Apple(1)); --- Ошибка компиляции
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeigth());
        // 3
        Box<Apple> appleBox = new Box<>();
        appleBox.add(new Apple(2));
        appleBox.add(new GoldenApple(3));
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeigth()); //5
        Box<GoldenApple> goldenAppleBox = new Box<>();
        goldenAppleBox.add(new GoldenApple(3));
        System.out.println("Вес коробки с яблоками Golden: " + goldenAppleBox.getWeigth()); //3
        Box<Orange> orangeBox1 = new Box<>();
        orangeBox.moveTo(orangeBox1);
        System.out.println("Вес коробки с апельсинами №2: " + orangeBox1.getWeigth());
        System.out.println("Вес коробки с апельсинами №1: " + orangeBox.getWeigth());

    }


}