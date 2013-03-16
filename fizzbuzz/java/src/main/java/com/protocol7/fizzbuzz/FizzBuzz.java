package com.protocol7.fizzbuzz;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  public static void main(String[] args) {
    new FizzBuzz().print(System.out);
  }

  public List<String> generate() {
    List<String> result = new ArrayList<String>();
    for (int i = 1; i<101; i++) {
      if (i % 15 == 0) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        result.add(Integer.toString(i));
      }
    }

    return result;
  }

  public void print(final PrintStream out) {
    for (String s : generate()) {
      out.println(s);
    }
  }
}
