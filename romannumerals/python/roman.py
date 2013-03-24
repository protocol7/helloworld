#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

ROMAN = (("M", 1000), ("CM", 900), ("D", 500), ("CD", 400),
         ("C", 100),  ("XC", 90),  ("L", 50),  ("XL", 40),
         ("X", 10),   ("IX", 9),   ("V", 5),   ("IV", 4),
         ("I", 1))


def i2r(i):
    s = ""
    for r, a in ROMAN:
        while i >= a:
            s += r
            i -= a
    return s

if __name__ == "__main__":
    print(i2r(int(sys.argv[1])))
