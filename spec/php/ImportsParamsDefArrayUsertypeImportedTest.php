<?php
// Autogenerated from KST: please remove this line if doing any edits by hand!

namespace Kaitai\Struct\Tests;

class ImportsParamsDefArrayUsertypeImportedTest extends TestCase {
    public function testImportsParamsDefArrayUsertypeImported() {
        $r = ImportsParamsDefArrayUsertypeImported::fromFile(self::SRC_DIR_PATH . '/process_xor_4.bin');

        $this->assertSame(2, count($r->hws()));
        $this->assertSame(236, $r->hws()[0]->one());
        $this->assertSame(187, $r->hws()[1]->one());
        $this->assertSame(236, $r->two()->hw0One());
        $this->assertSame(187, $r->two()->hw1One());
    }
}
