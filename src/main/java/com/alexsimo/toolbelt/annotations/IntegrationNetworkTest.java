package com.alexsimo.toolbelt.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Denotes that the Test class, goes outsite at network to do the test
 */
@Retention(RetentionPolicy.SOURCE)
public @interface IntegrationNetworkTest {
}
