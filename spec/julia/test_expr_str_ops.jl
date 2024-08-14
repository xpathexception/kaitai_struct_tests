# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ExprStrOpsModule

@testset "ExprStrOps test" begin
    r = ExprStrOpsModule.from_file("src/term_strz.bin")


    @test r.one == "foo|b"
    @test r.one_len == 5
    @test r.one_rev == "b|oof"
    @test r.one_substr_0_to_3 == "foo"
    @test r.one_substr_2_to_5 == "o|b"
    @test r.one_substr_3_to_3 == ""
    @test r.two == "0123456789"
    @test r.two_len == 10
    @test r.two_rev == "9876543210"
    @test r.two_substr_0_to_7 == "0123456"
    @test r.two_substr_4_to_10 == "456789"
    @test r.two_substr_0_to_10 == "0123456789"
    @test r.to_i_attr == 9173
    @test r.to_i_r10 == -72
    @test r.to_i_r2 == 86
    @test r.to_i_r8 == 465
    @test r.to_i_r16 == 18383
end
