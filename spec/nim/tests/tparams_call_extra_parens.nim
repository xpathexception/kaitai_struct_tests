# Autogenerated from KST: please remove this line if doing any edits by hand!

import os, streams, options, sequtils
import ../../../compiled/nim/params_call_extra_parens

let r = ParamsCallExtraParens.fromFile("src/term_strz.bin")

doAssert(r.buf1.body == string("foo|b"))