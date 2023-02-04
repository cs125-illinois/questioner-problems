@file:AlsoCorrect

package com.examples.testing.withdeadcodeannotation.correct.kotlin

import edu.illinois.cs.cs125.questioner.lib.AlsoCorrect

/*
 * Testing dead code comments.
 */
fun whatever(value: Int): Int {
  if (value % 2 == 0) {
    return value * 2
  }
  assert(false)
  // mutate-disable
  return -1 // dead code
}