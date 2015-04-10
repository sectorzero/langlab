package org.sectorzero.basic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FooTest {

  Foo foo;

  @Before
  public void setup() {
    foo = new Foo();
  }

  @Test
  public void doSomething() {
    foo.doSomething();
  }

  @Test
  public void someOp() {
    assertEquals(1.0, foo.someOp(7), 0.0001);
  }

}