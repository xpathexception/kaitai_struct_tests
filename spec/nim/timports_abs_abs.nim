# Autogenerated from KST: please remove this line if doing any edits by hand!

import os, streams, options, sequtils
import ../../compiled/nim/imports_abs_abs
import auxiliary/test_utils

let r = ImportsAbsAbs.fromFile("../../src/fixed_struct.bin")

assert r.one == 80
assert r.two.one == 65
assert r.two.two.one == 67