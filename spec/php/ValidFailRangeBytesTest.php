<?php
// Autogenerated from KST: please remove this line if doing any edits by hand!

namespace Kaitai\Struct\Tests;

class ValidFailRangeBytesTest extends TestCase {
    public function testValidFailRangeBytes() {
        $this->expectException(\Kaitai\Struct\Error\ValidationGreaterThanError::class);
        $r = ValidFailRangeBytes::fromFile(self::SRC_DIR_PATH . '/fixed_struct.bin');
    }
}
