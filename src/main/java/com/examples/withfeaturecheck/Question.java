package com.examples.withfeaturecheck;

import edu.illinois.cs.cs125.jeed.core.Features;
import edu.illinois.cs.cs125.jenisol.core.BoundComplexity;
import edu.illinois.cs.cs125.jenisol.core.FilterParameters;
import edu.illinois.cs.cs125.jenisol.core.SkipTest;
import edu.illinois.cs.cs125.questioner.lib.CheckFeatures;
import edu.illinois.cs.cs125.questioner.lib.Correct;
import edu.illinois.cs.cs125.questioner.lib.FeatureCheckException;
import edu.illinois.cs.cs125.questioner.lib.Wrap;
import edu.illinois.cs.cs125.questioner.lib.features.FeatureHelpers;
import java.util.ArrayList;
import java.util.List;

/*
 * Test whether feature checking works.
 */

@Correct(name = "With Feature Check", author = "challen@illinois.edu", version = "2022.7.0")
@Wrap
public class Question {
  @FilterParameters
  private static void filterParameters(int range) {
    if (range < 0) {
      throw new SkipTest();
    }
    if (range > 1024) {
      throw new BoundComplexity();
    }
  }

  int sumTo(int range) {
    return (range * (range + 1)) / 2;
  }

  @CheckFeatures
  private static List<String> checkFeatures(Features solution, Features submission) {
    if (FeatureHelpers.usesLoop(submission)) {
      throw new FeatureCheckException("Submission uses a loop");
    }
    return new ArrayList<>();
  }
}
