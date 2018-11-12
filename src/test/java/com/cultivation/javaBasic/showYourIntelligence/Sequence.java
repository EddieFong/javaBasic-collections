package com.cultivation.javaBasic.showYourIntelligence;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;


public class Sequence implements Iterable<Integer> {
    private final Integer start;
    private final Integer end;

    public Sequence(Integer start, Integer end) {
        if (start >= end) { throw new IllegalArgumentException("Start must be smaller than End."); }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(start, end);
    }
}

class SequenceIterator implements Iterator<Integer> {
    // TODO: You can add additional fields or methods if you want.
    // <--start
    private List<Integer> sequence;
    private int current = 0;
    // --end-->

    SequenceIterator(Integer start, Integer end) {
        // TODO: please implements the following code to pass the test
        // <--start
        sequence = new ArrayList<>();
        for(int i=start;i<end;i++) {
            sequence.add(i);
        }

        // --end-->
    }

    @Override
    public boolean hasNext() {
        // TODO: please implements the following code to pass the test
        // <--start
        return current < sequence.size() && sequence.get(current) != null;
        // --end-->
    }

    @Override
    public Integer next() {
        // TODO: please implements the following code to pass the test
        // <--start
        return sequence.get(current++);
        // --end-->
    }
}
