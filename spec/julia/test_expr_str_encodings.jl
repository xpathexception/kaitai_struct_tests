# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ExprStrEncodingsModule

@testset "ExprStrEncodings test" begin
    r = ExprStrEncodingsModule.from_file("src/str_encodings.bin")


    @test r.str1_eq == true
    @test r.str2_eq == true
    @test r.str3_eq == true
    @test r.str3_eq_str2 == true
    @test r.str4_eq == true
    @test r.str4_gt_str_calc == true
    @test r.str4_gt_str_from_bytes == true
end