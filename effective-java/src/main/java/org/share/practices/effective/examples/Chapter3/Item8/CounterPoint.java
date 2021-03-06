// Trivial subclass of Point - doesn't add a value component - Page 39
package org.share.practices.effective.examples.Chapter3.Item8;

import java.util.concurrent.atomic.*;

public class CounterPoint extends Point {
    private static final AtomicInteger counter =
        new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }
 
    public int numberCreated() { return counter.get(); }
}
