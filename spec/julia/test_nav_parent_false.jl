# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import NavParentFalseModule

@testset "NavParentFalse test" begin
    r = NavParentFalseModule.from_file("src/nav_parent_codes.bin")


    @test r.child_size == 3
    @test r.element_a.foo.code == 73
    @test r.element_a.foo.more == Vector{UInt8}([49, 50, 51])
    @test r.element_a.bar.foo.code == 66
    @test r.element_b.foo.code == 98
end
