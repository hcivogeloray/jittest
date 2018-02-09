package com.hcivogeloray.anotherlib;

/**
 * Created by yarolegovich on 2/9/18.
 */

public class AnotherProcessor {

  public static AnotherProcessor create() {
    return new AnotherProcessor();
  }

  public String process(String data) {
    return new StringBuilder(data)
        .reverse()
        .toString();
  }
}
