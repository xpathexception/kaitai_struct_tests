# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import IoLocalVarModule

@testset "IoLocalVar test" begin
    r = IoLocalVarModule.from_file("src/full256.bin")


    @test r.skip == Vector{UInt8}([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19])
    @test r.followup == 20
end
