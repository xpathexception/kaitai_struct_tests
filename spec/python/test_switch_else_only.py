# Autogenerated from KST: please remove this line if doing any edits by hand!

import unittest

from switch_else_only import SwitchElseOnly

class TestSwitchElseOnly(unittest.TestCase):
    def test_switch_else_only(self):
        with SwitchElseOnly.from_file('src/switch_opcodes.bin') as r:

            self.assertEqual(r.opcode, 83)
            self.assertEqual(r.prim_byte, 102)
            self.assertEqual(r.struct.value, b"\x72\x00\x49\x42")
