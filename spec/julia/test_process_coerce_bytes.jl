# Autogenerated from KST: please remove this line if doing any edits by hand!

using Test
import ProcessCoerceBytesModule

@testset "ProcessCoerceBytes test" begin
    r = ProcessCoerceBytesModule.from_file("src/process_coerce_bytes.bin")


    @test r.records[1].flag == 0
    @test r.records[1].buf == Vector{UInt8}([65, 65, 65, 65])
    @test r.records[2].flag == 1
    @test r.records[2].buf == Vector{UInt8}([66, 66, 66, 66])
end
