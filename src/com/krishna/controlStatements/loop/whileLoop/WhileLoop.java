package com.krishna.controlStatements.loop.whileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        boolean keepLooping = true;
        while (keepLooping) {
            System.out.println("Meow " + i++);
            keepLooping = false;
        }
    }
}
