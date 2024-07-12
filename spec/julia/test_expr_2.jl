# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import Expr2Module

@testset "Expr2 test" begin
    r = Expr2Module.from_file("src/str_encodings.bin")


    @test r.str1.len_orig == 10
    @test r.str1.len_mod == 7
    @test r.str1.str == "Some AS"
    @test r.str1_len == 7
    @test r.str1_len_mod == 7
    @test r.str1_byte1 == 73
    @test r.str1_avg == 73
    @test r.str1_char5 == "e"
    @test r.str1_tuple5.byte0 == 101
    @test r.str1_tuple5.byte0 == 101
    @test r.str1_tuple5.byte1 == 32
    @test r.str1_tuple5.byte2 == 65
    @test r.str1_tuple5.avg == 48
    @test r.str2_tuple5.byte0 == 101
    @test r.str2_tuple5.byte1 == 32
    @test r.str2_tuple5.byte2 == 65
    @test r.str2_tuple5.avg == 48
end