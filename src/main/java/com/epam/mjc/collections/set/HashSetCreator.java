package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer addToSet : sourceList) {
            resultSet.add(addToSet);
            if (addToSet % 2 == 0) {
                while (addToSet % 2 == 0) {
                    addToSet = addToSet / 2;
                    resultSet.add(addToSet);
                }
            } else resultSet.add(addToSet * 2);
        }
        return resultSet;
    }

}
