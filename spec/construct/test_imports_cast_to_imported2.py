# Autogenerated from KST: please remove this line if doing any edits by hand!

import unittest

from imports_cast_to_imported2 import _schema

class TestImportsCastToImported2(unittest.TestCase):
    def test_imports_cast_to_imported2(self):
        r = _schema.parse_file('src/process_xor_4.bin')

        self.assertEqual(r.hw.one, 236)
        self.assertEqual(r.two.hw.one, 236)