package com.examples.cougarfeliform;

import edu.illinois.cs.cs125.jenisol.core.Both;
import edu.illinois.cs.cs125.jenisol.core.FixedParameters;
import edu.illinois.cs.cs125.jenisol.core.RandomParameters;
import edu.illinois.cs.cs125.jenisol.core.Two;
import edu.illinois.cs.cs125.questioner.lib.Correct;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Create and complete the implementation of the `Cougar` class.
 * Your class should be public, not final and not abstract, inherit from the `Feliform` class,
 * and provide the following methods:
 *
 * 1. Constructor that takes a `int` parameter `speed` and a second `weight`.
 * Creates a new `Cougar` with the passed speed and weight.
 * You should call the `Feliform` constructor and pass it the `String` "cougar" to identify the type of this
 * feliform.
 * 1. Public instance method `dangerousness` that takes no arguments and returns an `int`.
 * Return the dangerousness of this cougar which equals its speed times its weight.
 * 1. Override `public boolean equals(Object other)`.
 * Return `true` if `other` is a `Cougar` with the same speed and weight, and `false` otherwise.
 * Note that `other` may be `null` or not a `Housecat`.
 *
 * Finally, note that your class should not expose any of its internal state publicly.
 */
@Correct(name = "Cougar Feliform", version = "2021.7.0", author = "challen@illinois.edu")
public class Cougar extends Feliform {
  private final int speed;
  private final int weight;

  @FixedParameters
  private static final List<Two<Integer, Integer>> FIXED =
      Arrays.asList(new Two<>(10, 10), new Two<>(10, 10), new Two<>(11, 9), new Two<>(10, 9));

  @RandomParameters
  private static Two<Integer, Integer> randomParameters(Random random) {
    return new Two<>(random.nextInt(1024), random.nextInt(1024));
  }

  public Cougar(int setSpeed, int setWeight) {
    super("cougar");
    speed = setSpeed;
    weight = setWeight;
  }

  @Override
  public int dangerousness() {
    return speed * weight;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Cougar housecat)) {
      return false;
    }
    return speed == housecat.speed && weight == housecat.weight;
  }

  @Both
  public static String getType(Feliform feliform) {
    return feliform.getType();
  }
}
