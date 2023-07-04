package com.examples.testing.withkotlinfauxproperty.correct.kotlin

import edu.illinois.cs.cs125.questioner.lib.AlsoCorrect

/*
 * Question to test detection of Kotlin faux properties in Jenisol 2023.7.0.
 */

@AlsoCorrect
class Book {
  var name: String? = null
}