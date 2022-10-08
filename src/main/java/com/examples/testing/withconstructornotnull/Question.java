package com.examples.testing.withconstructornotnull;

import edu.illinois.cs.cs125.jenisol.core.NotNull;
import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Testing @NotNull annotation on constructor parameters.
 */

@Correct(name = "Test Constructor NotNull", version = "2022.10.0", author = "challen@illinois.edu", focused = true)
public class Question {
  private final int stringLength;

  public Question(@NotNull String value) {
    stringLength = value.length();
  }

  public int getStringLength() {
    return stringLength;
  }
}
