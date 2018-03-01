package oop.pset2.rockscissorspaper.controller.players;

public class ComputerPlayer extends Player {

    @Override
    public void start() {
        System.out.println("Computer: I want to play ");

        try {
            Thread.sleep(1 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Computer: let's start ");
    }
}