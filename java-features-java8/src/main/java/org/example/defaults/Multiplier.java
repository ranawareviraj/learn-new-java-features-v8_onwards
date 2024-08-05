package org.example.defaults;

import java.util.List;

public interface Multiplier {
    public int multiply(List<Integer> integerList);

    default int size(List<Integer> list){
        return list.size();
    }
}
