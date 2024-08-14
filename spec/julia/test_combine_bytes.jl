# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import CombineBytesModule

@testset "CombineBytes test" begin
    r = CombineBytesModule.from_file("src/term_strz.bin")


    @test r.bytes_term == Vector{UInt8}([102, 111, 111])
    @test r.bytes_limit == Vector{UInt8}([98, 97, 114, 124])
    @test r.bytes_eos == Vector{UInt8}([98, 97, 122, 64])
    @test r.bytes_calc == Vector{UInt8}([82, 110, 68])
    @test r.term_or_limit == Vector{UInt8}([102, 111, 111])
    @test r.term_or_eos == Vector{UInt8}([98, 97, 122, 64])
    @test r.term_or_calc == Vector{UInt8}([102, 111, 111])
    @test r.limit_or_eos == Vector{UInt8}([98, 97, 114, 124])
    @test r.limit_or_calc == Vector{UInt8}([82, 110, 68])
    @test r.eos_or_calc == Vector{UInt8}([98, 97, 122, 64])
end
