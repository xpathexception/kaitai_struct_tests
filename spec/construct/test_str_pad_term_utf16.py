# Autogenerated from KST: please remove this line if doing any edits by hand!

import unittest

from str_pad_term_utf16 import _schema

class TestStrPadTermUtf16(unittest.TestCase):
    def test_str_pad_term_utf16(self):
        r = _schema.parse_file('src/str_pad_term_utf16.bin')

        self.assertEqual(r.str_term, u"a\u0200b")
        self.assertEqual(r.str_term_include, u"c\u0200d\000")
        self.assertEqual(r.str_term_and_pad, u"e\u0200f")
