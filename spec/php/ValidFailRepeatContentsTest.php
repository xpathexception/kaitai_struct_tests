<?php
// Autogenerated from KST: please remove this line if doing any edits by hand!

namespace Kaitai\Struct\Tests;

class ValidFailRepeatContentsTest extends TestCase {
    public function testValidFailRepeatContents() {
        $this->expectException(\Kaitai\Struct\Error\ValidationNotEqualError::class);
        $r = ValidFailRepeatContents::fromFile(self::SRC_DIR_PATH . '/bcd_user_type_be.bin');
    }
}