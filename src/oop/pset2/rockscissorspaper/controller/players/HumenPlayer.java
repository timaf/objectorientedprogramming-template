package oop.pset2.rockscissorspaper.controller.players;

public class HumenPlayer implements Player {

    @Override
    public void play() {
        System.out.println("HumenPlayer: I want to play ");

        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HumenPlayer: let's start ");
    }
}
