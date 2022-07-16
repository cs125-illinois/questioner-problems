package com.examples.withfeaturecheck.incorrect.kotlin.usesloop

import edu.illinois.cs.cs125.questioner.lib.Incorrect

@Incorrect(reason = "features")
class Question {
  fun sumTo(range: Int): Int {
    var sum = 0
    (0..range).forEach { i ->
      sum += i
    }
    return sum
  }
}