// Generic Function interface - Page 122
package org.share.practices.effective.examples.Chapter5.Item28;

interface Function<T> {
    T apply(T arg1, T arg2);
}
