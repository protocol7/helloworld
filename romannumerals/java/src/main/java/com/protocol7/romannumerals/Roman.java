package com.protocol7.romannumerals;


public class Roman {

  enum Romans {
    M(1000), CM(900), D(500), CD(400),
    C(100),  XC(90),  L(50),  XL(40),
    X(10),   IX(9),   V(5),   IV(4),
    I(1);

    int i;

    Romans(int i) {
      this.i = i;
    }
  }

  public String i2r(int i) {
    StringBuilder sb = new StringBuilder();
    for (Romans roman : Romans.values()) {
      while (i >= roman.i) {
        sb.append(roman.name());
        i -= roman.i;
      }
    }
    return sb.toString();
  }
}
