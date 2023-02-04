package com.examples.testing.withdeadcodeannotation;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Testing dead code comments.
 */
@Correct(name = "With Dead Code Annotation", version = "2023.2.0", author = "challen@illinois.edu", focused = true)
public class Question {
  public static int whatever(int value) {
    if (value % 2 == 0) {
      return value * 2;
    }
    assert false;
    // mutate-disable
    return -1; // dead code
  }
}
