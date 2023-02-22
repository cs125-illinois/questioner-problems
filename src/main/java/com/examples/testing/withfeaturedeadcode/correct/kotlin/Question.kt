package com.examples.testing.withfeaturedeadcode.correct.kotlin

import edu.illinois.cs.cs125.questioner.lib.AlsoCorrect

/*
 * Test feature-based dead code correction.
 */
@AlsoCorrect
class Question {
  fun rangeToList(value: Int): List<Int> {
    val values = mutableListOf<Int>()
    for (i in 0 until value step 2) {
      values.add(i)
    }
    return values
  }
}