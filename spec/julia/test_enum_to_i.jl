# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import EnumToIModule

@testset "EnumToI test" begin
    r = EnumToIModule.from_file("src/enum_0.bin")


    @test r.pet_1 == EnumToIModule.enum_to_i_animal__cat
    @test r.pet_2 == EnumToIModule.enum_to_i_animal__chicken
    @test r.pet_1_i == 7
    @test r.pet_1_i_to_s == "7"
    @test r.pet_1_mod == 32775
    @test r.one_lt_two == true
    @test r.pet_1_eq_int == true
    @test r.pet_2_eq_int == false
end
