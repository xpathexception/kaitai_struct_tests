# Autogenerated from KST: please remove this line if doing any edits by hand!

import unittest

from zlib_surrounded import _schema

class TestZlibSurrounded(unittest.TestCase):
    def test_zlib_surrounded(self):
        r = _schema.parse_file('src/zlib_surrounded.bin')

        self.assertEqual(r.zlib.inflated, -1)