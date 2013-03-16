package com.protocol7.fizzbuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

import org.junit.Test;

public class FizzBuzzStage2Test {

  private FizzBuzzStage2 fizzBuzz = new FizzBuzzStage2();

  @Test
  public void divisableByThree() {
    assertEquals("Fizz", fizzBuzz.generate().get(2));
    assertEquals("Fizz", fizzBuzz.generate().get(20));
  }

  @Test
  public void containsThree() {
    assertEquals("Fizz", fizzBuzz.generate().get(31));
    assertEquals("Fizz", fizzBuzz.generate().get(12));
  }

  @Test
  public void divisableByFive() {
    assertEquals("Buzz", fizzBuzz.generate().get(4));
    assertEquals("Buzz", fizzBuzz.generate().get(19));
  }

  @Test
  public void containsFive() {
    assertEquals("Buzz", fizzBuzz.generate().get(51));
  }

  @Test
  public void divisableByFiveAndThree() {
    assertEquals("FizzBuzz", fizzBuzz.generate().get(29));
    assertEquals("FizzBuzz", fizzBuzz.generate().get(14));
  }

  @Test
  public void containsFiveAndThree() {
    assertEquals("FizzBuzz", fizzBuzz.generate().get(52));
  }

  @Test
  public void notDivisableByFiveOrThree() {
    assertEquals("1", fizzBuzz.generate().get(0));
    assertEquals("22", fizzBuzz.generate().get(21));
  }

  @Test
  public void print() {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream out = new PrintStream(baos);
    fizzBuzz.print(out);
    String actual = new String(baos.toByteArray(), Charset.forName("ASCII"));

    assertTrue(actual.startsWith("1\n2\nFizz\n4\nBuzz"));
  }
}
