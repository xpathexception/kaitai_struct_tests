<?php
namespace Kaitai\Struct\Tests;

class ProcessCoerceSwitchTest extends TestCase {
    public function testProcessCoerceSwitch() {
        $r = ProcessCoerceSwitch::fromFile(self::SRC_DIR_PATH . "/process_coerce_switch.bin");

        $this->assertEquals(0, $r->bufType);
        $this->assertEquals(0, $r->flag);
        $this->assertEquals("AAAA", $r->buf->foo);
    }
}