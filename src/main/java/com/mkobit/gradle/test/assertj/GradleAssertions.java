package com.mkobit.gradle.test.assertj;

import com.mkobit.gradle.test.assertj.testkit.BuildResultAssert;
import com.mkobit.gradle.test.assertj.testkit.BuildTaskAssert;
import org.gradle.testkit.runner.BuildResult;
import org.gradle.testkit.runner.BuildTask;

import javax.annotation.Nullable;

/**
 * Assertions for Gradle.
 *
 * Soft assertions are provided through {@link GradleSoftAssertions}.
 * @see BuildResultAssert
 * @see BuildTaskAssert
 */
public final class GradleAssertions {
  private GradleAssertions() {
  }

  /**
   * Assert on a {@link BuildTask}.
   * @param buildTask the task to assert on
   * @return a new {@link BuildTaskAssert} instance
   */
  public static BuildTaskAssert assertThat(final @Nullable BuildTask buildTask) {
    return new BuildTaskAssert(buildTask);
  }

  /**
   * Assert on a {@link BuildResult}.
   * @param buildResult the result to assert on
   * @return a new {@link BuildResultAssert} instance
   */
  public static BuildResultAssert assertThat(final @Nullable BuildResult buildResult) {
    return new BuildResultAssert(buildResult);
  }
}
