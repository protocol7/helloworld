package com.protocol7.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanTest {

  private Roman roman = new Roman();

  @Test
  public void testSimple() {
    assertEquals("I", roman.i2r(1));
    assertEquals("V", roman.i2r(5));
    assertEquals("X", roman.i2r(10));
    assertEquals("L", roman.i2r(50));
    assertEquals("C", roman.i2r(100));
    assertEquals("D", roman.i2r(500));
    assertEquals("M", roman.i2r(1000));
  }

  @Test
  public void testMultiples() {
    assertEquals("II", roman.i2r(2));
    assertEquals("III", roman.i2r(3));
    assertEquals("CC", roman.i2r(200));
    assertEquals("MM", roman.i2r(2000));

    // on the other hand, some multiples are not ok
    assertEquals("X", roman.i2r(10));
    assertEquals("C", roman.i2r(100));
    assertEquals("M", roman.i2r(1000));
  }

  @Test
  public void testAddingCombinations() {
    assertEquals("VI", roman.i2r(6));
    assertEquals("VII", roman.i2r(7));
    assertEquals("VIII", roman.i2r(8));
    assertEquals("XI", roman.i2r(11));
    assertEquals("XV", roman.i2r(15));
  }

  @Test
  public void testSubtractingCombinations() {
    assertEquals("IV", roman.i2r(4));
    assertEquals("IX", roman.i2r(9));
    assertEquals("XLIX", roman.i2r(49));
  }

  @Test
  public void test1999() {
    assertEquals("MCMXCIX", roman.i2r(1999));
  }

  public void testTooSmall() {
    assertEquals("", roman.i2r(0));
    assertEquals("", roman.i2r(-1));

  }
}
