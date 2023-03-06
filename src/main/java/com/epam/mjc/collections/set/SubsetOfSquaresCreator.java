package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> resultSet = new TreeSet<>();
        for (Integer addToSet : sourceList) {
            if (addToSet * addToSet >= lowerBound && addToSet * addToSet <= upperBound)
                resultSet.add(addToSet * addToSet);
        }
        return resultSet;
    }
}
