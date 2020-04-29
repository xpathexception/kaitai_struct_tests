// Autogenerated from KST: please remove this line if doing any edits by hand!

extern crate kaitai_struct;
extern crate rust;

use kaitai_struct::KaitaiStruct;
use rust::TypeTernary2ndFalsy;

#[test]
fn test_type_ternary_2nd_falsy() {
    if let Ok(r) = TypeTernary2ndFalsy::from_file("src/switch_integers.bin") {

        assert_eq!(r.v_false, false);
        assert_eq!(r.v_int_zero, 0);
        assert_eq!(r.v_int_neg_zero, -0);
        assert_eq!(r.v_float_zero, 0.0);
        assert_eq!(r.v_float_neg_zero, -0.0);
        assert_eq!(r.v_str_w_zero, "0");
        assert_eq!(r.v_str_w_zero.len(), 1);
        assert_eq!(r.ut.m, 7);
        assertNull(r.v_null_ut);
        assertNull(r.v_null_ut_inst);
        assert_eq!(r.v_str_empty, "");
        assert_eq!(r.v_str_empty.len(), 0);
        assert_eq!(r.int_array.len(), 2);
        assert_eq!(r.v_int_array_empty.len(), 0);
    }
}
