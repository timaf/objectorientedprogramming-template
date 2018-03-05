package oop.pset3.RockScissorsPaper_polymorphism.controller.players;


import oop.pset3.RockScissorsPaper_polymorphism.controller.model.GroupOfMoves;
import oop.pset3.RockScissorsPaper_polymorphism.controller.model.Move;
import java.util.Optional;
import java.util.Scanner;
import static java.util.stream.Collectors.joining;

public class FirstPlayer implements Player {

    @Override
    public Move makeAmove(GroupOfMoves moves){
        System.out.println("Computer: I have chosen, your turn . ");
        System.out.println(" You have the following moves: ");
        show(moves);
        System.out.println("Please pick your move: ");
        Scanner scanner = new Scanner(System.in);
        String humanMove = scanner.nextLine();
        return toMove(humanMove, moves);
    }

    private void show(GroupOfMoves moves){
        String movesList = moves.getMoves().stream()
                .map(move -> move.sayWhichMove())
                .collect(joining(", "));
        System.out.println(movesList);
    }

    private Move toMove(String humanMove, GroupOfMoves moves){
        Optional<Move> chosenMove = moves.getMoves().stream()
                .filter(move -> move.sayWhichMove().equalsIgnoreCase(humanMove))
                .findFirst();
        Move myMove = chosenMove.orElse(null);
        return myMove;

    }

}
