-- Autogenerated from KST: please remove this line if doing any edits by hand!

local luaunit = require("luaunit")

require("term_strz_utf16_v2")

TestTermStrzUtf16V2 = {}

function TestTermStrzUtf16V2:test_term_strz_utf16_v2()
    local r = TermStrzUtf16V2:from_file("src/term_strz_utf16.bin")

    luaunit.assertEquals(r.s1, "a\u{0200}b")
    luaunit.assertEquals(r.s2, "c\u{0200}d\000")
    luaunit.assertEquals(r.s3, "e\u{0200}f")
end
