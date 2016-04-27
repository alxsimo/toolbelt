package com.alexsimo.toolbelt.checks;

import com.alexsimo.toolbelt.annotations.CanIgnoreReturnValue;

import static com.alexsimo.toolbelt.checks.Preconditions.checkState;

/**
 * Precondition checks useful in collection implementations.
 */
final class CollectPreconditions {

  static void checkEntryNotNull(Object key, Object value) {
    if (key == null) {
      throw new NullPointerException("null key in entry: null=" + value);
    } else if (value == null) {
      throw new NullPointerException("null value in entry: " + key + "=null");
    }
  }

  @CanIgnoreReturnValue
  public static int checkNonnegative(int value, String name) {
    if (value < 0) {
      throw new IllegalArgumentException(name + " cannot be negative but was: " + value);
    }
    return value;
  }

  static void checkPositive(int value, String name) {
    if (value <= 0) {
      throw new IllegalArgumentException(name + " must be positive but was: " + value);
    }
  }

  /**
   * Precondition tester for {@code Iterator.remove()} that throws an exception with a consistent
   * error message.
   */
  static void checkRemove(boolean canRemove) {
    checkState(canRemove, "no calls to next() since the last call to remove()");
  }
}
