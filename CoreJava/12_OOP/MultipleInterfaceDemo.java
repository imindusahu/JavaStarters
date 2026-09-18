/*
 * Topic  : OOP
 * Program: Multiple Inheritance using Interface
 * Author : Indu Sahu
 * Purpose: Demonstrate multiple inheritance using interfaces.
 */

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes photo");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music");
    }
}

public class MultipleInterfaceDemo {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();

        smartphone.takePhoto();
        smartphone.playMusic();
    }
}