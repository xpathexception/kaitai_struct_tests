# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ProcessRotateModule

@testset "ProcessRotate test" begin
    r = ProcessRotateModule.from_file("src/process_rotate.bin")


    @test r.buf1 == Vector{UInt8}([72, 101, 108, 108, 111])
    @test r.buf2 == Vector{UInt8}([87, 111, 114, 108, 100])
    @test r.buf3 == Vector{UInt8}([84, 104, 101, 114, 101])
end