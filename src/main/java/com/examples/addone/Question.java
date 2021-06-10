package com.examples.addone;

import edu.illinois.cs.cs125.questioner.lib.Correct;
import edu.illinois.cs.cs125.questioner.lib.Wrap;

/*
 * Write a method `addOne` that returns its `int` argument plus one.
 */

@Correct(name = "Add One", author = "challen@illinois.edu", version = "2021.6.0")
@Wrap
public class Question {
  int addOne(int value) {
    return value + 1;
  }
}
