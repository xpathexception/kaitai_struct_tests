# Autogenerated from KST: please remove this line if doing any edits by hand!

import unittest
from valid_fail_repeat_eq_int import ValidFailRepeatEqInt
import kaitaistruct

class TestValidFailRepeatEqInt(unittest.TestCase):
    def test_valid_fail_repeat_eq_int(self):
        with self.assertRaises(kaitaistruct.ValidationNotEqualError):
            with ValidFailRepeatEqInt.from_file('src/bcd_user_type_be.bin') as r:
                pass