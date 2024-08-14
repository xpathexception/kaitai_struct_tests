# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ParamsPassArrayIntModule

@testset "ParamsPassArrayInt test" begin
    r = ParamsPassArrayIntModule.from_file("src/position_to_end.bin")


    @test Base.size(r.pass_ints.nums, 1) == 3
    @test r.pass_ints.nums[1] == 513
    @test r.pass_ints.nums[2] == 1027
    @test r.pass_ints.nums[3] == 1541
    @test Base.size(r.pass_ints_calc.nums, 1) == 2
    @test r.pass_ints_calc.nums[1] == 27643
    @test r.pass_ints_calc.nums[2] == 7
end
