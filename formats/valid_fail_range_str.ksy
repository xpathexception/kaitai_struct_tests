meta:
  id: valid_fail_range_str
  encoding: ASCII
seq:
  - id: foo
    size: 2
    type: str
    valid:
      min: '"H@"'
      max: '"O~"' # there is actually [80, 65] in the file
