# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import StrPadTermModule

@testset "StrPadTerm test" begin
    r = StrPadTermModule.from_file("src/str_pad_term.bin")


    @test r.str_pad == "str1"
    @test r.str_term == "str2foo"
    @test r.str_term_and_pad == "str+++3bar+++"
    @test r.str_term_include == "str4baz@"
end