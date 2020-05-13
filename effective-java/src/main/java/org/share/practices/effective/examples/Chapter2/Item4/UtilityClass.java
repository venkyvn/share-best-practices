// Noninstantiable utility class
package org.share.practices.effective.examples.Chapter2.Item4;

public class UtilityClass {
    // Suppress default constructor for noninstantiability
    private UtilityClass() {
        throw new AssertionError();
    }
}
