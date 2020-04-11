local luaunit = require("luaunit")

require("imports_abs_abs")

TestImportsAbsAbs = {}

function TestImportsAbsAbs:test_imports_abs_abs()
    local r = ImportsAbsAbs:from_file("src/fixed_struct.bin")

    luaunit.assertEquals(r.one, 80)
    luaunit.assertEquals(r.two.one, 65)
    luaunit.assertEquals(r.two.two.one, 67)
end
