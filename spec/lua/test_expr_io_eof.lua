-- Autogenerated from KST: please remove this line if doing any edits by hand!

local luaunit = require("luaunit")

require("expr_io_eof")

TestExprIoEof = {}

function TestExprIoEof:test_expr_io_eof()
    local r = ExprIoEof:from_file("src/fixed_struct.bin")

    luaunit.assertEquals(r.substream1.one, 1262698832)
    luaunit.assertNil(r.substream1.two)
    luaunit.assertEquals(r.substream2.one, 4294914349)
    luaunit.assertEquals(r.substream2.two, 1262698832)
end
