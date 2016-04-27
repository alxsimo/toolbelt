package com.alexsimo.toolbelt.collections;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Deque;

public final class Platform {
  /**
   * Returns a new array of the given length with the same type as a reference
   * array.
   *
   * @param reference any array of the desired type
   * @param length the length of the new array
   */
  public static <T> T[] newArray(T[] reference, int length) {
    Class<?> type = reference.getClass().getComponentType();

    // the cast is safe because
    // result.getClass() == reference.getClass().getComponentType()
    @SuppressWarnings("unchecked")
    T[] result = (T[]) Array.newInstance(type, length);
    return result;
  }

  static <E> Deque<E> newFastestDeque(int initialCapacity) {
    return new ArrayDeque<E>(initialCapacity);
  }

  private Platform() {}
}