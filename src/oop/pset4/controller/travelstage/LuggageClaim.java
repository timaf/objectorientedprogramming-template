package oop.pset4.controller.travelstage;

import oop.pset4.model.Luggage;

import java.time.Duration;

public class LuggageClaim implements TravelStage {

    @Override
    public Luggage process(Luggage luggage) {
        // TODO add 15 minutes to the processing time
        Duration fifthDuration = Duration.ofMinutes(15);
        Duration waitingDuration = luggage.getWaitingDuration().plus(fifthDuration);
        luggage.setWaitingDuration(waitingDuration);
        return luggage;
    }
}
