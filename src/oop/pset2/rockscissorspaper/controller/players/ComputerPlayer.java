package oop.pset2.rockscissorspaper.controller.players;

public class ComputerPlayer implements Player {
    @Override
    public void play() {
        try {
            Thread.sleep(2 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ComputerPlayer: I want to play too ");

    }
}
