package com.krishna.controlStatements.loop.doWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;
        boolean keepLooping = true;

        do{
            System.out.println("Meow " + a++);
            keepLooping = a < 10;
        } while (keepLooping);
    }
}
