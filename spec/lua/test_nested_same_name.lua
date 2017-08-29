local luaunit = require("luaunit")

require("nested_same_name")

TestNestedSameName = {}

function TestNestedSameName:test_nested_same_name()
    local r = NestedSameName:from_file("src/repeat_n_struct.bin")

    luaunit.assertEquals(r.main_data.main_size, 2)
    luaunit.assertEquals(r.main_data.foo.data, "\x10\000\000\000")
end