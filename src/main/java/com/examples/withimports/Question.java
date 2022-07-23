package com.examples.withimports;

import edu.illinois.cs.cs125.questioner.lib.Correct;
import java.util.Arrays;
import java.util.List;

/*
 * Example to test use of import statements.
 */

@Correct(name = "With Imports", version = "2022.7.0", author = "challen@illinois.edu")
public class Question {
  public static List<Integer> max(int first, int second) {
    return Arrays.asList(first, second);
  }
}
