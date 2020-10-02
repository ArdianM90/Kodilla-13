package com.kodilla.good.patterns.challenges.fourth;

import java.util.List;

public class Flight {
    private final Airport departure;
    private final Airport destination;
    private final List<Airport> stopovers;

    public Flight(Airport departure, Airport destination, List<Airport> stopovers) {
        this.departure = departure;
        this.destination = destination;
        this.stopovers = stopovers;
    }

    public Airport getDeparture() {
        return departure;
    }

    public Airport getDestination() {
        return destination;
    }

    public List<Airport> getStopsList() {
        return stopovers;
    }

    public boolean isThrough(Airport airport) {
        return stopovers.contains(airport);
    }

    @Override
    public String toString() {
        String exit = "Lot " + departure.getAbbrev() + "-" + destination.getAbbrev() + ": wylot z " + departure.getName() + ", ladowanie w " + destination.getName();
        if (stopovers == null) {
            exit += ", brak miedzylodowan.";
        } else {
            exit += ", miedzylodowanie w: "+stopovers.get(0);
            int i = 1;
            while (i < stopovers.size()) {
                exit += ", "+stopovers.get(i);
                i++;
            }
            exit += ".";
        }
        return exit;
    }
}
