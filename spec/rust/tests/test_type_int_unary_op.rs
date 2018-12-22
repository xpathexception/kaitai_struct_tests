// Autogenerated from KST: please remove this line if doing any edits by hand!

extern crate kaitai_struct;
extern crate rust;

use kaitai_struct::KaitaiStruct;
use rust::TypeIntUnaryOp;

#[test]
fn test_type_int_unary_op() {
    if let Ok(r) = TypeIntUnaryOp::from_file("src/fixed_struct.bin") {
        assert_eq!(r.value_s2, 16720);
        assert_eq!(r.value_s8, 4706543082108963651);
        assert_eq!(r.unary_s2, -16720);
        assert_eq!(r.unary_s8, -4706543082108963651);
    }
}