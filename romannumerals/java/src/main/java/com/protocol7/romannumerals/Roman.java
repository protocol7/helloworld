package com.protocol7.romannumerals;

import java.util.Arrays;

public class Roman {

  public String convert(int i) {
    return fill(i / 1000, 'M')
      + format(i / 100 % 10, 'C', 'D', 'M')
      + format(i / 10 % 10, 'X', 'L', 'C')
      + format(i % 10, 'I', 'V', 'X');
  }

  private String format(int i, char digit, char five, char ten) {
    switch (i) {
      case 1:
      case 2:
      case 3:
        return fill(i, digit);
      case 4:
        return string(digit, five);
      case 5:
        return string(five);
      case 6:
      case 7:
      case 8:
        return five + fill(i - 5, digit);
      case 9:
        return string(digit, ten);
      default:
        return "";
    }
  }

  private String string(char... cs) {
    return new String(cs);
  }

  private String fill(int len, char c) {
    char[] cs = new char[len];
    Arrays.fill(cs, c);
    return new String(cs);
  }
}
