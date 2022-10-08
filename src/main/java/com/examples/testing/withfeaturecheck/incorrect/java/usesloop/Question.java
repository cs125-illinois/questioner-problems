package com.examples.testing.withfeaturecheck.incorrect.java.usesloop;

import edu.illinois.cs.cs125.questioner.lib.Incorrect;

@Incorrect(reason = "features")
public class Question {
  int sumTo(int range) {
    int sum = 0;
    for (int i = 0; i <= range; i++) {
      sum += i;
    }
    return sum;
  }
}
