# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ExprToITrailingModule
using KaitaiStruct

@testset "ExprToITrailing test" begin
    r = ExprToITrailingModule.from_file("src/term_strz.bin")


    @test_throws ArgumentError r.to_i_r10
    @test r.to_i_r16 == 152517308
    @test_throws ArgumentError r.to_i_garbage
end