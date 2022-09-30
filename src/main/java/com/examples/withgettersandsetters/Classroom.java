package com.examples.withgettersandsetters;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Getter and setter testing.
 */

@Correct(name = "Classroom Getters and Setters", version = "2022.9.0", author = "challen@illinois.edu")
public class Classroom {
  private final String name;
  private int capacity;

  public Classroom(String setName, int setEnrollment) {
    assert setEnrollment >= 0;
    assert setName != null;
    name = setName;
    capacity = setEnrollment;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int setEnrollment) {
    assert setEnrollment >= 0;
    capacity = setEnrollment;
  }

  public String getName() {
    return name;
  }
}
