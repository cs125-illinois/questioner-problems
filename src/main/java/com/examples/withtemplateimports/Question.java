package com.examples.withtemplateimports;

import edu.illinois.cs.cs125.questioner.lib.Correct;
import edu.illinois.cs.cs125.questioner.lib.TemplateImports;
import edu.illinois.cs.cs125.questioner.lib.Wrap;
import java.util.Arrays;
import java.util.List;

/*
 * Example to test use of import statements in method templates.
 */

@Correct(name = "With Template Imports", version = "2022.7.0", author = "challen@illinois.edu")
@Wrap
@TemplateImports(paths = "java.util.List,java.util.ArrayList,java.util.Arrays")
public class Question {
  public static List<Integer> max(int first, int second) {
    return Arrays.asList(first, second);
  }
}
