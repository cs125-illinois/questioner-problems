package com.examples.testing.withfeaturedeadcode;

import edu.illinois.cs.cs125.jenisol.core.FixedParameters;
import edu.illinois.cs.cs125.jenisol.core.RandomParameters;
import edu.illinois.cs.cs125.questioner.lib.Correct;
import edu.illinois.cs.cs125.questioner.lib.Wrap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Test feature-based dead code correction.
 */
@Correct(name = "With Feature Dead Code", author = "challen@illinois.edu", version = "2023.2.0")
@Wrap
public class Question {
  List<Integer> rangeToList(int value) {
    List<Integer> values = new ArrayList<>();
    for (int i = 0; i < value; i += 2) {
      values.add(i);
    }
    return values;
  }

  @FixedParameters
  private static final List<Integer> FIXED = Arrays.asList(0, 8);

  @RandomParameters
  private static int randomParameters(Random random) {
    return random.nextInt(32);
  }
}
