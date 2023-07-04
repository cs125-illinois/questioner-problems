package com.examples.testing.withkotlinfauxproperty;

import edu.illinois.cs.cs125.questioner.lib.Correct;

/*
 * Question to test detection of Kotlin faux properties in Jenisol 2023.7.0.
 */
@Correct(name = "Kotlin Faux Property Testing", version = "2023.7.0", author = "challen@illinois.edu")
public class Book {
  private String name;

  public void setName(String setName) {
    name = setName;
  }

  public String getName() {
    return name;
  }
}
