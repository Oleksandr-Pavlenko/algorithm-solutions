package com.algorithmen.hashmap;

import java.util.*;

/*You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi.
Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.*/
public class DestinationCity {
    // Runtime beats 100%, memory 98%
    public String destCity(List<List<String>> paths) {
        Set<String> startingCities = new HashSet<>();
        for (List<String> path : paths) {
            startingCities.add(path.getFirst());
        }

        for (List<String> path : paths) {
            String destination = path.getLast();
            if (!startingCities.contains(destination)) {
                return destination;
            }
        }

        throw new IllegalStateException("There must be a final city");
    }
}
