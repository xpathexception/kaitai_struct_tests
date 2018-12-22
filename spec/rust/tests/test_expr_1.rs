// Autogenerated from KST: please remove this line if doing any edits by hand!

extern crate kaitai_struct;
extern crate rust;

use kaitai_struct::KaitaiStruct;
use rust::Expr1;

#[test]
fn test_expr_1() {
    if let Ok(r) = Expr1::from_file("src/str_encodings.bin") {
        assert_eq!(r.len_of_1, 10);
        assert_eq!(r.len_of_1_mod, 8);
        assert_eq!(r.str1, "Some ASC");
        assert_eq!(r.str1_len, 8);
    }
}