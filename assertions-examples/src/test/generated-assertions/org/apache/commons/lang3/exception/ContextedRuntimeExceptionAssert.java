package org.apache.commons.lang3.exception;

/**
 * {@link ContextedRuntimeException} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractContextedRuntimeExceptionAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class ContextedRuntimeExceptionAssert extends AbstractContextedRuntimeExceptionAssert<ContextedRuntimeExceptionAssert, ContextedRuntimeException> {

  /**
   * Creates a new <code>{@link ContextedRuntimeExceptionAssert}</code> to make assertions on actual ContextedRuntimeException.
   * @param actual the ContextedRuntimeException we want to make assertions on.
   */
  public ContextedRuntimeExceptionAssert(ContextedRuntimeException actual) {
    super(actual, ContextedRuntimeExceptionAssert.class);
  }

  /**
   * An entry point for ContextedRuntimeExceptionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myContextedRuntimeException)</code> and get specific assertion with code completion.
   * @param actual the ContextedRuntimeException we want to make assertions on.
   * @return a new <code>{@link ContextedRuntimeExceptionAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static ContextedRuntimeExceptionAssert assertThat(ContextedRuntimeException actual) {
    return new ContextedRuntimeExceptionAssert(actual);
  }
}