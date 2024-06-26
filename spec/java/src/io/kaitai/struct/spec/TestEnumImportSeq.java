// Autogenerated from KST: please remove this line if doing any edits by hand!

package io.kaitai.struct.spec;

import io.kaitai.struct.testformats.EnumImportSeq;
import io.kaitai.struct.testformats.Enum0;
import io.kaitai.struct.testformats.EnumDeep;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class TestEnumImportSeq extends CommonSpec {

    @Test
    public void testEnumImportSeq() throws Exception {
        EnumImportSeq r = EnumImportSeq.fromFile(SRC_DIR + "enum_0.bin");

        assertEquals(r.pet1(), Enum0.Animal.CAT);
        assertEquals(r.pet2(), EnumDeep.Container1.Container2.Animal.HARE);
    }
}
