# Autogenerated from KST: please remove this line if doing any edits by hand!

load_err = nil
begin
  require 'valid_optional_id'
rescue SyntaxError => e
  load_err = e
  ValidOptionalId = nil
rescue LoadError => e
  load_err = e
  ValidOptionalId = nil
end

RSpec.describe ValidOptionalId do
  it 'parses test properly' do
    raise load_err if ValidOptionalId.nil?
    r = ValidOptionalId.from_file('src/fixed_struct.bin')

  end
end