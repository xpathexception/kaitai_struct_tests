# Autogenerated from KST: please remove this line if doing any edits by hand!

require 'switch_else_only'

RSpec.describe SwitchElseOnly do
  it 'parses test properly' do
    r = SwitchElseOnly.from_file('src/switch_opcodes.bin')

    expect(r.opcode).to eq 83
    expect(r.prim_byte).to eq 102
    expect(r.struct.value).to eq [114, 0, 73, 66].pack('C*')
  end
end
