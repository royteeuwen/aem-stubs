package com.cognifide.aem.stubs.core.util;

import java.util.Iterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public final class StreamUtils {

  private StreamUtils() {
    // intentionally empty
  }

  public static <T> Stream<T> from(Iterator<T> iterator) {
    return StreamSupport.stream(Spliterators.spliteratorUnknownSize(iterator, 0), false);
  }
}
