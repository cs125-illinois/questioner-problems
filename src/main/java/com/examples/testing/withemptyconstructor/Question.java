package com.examples.testing.withemptyconstructor;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Test to make sure we can parse the empty constructor.
 */

@Correct(name = "Test Empty Constructor", version = "2022.9.0", author = "challen@illinois.edu")
public class Question {
  private int value = 0;

  int next() {
    return value++;
  }
}
