# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import TermBytesModule

@testset "TermBytes test" begin
    r = TermBytesModule.from_file("src/term_strz.bin")


    @test r.s1 == Vector{UInt8}([102, 111, 111])
    @test r.s2 == Vector{UInt8}([98, 97, 114])
    @test r.s3 == Vector{UInt8}([124, 98, 97, 122, 64])
end
