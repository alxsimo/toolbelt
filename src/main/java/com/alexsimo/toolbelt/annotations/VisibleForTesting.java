package com.alexsimo.toolbelt.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotates a program element that exists, or is more widely visible than otherwise necessary, only
 * for use in test code.
 *
 * @author Johannes Henkel
 */
@Retention(RetentionPolicy.SOURCE)
public @interface VisibleForTesting {
}