// Marker annotation type declaration - Page 169
package org.share.practices.effective.examples.Chapter6.Item35;

import java.lang.annotation.*;

/**
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}