# Autogenerated from KST: please remove this line if doing any edits by hand!

import os, streams, options, sequtils
import ../../../compiled/nim/zlib_surrounded

let r = ZlibSurrounded.fromFile("src/zlib_surrounded.bin")

doAssert(r.zlib.inflated == int32(-1))