// Autogenerated from KST: please remove this line if doing any edits by hand!

extern crate kaitai_struct;
extern crate rust;

use kaitai_struct::KaitaiStruct;
use rust::ExprBytesNonLiteral;

#[test]
fn test_expr_bytes_non_literal() {
    if let Ok(r) = ExprBytesNonLiteral::from_file("src/enum_negative.bin") {

        assert_eq!(r.calc_bytes.len(), 2);
        assert_eq!(r.calc_bytes[0], 255);
        assert_eq!(r.calc_bytes[1], 1);
    }
}