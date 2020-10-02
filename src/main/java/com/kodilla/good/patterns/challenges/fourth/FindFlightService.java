package com.kodilla.good.patterns.challenges.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlightService {
    private final List<Flight> flightsList = new ArrayList<>();

    public void addFlight(Airport from, Airport to, List<Airport> stops) {
        flightsList.add(new Flight(from, to, stops));
    }

    public void findAllFlightsFrom(Airport departure) {
        System.out.println("Szukam wszystkich wylotow z "+departure.getName()+" ("+departure.getAbbrev()+").");
        flightsList.stream().filter(e -> e.getDeparture().equals(departure)).forEach(System.out::println);
    };

    public void findAllFlightsTo(Airport destination) {
        System.out.println("Szukam wszystkich wylotow do "+destination.getName()+" ("+destination.getAbbrev()+").");
        flightsList.stream().filter(e -> e.getDestination().equals(destination)).forEach(System.out::println);
    };

    public void findAllFlightsFromWithStopover(Airport departure, List<Airport> stopover) {
        System.out.println("Szukam wszystkich wylotow z " + departure.getName() + " (" + departure.getAbbrev() + "), z miedzylodowaniem.");
        for (int i = 0; i < stopover.size(); i++) {
            int finalI = i;
            flightsList.stream().filter(e -> (e.getDeparture().equals(departure)) && (e.getStopsList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopsList().
                            contains(stopover.get(finalI))).forEach(System.out::println);
        }
    };

    public void findAllFlightsToWithStopover(Airport destination, List<Airport> stopover) {
        System.out.println("Szukam lotow do " + destination.getName() + " (" + destination.getAbbrev() + "), z miedzylodowaniem.");
        for (int i = 0; i < stopover.size(); i++) {
            int finalI = i;
            flightsList.stream().filter(e -> (e.getDestination().equals(destination)) && (e.getStopsList() != null)).
                    collect(Collectors.toList()).stream().
                    filter(e -> e.getStopsList().
                            contains(stopover.get(finalI))).forEach(System.out::println);
        }
    };
}
