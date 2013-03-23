package com.protocol7.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanTest {

  private Roman roman = new Roman();

  @Test
  public void testSimple() {
    assertEquals("I", roman.convert(1));
    assertEquals("V", roman.convert(5));
    assertEquals("X", roman.convert(10));
    assertEquals("L", roman.convert(50));
    assertEquals("C", roman.convert(100));
    assertEquals("D", roman.convert(500));
    assertEquals("M", roman.convert(1000));
  }

  @Test
  public void testMultiples() {
    assertEquals("II", roman.convert(2));
    assertEquals("III", roman.convert(3));
    assertEquals("CC", roman.convert(200));
    assertEquals("MM", roman.convert(2000));

    // on the other hand, some multiples are not ok
    assertEquals("X", roman.convert(10));
    assertEquals("C", roman.convert(100));
    assertEquals("M", roman.convert(1000));
  }

  @Test
  public void testAddingCombinations() {
    assertEquals("VI", roman.convert(6));
    assertEquals("VII", roman.convert(7));
    assertEquals("VIII", roman.convert(8));
    assertEquals("XI", roman.convert(11));
    assertEquals("XV", roman.convert(15));
  }

  @Test
  public void testSubtractingCombinations() {
    assertEquals("IV", roman.convert(4));
    assertEquals("IX", roman.convert(9));
    assertEquals("XLIX", roman.convert(49));
  }

  @Test
  public void test1999() {
    assertEquals("MCMXCIX", roman.convert(1999));
  }

  public void testTooSmall() {
    assertEquals("", roman.convert(0));
    assertEquals("", roman.convert(-1));

  }
}
