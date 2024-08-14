# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import BcdUserTypeBeModule

@testset "BcdUserTypeBe test" begin
    r = BcdUserTypeBeModule.from_file("src/bcd_user_type_be.bin")


    @test r.ltr.as_int == 12345678
    @test r.ltr.as_str == "12345678"
    @test r.rtl.as_int == 87654321
    @test r.rtl.as_str == "87654321"
    @test r.leading_zero_ltr.as_int == 123456
    @test r.leading_zero_ltr.as_str == "00123456"
end
