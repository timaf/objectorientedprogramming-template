package oop.pset2.rockscissorspaper.controller.players;

public class HumenPlayer extends Player {

    @Override
    public void start() {
        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Humen: I want to play too ");

    }
}
