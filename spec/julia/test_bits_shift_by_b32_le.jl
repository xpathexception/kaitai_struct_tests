# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import BitsShiftByB32LeModule

@testset "BitsShiftByB32Le test" begin
    r = BitsShiftByB32LeModule.from_file("src/bits_shift_by_b32_le.bin")


    @test r.a == 4294967295
    @test r.b == 0
end
