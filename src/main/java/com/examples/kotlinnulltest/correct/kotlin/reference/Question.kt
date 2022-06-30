@file:AlsoCorrect

package com.examples.kotlinnulltest.correct.kotlin.reference

import edu.illinois.cs.cs125.questioner.lib.AlsoCorrect

/*
 * Return the length of a string.
 * Here for Kotlin null memory usage checking.
 */

fun length(test: String?): Int {
  require(test != null)
  return test.length
}