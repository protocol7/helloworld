package com.protocol7.fizzbuzz;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzStage2 {

  public static void main(String[] args) {
    new FizzBuzzStage2().print(System.out);
  }

  public List<String> generate() {
    List<String> result = new ArrayList<String>();
    for (int i = 1; i<101; i++) {
      boolean fizz = is(i, 3);
      boolean buzz = is(i, 5);

      if (fizz && buzz) {
        result.add("FizzBuzz");
      } else if (fizz) {
        result.add("Fizz");
      } else if (buzz) {
        result.add("Buzz");
      } else {
        result.add(Integer.toString(i));
      }
    }
    return result;
  }

  public void print(PrintStream out) {
    for (String s : generate()) {
      out.println(s);
    }
  }

  private boolean is(int i, int f) {
    if (i % f == 0) {
      return true;
    } else {
      while (i > 0) {
        if (i % 10 == f) {
          return true;
        }
        i = i / 10;
      }
      return false;
    }
  }
}
